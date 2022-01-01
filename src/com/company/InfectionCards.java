package com.company;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public enum InfectionCards {
    ATL("ATLANTA", Constants.BLUE, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    ALG("ALGIERS", Constants.BLACK, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    BAN("BANGKOK", Constants.RED, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    BOG("BOGOTA", Constants.YELLOW, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    BAG("BAGHDAD", Constants.BLACK, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    BEI("BEIJING", Constants.RED, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    BUE("BUENOS AIRES", Constants.YELLOW, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    CHI("CHICAGO", Constants.BLUE, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    CAI("CAIRO", Constants.BLACK, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    CHE("CHENNAI", Constants.BLACK, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    DEL("DELHI", Constants.BLACK, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    LOS("LOS ANGELES", Constants.YELLOW, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    LAG("LAGOS", Constants.YELLOW, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    LON("LONDON", Constants.BLUE, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    LIM("LIMA", Constants.YELLOW, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    MAD("MADRID", Constants.BLUE, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    MIL("MILAN", Constants.BLUE, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    MON("MONTREAL", Constants.BLUE, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    MOS("MOSCOW", Constants.BLACK, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    MUM("MUMBAI", Constants.BLACK, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    MIA("MIAMI", Constants.YELLOW, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    MAN("MANILLA", Constants.RED, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    MEX("MEXICO CITY", Constants.YELLOW, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    IST("ISTANBUL", Constants.BLACK, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    HOC("HO CHI MIN CITY", Constants.RED, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    HON("HONG KONG", Constants.RED, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    TAI("TAIPEI", Constants.RED, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    TEH("TEHRAN", Constants.BLACK, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    TOK("TOKIO", Constants.RED, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    OSA("OSAKA", Constants.RED, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    PAR("PARIS", Constants.BLUE, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    SYD("SYDNEY", Constants.RED, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    SHA("SHANGHAI", Constants.RED, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    STP("ST. PETERSBURG", Constants.BLUE, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    SEO("SEOUL", Constants.RED, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    SANT("SANTIAGO", Constants.YELLOW, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    SANF("SAN FRANSISCO", Constants.BLUE, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    SAO("SAO PAOLO", Constants.YELLOW, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    NEW("NEW YORK", Constants.BLUE, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    KOL("KOLKATA", Constants.BLACK, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    KHA("KHARTOUM", Constants.YELLOW, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    KIN("KINSHASA", Constants.YELLOW, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    ESS("ESSEN", Constants.BLUE, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    JAK("JAKARTA", Constants.RED, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    JOH("JOHANNESBURG", Constants.YELLOW, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    KAR("KARACHI", Constants.BLACK, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    RIY("RIYADH", Constants.BLACK, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(), false),
    WAS("WASHINGTON", Constants.BLUE, new AtomicInteger(0), new ArrayList<>(), new ArrayList<Cube>(),false);

    public final String cityName;
    public final String color;
    public final AtomicInteger count;
    public final ArrayList<InfectionCards> neighbours;
    public ArrayList<Cube> cubes;
    public boolean outbreakShield;

    InfectionCards(String cityName, String color, AtomicInteger count, ArrayList<InfectionCards> neighbours, ArrayList<Cube> cubes,boolean outbreakShield) {
        this.cityName = cityName;
        this.color = color;
        this.count = count;
        this.neighbours = neighbours;
        this.cubes = cubes;
        this.outbreakShield = outbreakShield;
    }

    public void addCube(int amount, String color) {
        if (countCubesOfColor(color) < 3) {

            // 2
            for (int added = 0; added<amount; added++){
                cubes.add(new Cube(color));;
                System.out.printf("Add %s cubes on: %s \n", color, this.cityName);
            }

            if (countCubesOfColor(color) > 3) {
                int amountToRemove = countCubesOfColor(color) - 3;
                this.removeCube(amountToRemove, color);
                this.outbreak();
            }
        } else {
            //todo commentje
            this.outbreak();
        }
    }

    private int countCubesOfColor(String color){
        return cubes.stream().filter(cube -> cube.color.equals(color)).toList().size();
    }

    public void removeCube(int amount, String color) {
        if (countCubesOfColor(color) > 0) {
            for (int removed = 0; removed < amount; removed++) {
                for (Cube cube : cubes) {
                    if (cube.color.equals(color)) {
                        cubes.remove(cube);
                        System.out.printf("Removing %d cubes from %s \n", amount, this.cityName);
                        System.out.printf("Total cubes on %s is: %d",this.cityName, this.cubes.size());

                        break;
                    }
                }
            }
        }
    }

    public void outbreak() {
        outbreakShield = true;
        Main.outbreakCounter++;
        System.err.printf("### OUTBREAK DETECTED ON %s ### \n", this.cityName);
        System.err.printf("### OUTBREAK COUNTER: %d ### \n", Main.outbreakCounter);
        for (InfectionCards neighbour : neighbours) {
            if (!neighbour.outbreakShield) {
                neighbour.addCube(1, this.color);
            }
        }
    }

    @Override
    public String toString() {
        return "{" +
                "cityName='" + cityName + '\'' +
                ", color='" + color + '\'' +
                ", count='" + count + '\'' +
                '}';
    }
    public String toStringClean() {
        return "{" +
                "cityName='" + cityName + '\'' +
                ", count='" + count + '\'' +
                '}';
    }


}
