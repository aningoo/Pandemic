package com.company;

import java.util.*;
import java.util.function.Predicate;

public class Main {

    //TODO
    // end game stats
    // stats options
    // game setup infection
    // eventcards

    Random r = new Random();
    Scanner scanner = new Scanner(System.in);

    private int epidemicCardsDrawn = 0;
    private int infectionRate = 2;

    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_BLACK = "\u001B[30m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_PURPLE = "\u001B[35m";
    public static final String TEXT_CYAN = "\u001B[36m";
    public static final String TEXT_WHITE = "\u001B[37m";


    ArrayList<InfectionCards> initPile = new ArrayList<>(Arrays.asList(InfectionCards.values()));
    ArrayList<InfectionCards> discardPile = new ArrayList<>();
    ArrayList<InfectionCards> activePile = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        System.out.println("### START PANDEMIC HELPER ###");
        while(true) {
            System.out.println("1: EPIDEMIC" + '\t' + '\t' + " 2: DRAW"  + '\t' + '\t' + "Current infection rate: " + main.infectionRate);
            String input = main.scanner.nextLine();

            // draw logica
            switch(input) {
                case "1":
                    main.epidemic();
                    break;
                case "2":
                    for (int drawn = 0; drawn < main.infectionRate; drawn++) {
                        main.draw();
                    }
                    break;
            }

            if (!main.activePile.isEmpty()){
                main.calculate(main.activePile);
            } else {
                main.calculate(main.initPile);
            }

        }
    }

    private void calculate(ArrayList<InfectionCards> currentPile){
        float pileSize = currentPile.size();
        float oddPerCard =  1 / pileSize;

        float numberOfYellowCards = currentPile.stream().filter(infectionCards -> infectionCards.color.equals(Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET)).count();
        float numberOfRedCards = currentPile.stream().filter(infectionCards -> infectionCards.color.equals(Main.TEXT_RED + "RED" + Main.TEXT_RESET)).count();
        float numberOfBlackCards = currentPile.stream().filter(infectionCards -> infectionCards.color.equals(Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET)).count();
        float numberOfBlueCards = currentPile.stream().filter(infectionCards -> infectionCards.color.equals(Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET)).count();

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
        InfectionCards retrievedCard = initPile.get(r.nextInt(initPile.size() - 1));
        initPile.remove(retrievedCard);
        System.out.println("3 CUBES ON: " + retrievedCard);
        discardPile.add(retrievedCard);
        activePile.addAll(discardPile);
        discardPile.clear();
    }

    private void draw() throws InterruptedException {
        scanner.nextLine();
        if (activePile.isEmpty()) {
            int x = r.nextInt(initPile.size());
            InfectionCards retrievedCard = initPile.get(x);
            System.out.println("Card drawn: " + retrievedCard);
            discardPile.add(retrievedCard);
            initPile.remove(retrievedCard);
    } else {
            int x = r.nextInt(activePile.size());
            InfectionCards retrievedCard = activePile.get(x);
            System.out.println("Card drawn: " + retrievedCard);

            discardPile.add(retrievedCard);
            activePile.remove(retrievedCard);        }
    }
}
