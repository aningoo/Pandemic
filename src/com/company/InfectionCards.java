package com.company;

import java.util.concurrent.atomic.AtomicInteger;

public enum InfectionCards {
    ATL("ATLANTA", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET, new AtomicInteger(0)),
    ALG("ALGIERS", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET, new AtomicInteger(0)),
    BAN("BANGKOK", Main.TEXT_RED + "RED" + Main.TEXT_RESET, new AtomicInteger(0)),
    BOG("BOGOTA", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET, new AtomicInteger(0)),
    BAG("BAGHDAD", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET, new AtomicInteger(0)),
    BEI("BEIJING", Main.TEXT_RED + "RED" + Main.TEXT_RESET, new AtomicInteger(0)),
    BUE("BUENOS AIRES", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET, new AtomicInteger(0)),
    CHI("CHICAGO", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET, new AtomicInteger(0)),
    CAI("CAIRO", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET, new AtomicInteger(0)),
    CHE("CHENNAI", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET, new AtomicInteger(0)),
    DEL("DELHI", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET, new AtomicInteger(0)),
    LOS("LOS ANGELES", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET, new AtomicInteger(0)),
    LAG("LAGOS", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET, new AtomicInteger(0)),
    LON("LONDON", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET, new AtomicInteger(0)),
    LIM("LIMA", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET, new AtomicInteger(0)),
    MAD("MADRID", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET, new AtomicInteger(0)),
    MIL("MILAN", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET, new AtomicInteger(0)),
    MON("MONTREAL", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET, new AtomicInteger(0)),
    MOS("MOSCOW", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET, new AtomicInteger(0)),
    MUM("MUMBAI", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET, new AtomicInteger(0)),
    MIA("MIAMI", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET, new AtomicInteger(0)),
    MAN("MANILLA", Main.TEXT_RED + "RED" + Main.TEXT_RESET, new AtomicInteger(0)),
    MEX("MEXICO CITY", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET, new AtomicInteger(0)),
    IST("ISTANBUL", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET, new AtomicInteger(0)),
    HOC("HO CHI MIN CITY", Main.TEXT_RED + "RED" + Main.TEXT_RESET, new AtomicInteger(0)),
    HON("HONG KONG", Main.TEXT_RED + "RED" + Main.TEXT_RESET, new AtomicInteger(0)),
    TAI("TAIPEI", Main.TEXT_RED + "RED" + Main.TEXT_RESET, new AtomicInteger(0)),
    TEH("TEHRAN", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET, new AtomicInteger(0)),
    TOK("TOKIO", Main.TEXT_RED + "RED" + Main.TEXT_RESET, new AtomicInteger(0)),
    OSA("OSAKA", Main.TEXT_RED + "RED" + Main.TEXT_RESET, new AtomicInteger(0)),
    PAR("PARIS", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET, new AtomicInteger(0)),
    SYD("SYDNEY", Main.TEXT_RED + "RED" + Main.TEXT_RESET, new AtomicInteger(0)),
    SHA("SHANGHAI", Main.TEXT_RED + "RED" + Main.TEXT_RESET, new AtomicInteger(0)),
    STP("ST. PETERSBURG", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET, new AtomicInteger(0)),
    SEO("SEOUL", Main.TEXT_RED + "RED" + Main.TEXT_RESET, new AtomicInteger(0)),
    SANT("SANTIAGO", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET, new AtomicInteger(0)),
    SANF("SAN FRANSISCO", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET, new AtomicInteger(0)),
    SAO("SAO PAOLO", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET, new AtomicInteger(0)),
    NEW("NEW YORK", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET, new AtomicInteger(0)),
    KOL("KOLKATA", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET, new AtomicInteger(0)),
    KHA("KHARTOUM", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET, new AtomicInteger(0)),
    KIN("KINSHASA", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET, new AtomicInteger(0)),
    ESS("ESSEN", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET, new AtomicInteger(0)),
    JAK("JAKARTA", Main.TEXT_RED + "RED" + Main.TEXT_RESET, new AtomicInteger(0)),
    JOH("JOHANNESBURG", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET, new AtomicInteger(0)),
    KAR("KARACHI", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET, new AtomicInteger(0)),
    RIY("RIYADH", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET, new AtomicInteger(0)),
    WAS("WASHINGTON", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET, new AtomicInteger(0));

    public final String cityName;
    public final String color;
    public final AtomicInteger count;


    InfectionCards(String cityName, String color, AtomicInteger count) {
        this.cityName = cityName;
        this.color = color;
        this.count = count;
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
