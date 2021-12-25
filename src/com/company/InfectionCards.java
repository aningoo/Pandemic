package com.company;

public enum InfectionCards {
    ATL("ATLANTA", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET),
    ALG("ALGIERS", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET),
    BAN("BANGKOK", Main.TEXT_RED + "RED" + Main.TEXT_RESET),
    BOG("BOGOTA", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET),
    BAG("BAGHDAD", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET),
    BEI("BEIJING", Main.TEXT_RED + "RED" + Main.TEXT_RESET),
    BUE("BUENOS AIRES", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET),
    CHI("CHICAGO", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET),
    CAI("CAIRO", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET),
    CHE("CHENNAI", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET),
    DEL("DELHI", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET),
    LOS("LOS ANGELES", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET),
    LAG("LAGOS", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET),
    LON("LONDON", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET),
    LIM("LIMA", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET),
    MAD("MADRID", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET),
    MIL("MILAN", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET),
    MON("MONTREAL", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET),
    MOS("MOSCOW", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET),
    MUM("MUMBAI", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET),
    MIA("MIAMI", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET),
    MAN("MANILLA", Main.TEXT_RED + "RED" + Main.TEXT_RESET),
    MEX("MEXICO CITY", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET),
    IST("ISTANBUL", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET),
    HOC("HO CHI MIN CITY", Main.TEXT_RED + "RED" + Main.TEXT_RESET),
    HON("HONG KONG", Main.TEXT_RED + "RED" + Main.TEXT_RESET),
    TAI("TAIPEI", Main.TEXT_RED + "RED" + Main.TEXT_RESET),
    TEH("TEHRAN", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET),
    TOK("TOKIO", Main.TEXT_RED + "RED" + Main.TEXT_RESET),
    OSA("OSAKA", Main.TEXT_RED + "RED" + Main.TEXT_RESET),
    PAR("PARIS", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET),
    SYD("SYDNEY", Main.TEXT_RED + "RED" + Main.TEXT_RESET),
    SHA("SHANGHAI", Main.TEXT_RED + "RED" + Main.TEXT_RESET),
    STP("ST. PETERSBURG", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET),
    SEO("SEOUL", Main.TEXT_RED + "RED" + Main.TEXT_RESET),
    SANT("SANTIAGO", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET),
    SANF("SAN FRANSISCO", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET),
    SAO("SAO PAOLO", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET),
    NEW("NEW YORK", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET),
    KOL("KOLKATA", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET),
    KHA("KHARTOUM", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET),
    KIN("KINSHASA", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET),
    ESS("ESSEN", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET),
    JAK("JAKARTA", Main.TEXT_RED + "RED" + Main.TEXT_RESET),
    JOH("JOHANNESBURG", Main.TEXT_YELLOW + "YELLOW" + Main.TEXT_RESET),
    KAR("KARACHI", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET),
    RIY("RIYADH", Main.TEXT_BLACK + "BLACK" + Main.TEXT_RESET),
    WAS("WASHINGTON", Main.TEXT_BLUE + "BLUE" + Main.TEXT_RESET);

    public final String cityName;
    public final String color;


    InfectionCards(String cityName, String color) {
        this.cityName = cityName;
        this.color = color;
    }

    @Override
    public String toString() {
        return "{" +
                "cityName='" + cityName + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


}
