package com.company;

public enum InfectionCards {
    ATL("ATLANTA", "BLUE"),
    ALG("ALGIERS", "BLACK"),
    BAN("BANGKOK", "RED"),
    BOG("BOGOTA", "YELLOW"),
    BAG("BAGHDAD", "BLACK"),
    BEI("BEIJING", "RED"),
    BUE("BUENOS AIRES", "YELLOW"),
    CHI("CHICAGO", "BLUE"),
    CAI("CAIRO", "BLACK"),
    CHE("CHENNAI", "BLACK"),
    DEL("DELHI", "BLACK"),
    LOS("LOS ANGELES", "YELLOW"),
    LAG("LAGOS", "YELLOW"),
    LON("LONDON", "BLUE"),
    LIM("LIMA", "YELLOW"),
    MAD("MADRID", "BLUE"),
    MIL("MILAN", "BLUE"),
    MON("MONTREAL", "BLUE"),
    MOS("MOSCOW", "BLACK"),
    MUM("MUMBAI", "BLACK"),
    MIA("MIAMI", "YELLOW"),
    MAN("MANILLA", "RED"),
    MEX("MEXICO CITY", "YELLOW"),
    IST("ISTANBUL", "BLACK"),
    HOC("HO CHI MIN CITY", "RED"),
    HON("HONG KONG", "RED"),
    TAI("TAIPEI", "RED"),
    TEH("TEHRAN", "BLACK"),
    TOK("TOKIO", "RED"),
    OSA("OSAKA", "RED"),
    PAR("PARIS", "BLUE"),
    SYD("SYDNEY", "RED"),
    SHA("SHANGHAI", "RED"),
    STP("ST. PETERSBURG", "BLUE"),
    SEO("SEOUL", "RED"),
    SANT("SANTIAGO", "YELLOW"),
    SANF("SAN FRANSISCO", "BLUE"),
    SAO("SAO PAOLO", "YELLOW"),
    NEW("NEW YORK", "BLUE"),
    KOL("KOLKATA", "BLACK"),
    KHA("KHARTOUM", "YELLOW"),
    KIN("KINSHASA", "YELLOW"),
    ESS("ESSEN", "BLUE"),
    JAK("JAKARTA", "RED"),
    JOH("JOHANNESBURG", "YELLOW"),
    KAR("KARACHI", "BLACK"),
    RIY("RIYADH", "BLACK"),
    WAS("WASHINGTON", "BLUE");

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
