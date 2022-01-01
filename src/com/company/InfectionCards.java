package com.company;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public enum InfectionCards {
    ATL("ATLANTA", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    ALG("ALGIERS", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    BAN("BANGKOK", Main.TEXT_RED + "RED" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    BOG("BOGOTA", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    BAG("BAGHDAD", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    BEI("BEIJING", Main.TEXT_RED + "RED" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    BUE("BUENOS AIRES", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    CHI("CHICAGO", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    CAI("CAIRO", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    CHE("CHENNAI", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    DEL("DELHI", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    LOS("LOS ANGELES", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    LAG("LAGOS", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    LON("LONDON", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    LIM("LIMA", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    MAD("MADRID", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    MIL("MILAN", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    MON("MONTREAL", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    MOS("MOSCOW", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    MUM("MUMBAI", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    MIA("MIAMI", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    MAN("MANILLA", Main.TEXT_RED + "RED" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    MEX("MEXICO CITY", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    IST("ISTANBUL", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    HOC("HO CHI MIN CITY", Main.TEXT_RED + "RED" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    HON("HONG KONG", Main.TEXT_RED + "RED" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    TAI("TAIPEI", Main.TEXT_RED + "RED" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    TEH("TEHRAN", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    TOK("TOKIO", Main.TEXT_RED + "RED" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    OSA("OSAKA", Main.TEXT_RED + "RED" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    PAR("PARIS", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    SYD("SYDNEY", Main.TEXT_RED + "RED" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    SHA("SHANGHAI", Main.TEXT_RED + "RED" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    STP("ST. PETERSBURG", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    SEO("SEOUL", Main.TEXT_RED + "RED" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    SANT("SANTIAGO", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    SANF("SAN FRANSISCO", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    SAO("SAO PAOLO", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    NEW("NEW YORK", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    KOL("KOLKATA", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    KHA("KHARTOUM", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    KIN("KINSHASA", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    ESS("ESSEN", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    JAK("JAKARTA", Main.TEXT_RED + "RED" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    JOH("JOHANNESBURG", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    KAR("KARACHI", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    RIY("RIYADH", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>()),
    WAS("WASHINGTON", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET, new AtomicInteger(0), new ArrayList<>());

    public final String cityName;
    public final String color;
    public final AtomicInteger count;
    public final ArrayList<InfectionCards> neighbours;

    InfectionCards(String cityName, String color, AtomicInteger count, ArrayList<InfectionCards> neighbours) {
        this.cityName = cityName;
        this.color = color;
        this.count = count;
        this.neighbours = neighbours;
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
