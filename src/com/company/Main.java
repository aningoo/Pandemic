package com.company;

import java.util.*;
import java.util.function.Predicate;

public class Main {

    Random r = new Random();
    Scanner scanner = new Scanner(System.in);

    private int epidemicCardsDrawn = 0;
    private int infectionRate = 2;

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

        float numberOfYellowCards = currentPile.stream().filter(infectionCards -> infectionCards.color.equals("YELLOW")).count();
        float numberOfRedCards = currentPile.stream().filter(infectionCards -> infectionCards.color.equals("RED")).count();
        float numberOfBlackCards = currentPile.stream().filter(infectionCards -> infectionCards.color.equals("BLACK")).count();
        float numberOfBlueCards = currentPile.stream().filter(infectionCards -> infectionCards.color.equals("BLUE")).count();

        System.out.printf("Probability yellow: %.2f%% \n", numberOfYellowCards / pileSize * 100);
        System.out.printf("Probability red: %.2f%% \n", numberOfRedCards / pileSize * 100);
        System.out.printf("Probability black: %.2f%% \n", numberOfBlackCards / pileSize * 100);
        System.out.printf("Probability blue: %.2f%% \n", numberOfBlueCards / pileSize * 100);
        System.out.printf("Probability specific card: %.2f%% \n", oddPerCard * 100);
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
