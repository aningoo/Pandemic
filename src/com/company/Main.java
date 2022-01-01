package com.company;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

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
    private boolean activeGame = true;

    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_BLACK = "\u001B[30m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_PURPLE = "\u001B[35m";
    public static final String TEXT_CYAN = "\u001B[36m";
    public static final String TEXT_WHITE = "\u001B[37m";


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

        InfectionCards.BAG.neighbours.get(0).count.getAndIncrement();
        InfectionCards.MUM.neighbours.get(0).count.getAndIncrement();
        System.out.println(InfectionCards.KAR.count);

        Collections.shuffle(main.infectionDeck);
        System.out.println("### SETUP PHASE PANDEMIC ###");

        for (int cubes = 3; cubes > 0; cubes--) {
            System.out.println(cubes + " cubes on: ");
            for (int drawn =0; drawn < 3; drawn++) {
                main.draw();
            }

        }

        System.out.println("### PRESS ANY KEY TO START GAME ###");
        main.scanner.nextLine();
        main.startTime = LocalDateTime.now();

        while(main.activeGame) {
            System.out.println("Turn: " + main.turnCounter +
                    '\t' + '\t' + "EP: EPIDEMIC" +
                    '\t' + '\t' + " D: DRAW"  +
                    '\t' + '\t' + " 3: DISCARD PILE STATS"  +
                    '\t' + '\t' + " 99: END"  +
                    '\t' + '\t' + "Current infection rate: " + main.infectionRate);
            String input = main.scanner.nextLine();

            // draw logica
            switch(input) {
                case "EP":
                    main.epidemic();
                    break;
                case "D":
                    for (int drawn = 0; drawn < main.infectionRate; drawn++) {
                        main.draw();
                    }
                    System.out.println("##### END OF TURN: " + main.turnCounter + " #####");
                    main.turnCounter++;
                    break;
                case "3":
                    main.stats();
                    break;
                case "99":
                    main.end();
                    main.activeGame=false;
            }

            main.calculate();

        }
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

        float numberOfYellowCards = calculatePile.stream().filter(infectionCards -> infectionCards.color.equals(Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET)).count();
        float numberOfRedCards = calculatePile.stream().filter(infectionCards -> infectionCards.color.equals(Main.TEXT_RED + "RED" + Main.TEXT_RESET)).count();
        float numberOfBlackCards = calculatePile.stream().filter(infectionCards -> infectionCards.color.equals(Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET)).count();
        float numberOfBlueCards = calculatePile.stream().filter(infectionCards -> infectionCards.color.equals(Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET)).count();

        System.out.println("");
        System.out.printf(TEXT_YELLOW + "Probability yellow: %.2f%%" + TEXT_RESET + " \n", numberOfYellowCards / pileSize * 100);
        System.out.printf(TEXT_RED + "Probability red: %.2f%%" + TEXT_RESET +" \n", numberOfRedCards / pileSize * 100);
        System.out.printf(TEXT_BLACK + "Probability black: %.2f%%" + TEXT_RESET +" \n", numberOfBlackCards / pileSize * 100);
        System.out.printf(TEXT_BLUE + "Probability blue: %.2f%%" + TEXT_RESET +" \n", numberOfBlueCards / pileSize * 100);
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

    private void draw() throws InterruptedException {
        scanner.nextLine();
        InfectionCards retrievedCard = infectionDeck.get(0);
        retrievedCard.count.getAndIncrement();
        if (retrievedCard.equals(cursor)){
            cursor= null;
        }
        System.out.println("Card drawn: " + retrievedCard);
        discardPile.add(retrievedCard);
        infectionDeck.remove(retrievedCard);
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
