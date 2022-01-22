package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Constants {

    //In the lab characters
    public static final List<String> inTheLabCharacters = Arrays.asList(
        "Medic",
        "Quarantine specialist",
        "Contingency planner",
        "Scientist",
        "Dispatcher",
        "Operations Expert",
        "Researcher",
        "Field director",
        "Virologist",
        "Local liaison",
        "Pilot");

    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_BLACK = "\u001B[30m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_BLUE = "\u001B[34m";

    public static String BLUE = Constants.TEXT_BLUE + "BLUE" + Constants.TEXT_RESET;
    public static String YELLOW = Constants.TEXT_YELLOW + "YELLOW" + Constants.TEXT_RESET;
    public static String RED = Constants.TEXT_RED + "RED" + Constants.TEXT_RESET;
    public static String BLACK = Constants.TEXT_BLACK + "BLACK" + Constants.TEXT_RESET;

    public static String getColor(String color){
        if (color.equalsIgnoreCase("blue")){
            return BLUE;
        }
        if (color.equalsIgnoreCase("red")){
            return RED;
        }
        if (color.equalsIgnoreCase("yellow")){
            return YELLOW;
        }
        if (color.equalsIgnoreCase("black")){
            return BLACK;
        }
        throw new IllegalArgumentException();
    }

    public final static String youLoseText = "                                                                                                                                                      \n" +
            "                                                                                                                                                      \n" +
            "YYYYYYY       YYYYYYY     OOOOOOOOO     UUUUUUUU     UUUUUUUU     LLLLLLLLLLL                  OOOOOOOOO        SSSSSSSSSSSSSSS EEEEEEEEEEEEEEEEEEEEEE\n" +
            "Y:::::Y       Y:::::Y   OO:::::::::OO   U::::::U     U::::::U     L:::::::::L                OO:::::::::OO    SS:::::::::::::::SE::::::::::::::::::::E\n" +
            "Y:::::Y       Y:::::Y OO:::::::::::::OO U::::::U     U::::::U     L:::::::::L              OO:::::::::::::OO S:::::SSSSSS::::::SE::::::::::::::::::::E\n" +
            "Y::::::Y     Y::::::YO:::::::OOO:::::::OUU:::::U     U:::::UU     LL:::::::LL             O:::::::OOO:::::::OS:::::S     SSSSSSSEE::::::EEEEEEEEE::::E\n" +
            "YYY:::::Y   Y:::::YYYO::::::O   O::::::O U:::::U     U:::::U        L:::::L               O::::::O   O::::::OS:::::S              E:::::E       EEEEEE\n" +
            "   Y:::::Y Y:::::Y   O:::::O     O:::::O U:::::D     D:::::U        L:::::L               O:::::O     O:::::OS:::::S              E:::::E             \n" +
            "    Y:::::Y:::::Y    O:::::O     O:::::O U:::::D     D:::::U        L:::::L               O:::::O     O:::::O S::::SSSS           E::::::EEEEEEEEEE   \n" +
            "     Y:::::::::Y     O:::::O     O:::::O U:::::D     D:::::U        L:::::L               O:::::O     O:::::O  SS::::::SSSSS      E:::::::::::::::E   \n" +
            "      Y:::::::Y      O:::::O     O:::::O U:::::D     D:::::U        L:::::L               O:::::O     O:::::O    SSS::::::::SS    E:::::::::::::::E   \n" +
            "       Y:::::Y       O:::::O     O:::::O U:::::D     D:::::U        L:::::L               O:::::O     O:::::O       SSSSSS::::S   E::::::EEEEEEEEEE   \n" +
            "       Y:::::Y       O:::::O     O:::::O U:::::D     D:::::U        L:::::L               O:::::O     O:::::O            S:::::S  E:::::E             \n" +
            "       Y:::::Y       O::::::O   O::::::O U::::::U   U::::::U        L:::::L         LLLLLLO::::::O   O::::::O            S:::::S  E:::::E       EEEEEE\n" +
            "       Y:::::Y       O:::::::OOO:::::::O U:::::::UUU:::::::U      LL:::::::LLLLLLLLL:::::LO:::::::OOO:::::::OSSSSSSS     S:::::SEE::::::EEEEEEEE:::::E\n" +
            "    YYYY:::::YYYY     OO:::::::::::::OO   UU:::::::::::::UU       L::::::::::::::::::::::L OO:::::::::::::OO S::::::SSSSSS:::::SE::::::::::::::::::::E\n" +
            "    Y:::::::::::Y       OO:::::::::OO       UU:::::::::UU         L::::::::::::::::::::::L   OO:::::::::OO   S:::::::::::::::SS E::::::::::::::::::::E\n" +
            "    YYYYYYYYYYYYY         OOOOOOOOO           UUUUUUUUU           LLLLLLLLLLLLLLLLLLLLLLLL     OOOOOOOOO      SSSSSSSSSSSSSSS   EEEEEEEEEEEEEEEEEEEEEE\n" +
            "                                                                                                                                                      \n" +
            "                                                                                                                                                      \n" +
            "                                                                                                                                                      \n" +
            "                                                                                                                                                      \n" +
            "                                                                                                                                                      \n" +
            "                                                                                                                                                      \n" +
            "                                                                                                                                                      ";
}
