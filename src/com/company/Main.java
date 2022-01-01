package com.company;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

public class Main {

    //TODO
    // current turn's character
    // cards drawn in between epidemics
    // revert
    // eventcards

    Random r = new Random();
    Scanner scanner = new Scanner(System.in);

    private int epidemicCardsDrawn = 0;
    private int infectionRate = 2;
    private int turnCounter = 1;
    public static int outbreakCounter = 0;
    private boolean activeGame = true;


    ArrayList<InfectionCards> infectionDeck = new ArrayList<>(Arrays.asList(InfectionCards.values()));
    ArrayList<InfectionCards> discardPile = new ArrayList<>();
    ArrayList<InfectionCards> calculatePile;
    InfectionCards cursor;
    LocalDateTime startTime;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    DateTimeFormatter titleFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HHmmss");


    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        InitNeighbours init = new InitNeighbours();
        init.init();

        Collections.shuffle(main.infectionDeck);
        System.out.println("### SETUP PHASE PANDEMIC ###");

        for (int cubes = 3; cubes > 0; cubes--) {
            System.out.println(cubes + " cubes on: ");
            for (int drawn =0; drawn < 3; drawn++) {
                InfectionCards drawnCard = main.draw();
                drawnCard.addCube(cubes, drawnCard.color);
            }

        }

        System.out.println("### PRESS ANY KEY TO START GAME ###");
        main.scanner.nextLine();
        main.startTime = LocalDateTime.now();

        while(main.activeGame) {
            //todo fix analysis
//            main.analysis();

            //remove outbreak shield
            main.infectionDeck.forEach(infectionCards -> infectionCards.outbreakShield = false);
            main.discardPile.forEach(discardedCards -> discardedCards.outbreakShield = false);

            if (outbreakCounter >= 8) {
                main.activeGame = false;
                main.end();
                break;
            }

            System.out.println("Turn: " + main.turnCounter +
                    '\t' + '\t' + " p: EPIDEMIC" +
                    '\t' + '\t' + " d: DRAW"  +
                    '\t' + '\t' + " r: REMOVE 1 CUBE"  +
                    '\t' + '\t' + " 1: DISCARD PILE STATS"  +
                    '\t' + '\t' + " 99: END"  +
                    '\t' + '\t' + "Current infection rate: " + main.infectionRate);
            String input = main.scanner.nextLine();
            //disable outbreak shield after turn finish
            switch(input) {
                case "debug_add":
                    System.out.println("Enter city code:");
                    String cityCode = main.scanner.nextLine();
                    InfectionCards drawnCard = InfectionCards.valueOf(cityCode.toUpperCase());
                    drawnCard.addCube(1, drawnCard.color);
                    break;
                case "r":
                    try {
                        System.out.println("Enter city code:");
                        String cityCode2 = main.scanner.nextLine();
                        System.out.println("Enter color of cube:");
                        String color = main.scanner.nextLine();

                        InfectionCards retrieved=InfectionCards.valueOf(cityCode2.toUpperCase());
                        if (color.isBlank()){
                            retrieved.removeCube(1, retrieved.color);
                        } else {
                            String retrievedColor = Constants.getColor(color);
                            retrieved.removeCube(1, retrievedColor);
                        }

                    } catch (IllegalArgumentException e){
                        System.err.println("INVALID INPUT");
                    }
                    break;
                case "p":
                    main.epidemic();
                    break;
                case "d":
                    for (int drawn = 0; drawn < main.infectionRate; drawn++) {
                        InfectionCards drawnCard1 = main.draw();
                        drawnCard1.addCube(1, drawnCard1.color);
                    }
                    System.out.println("##### END OF TURN: " + main.turnCounter + " #####");
                    main.turnCounter++;
                    break;
                case "1":
                    main.stats();
                    break;
                case "99":
                    main.end();
                    main.activeGame=false;
            }

            main.calculate();

        }
    }

    private void analysis() {
        ArrayList<InfectionCards> analysisList = new ArrayList<>();
        for (InfectionCards infectionCard : infectionDeck) {
            if (infectionCard.cubes.stream().filter(cube -> cube.color == infectionCard.color).toList().size() == 3) {
                analysisList.add(infectionCard);
            }
        }

        for (InfectionCards infectionCards: analysisList){
           List<InfectionCards> x= (List<InfectionCards>) infectionCards.neighbours.clone();
           ArrayList<Cube> copyCubes = new ArrayList<Cube>(x.get(0).cubes);


            System.out.println("");
          // x.stream().filter(neighbour -> neighbour.cubes.)
        };
    }

    private Predicate<InfectionCards> hasThreeCubes(){
        return infectionCards -> infectionCards.cubes.size()==3;
    }

    private void checkNeighbours() {

    }

    private void calculate(){
        calculatePile=new ArrayList<>();
        if (cursor!= null) {
            for (InfectionCards infectionCards : infectionDeck) {
                calculatePile.add(infectionCards);
                if (infectionCards.equals(cursor)) {
                    break;
                }
            }
        } else {
            calculatePile = infectionDeck;
        }
        float pileSize = calculatePile.size();
        float oddPerCard =  1 / pileSize;

        float numberOfYellowCards = calculatePile.stream().filter(infectionCards -> infectionCards.color.equals(Constants.YELLOW)).count();
        float numberOfRedCards = calculatePile.stream().filter(infectionCards -> infectionCards.color.equals(Constants.RED)).count();
        float numberOfBlackCards = calculatePile.stream().filter(infectionCards -> infectionCards.color.equals(Constants.BLACK)).count();
        float numberOfBlueCards = calculatePile.stream().filter(infectionCards -> infectionCards.color.equals(Constants.BLUE)).count();

        System.out.println("");
        System.out.printf(Constants.TEXT_YELLOW + "Probability yellow: %.2f%%" + Constants.TEXT_RESET + " \n", numberOfYellowCards / pileSize * 100);
        System.out.printf(Constants.TEXT_RED + "Probability red: %.2f%%" + Constants.TEXT_RESET +" \n", numberOfRedCards / pileSize * 100);
        System.out.printf(Constants.TEXT_BLACK + "Probability black: %.2f%%" + Constants.TEXT_RESET +" \n", numberOfBlackCards / pileSize * 100);
        System.out.printf(Constants.TEXT_BLUE + "Probability blue: %.2f%%" + Constants.TEXT_RESET +" \n", numberOfBlueCards / pileSize * 100);
        System.out.println("");
//        System.out.printf("Probability specific card: %.2f%% \n", oddPerCard * 100);
    }

    private void epidemic(){
        epidemicCardsDrawn++;
        if (epidemicCardsDrawn == 3){
            infectionRate++;
        }
        if (epidemicCardsDrawn == 5) {
            infectionRate ++;
        }
        InfectionCards retrievedCard = infectionDeck.get(infectionDeck.size()-1);
        retrievedCard.count.getAndIncrement();
        retrievedCard.addCube(3, retrievedCard.color);
        infectionDeck.remove(retrievedCard);
        System.out.println("3 CUBES ON: " + retrievedCard);
        discardPile.add(retrievedCard);
        Collections.shuffle(discardPile);
        cursor = discardPile.get(0);

        for (InfectionCards infectionCards : discardPile) {
            infectionDeck.add(0, infectionCards);
        }
        discardPile.clear();
    }

    private InfectionCards draw() throws InterruptedException {
        scanner.nextLine();
        InfectionCards retrievedCard = infectionDeck.get(0);
        retrievedCard.count.getAndIncrement();
        if (retrievedCard.equals(cursor)){
            cursor= null;
        }
        System.out.println("Card drawn: " + retrievedCard);
        discardPile.add(retrievedCard);
        infectionDeck.remove(retrievedCard);
        return retrievedCard;
    }

    private void stats(){
        System.out.println("##### PRINTING STATS #####");
        for (InfectionCards infectionCards : discardPile) {
            if (infectionCards.count.get() > 0){
                System.out.println(infectionCards);
            }
        }
        System.out.println("##### END OF PRINTING STATS #####");
    }

    private void end(){
        System.out.println("ENDING GAME");

        int totalInfectionCityCardsDrawn = 0;
        int totalCount = 0;

        try (PrintWriter pw = new PrintWriter("endgame_stats-" + startTime.format(titleFormatter) + ".txt")) {
            pw.println("START TIME: \t \t " + startTime.format(formatter));
            pw.println("END TIME: \t \t \t " + LocalDateTime.now().format(formatter));
            pw.println("");
            pw.println("NUMBER OF TURNS: \t \t \t " + turnCounter);
            pw.println("EPIDEMICS DRAWN: \t \t \t " + epidemicCardsDrawn);
            pw.println("");

            for (InfectionCards discardedCard : discardPile) {
                infectionDeck.add(0, discardedCard);
            }

            for(int count = 20; count > 0; count--){
                for (InfectionCards infectionCards : infectionDeck) {
                    if (infectionCards.count.get() == count){
                        pw.println(infectionCards.toStringClean());
                        totalInfectionCityCardsDrawn++;
                        totalCount = totalCount + infectionCards.count.get();
                    }
                }
            }

//            for (InfectionCards infectionCards : infectionDeck) {
//                if (infectionCards.count.get() > 0){
//                    pw.println(infectionCards.toStringClean());
//                    totalInfectionCityCardsDrawn++;
//                    totalCount = totalCount + infectionCards.count.get();
//                }
//            }

            pw.println("");
            pw.println("Size: \t \t \t \t \t " + totalInfectionCityCardsDrawn);
            pw.println("Sum of count: \t \t \t " + totalCount);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
