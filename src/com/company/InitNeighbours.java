package com.company;

import java.util.List;

public class InitNeighbours {

    public void init(){

        //RED
        InfectionCards.OSA.neighbours.addAll(List.of(InfectionCards.TOK,InfectionCards.TAI));
        InfectionCards.BEI.neighbours.addAll(List.of(InfectionCards.SHA,InfectionCards.SEO));
        InfectionCards.MAN.neighbours.addAll(List.of(InfectionCards.SYD,InfectionCards.HOC,InfectionCards.HON,InfectionCards.TAI,InfectionCards.SANF));
        InfectionCards.SYD.neighbours.addAll(List.of(InfectionCards.LOS,InfectionCards.JAK,InfectionCards.MAN));
        InfectionCards.SHA.neighbours.addAll(List.of(InfectionCards.TAI,InfectionCards.HON,InfectionCards.BEI,InfectionCards.SEO,InfectionCards.TOK));
        InfectionCards.TAI.neighbours.addAll(List.of(InfectionCards.MAN,InfectionCards.HON,InfectionCards.SHA,InfectionCards.OSA));
        InfectionCards.JAK.neighbours.addAll(List.of(InfectionCards.CHE,InfectionCards.BAN,InfectionCards.HOC,InfectionCards.SYD));
        InfectionCards.SEO.neighbours.addAll(List.of(InfectionCards.TOK,InfectionCards.SHA,InfectionCards.BEI));
        InfectionCards.TOK.neighbours.addAll(List.of(InfectionCards.SANF,InfectionCards.SHA,InfectionCards.SEO,InfectionCards.OSA));
        InfectionCards.BAN.neighbours.addAll(List.of(InfectionCards.JAK, InfectionCards.CHE, InfectionCards.KOL, InfectionCards.HON,InfectionCards.HOC));
        InfectionCards.HOC.neighbours.addAll(List.of(InfectionCards.JAK, InfectionCards.BAN,InfectionCards.HON,InfectionCards.MAN));
        InfectionCards.HON.neighbours.addAll(List.of(InfectionCards.HOC,InfectionCards.BAN,InfectionCards.KOL,InfectionCards.SHA,InfectionCards.TAI,InfectionCards.MAN));

        //YELLOW
        InfectionCards.LOS.neighbours.addAll(List.of(InfectionCards.SYD,InfectionCards.SANF,InfectionCards.CHI,InfectionCards.MEX));
        InfectionCards.KIN.neighbours.addAll(List.of(InfectionCards.JOH,InfectionCards.KHA,InfectionCards.LAG));
        InfectionCards.SAO.neighbours.addAll(List.of(InfectionCards.BOG,InfectionCards.BUE,InfectionCards.MAD,InfectionCards.LAG));
        InfectionCards.JOH.neighbours.addAll(List.of(InfectionCards.KIN,InfectionCards.KHA));
        InfectionCards.LAG.neighbours.addAll(List.of(InfectionCards.SAO,InfectionCards.KIN,InfectionCards.KHA));
        InfectionCards.LIM.neighbours.addAll(List.of(InfectionCards.SANT,InfectionCards.BOG,InfectionCards.MEX));
        InfectionCards.BOG.neighbours.addAll(List.of(InfectionCards.BUE,InfectionCards.MEX,InfectionCards.MIA,InfectionCards.SAO,InfectionCards.LIM));
        InfectionCards.BUE.neighbours.addAll(List.of(InfectionCards.BOG, InfectionCards.SAO));
        InfectionCards.SANT.neighbours.addAll(List.of(InfectionCards.LIM));
        InfectionCards.KHA.neighbours.addAll(List.of(InfectionCards.CAI,InfectionCards.LAG,InfectionCards.KIN,InfectionCards.JOH));
        InfectionCards.MEX.neighbours.addAll(List.of(InfectionCards.LOS,InfectionCards.CHI,InfectionCards.MIA,InfectionCards.BOG,InfectionCards.LIM));
        InfectionCards.MIA.neighbours.addAll(List.of(InfectionCards.MEX,InfectionCards.ATL,InfectionCards.WAS,InfectionCards.BOG));

        //BLACK
        InfectionCards.CHE.neighbours.addAll(List.of(InfectionCards.MUM,InfectionCards.DEL,InfectionCards.KOL,InfectionCards.BAN,InfectionCards.JAK));
        InfectionCards.CAI.neighbours.addAll(List.of(InfectionCards.ALG,InfectionCards.IST,InfectionCards.BAG,InfectionCards.RIY,InfectionCards.KHA));
        InfectionCards.TEH.neighbours.addAll(List.of(InfectionCards.BAG,InfectionCards.MOS,InfectionCards.DEL,InfectionCards.KAR));
        InfectionCards.KOL.neighbours.addAll(List.of(InfectionCards.BAN,InfectionCards.CHE,InfectionCards.DEL,InfectionCards.HON));
        InfectionCards.IST.neighbours.addAll(List.of(InfectionCards.CAI,InfectionCards.ALG,InfectionCards.MIL,InfectionCards.STP,InfectionCards.MOS,InfectionCards.BAG));
        InfectionCards.ALG.neighbours.addAll(List.of(InfectionCards.MAD,InfectionCards.PAR, InfectionCards.IST,InfectionCards.CAI));
        InfectionCards.RIY.neighbours.addAll(List.of(InfectionCards.CAI,InfectionCards.BAG,InfectionCards.KAR));
        InfectionCards.DEL.neighbours.addAll(List.of(InfectionCards.CHE,InfectionCards.MUM,InfectionCards.KAR,InfectionCards.TEH,InfectionCards.KOL));
        InfectionCards.KAR.neighbours.addAll(List.of(InfectionCards.RIY, InfectionCards.BAG,InfectionCards.TEH,InfectionCards.DEL,InfectionCards.MUM));
        InfectionCards.BAG.neighbours.addAll(List.of(InfectionCards.KAR, InfectionCards.RIY,InfectionCards.CAI,InfectionCards.IST, InfectionCards.TEH));
        InfectionCards.MUM.neighbours.addAll(List.of(InfectionCards.KAR,InfectionCards.DEL,InfectionCards.CHE));
        InfectionCards.MOS.neighbours.addAll(List.of(InfectionCards.IST, InfectionCards.STP,InfectionCards.TEH));

        //BLUE
        InfectionCards.MON.neighbours.addAll(List.of(InfectionCards.WAS,InfectionCards.CHI,InfectionCards.NEW));
        InfectionCards.MIL.neighbours.addAll(List.of(InfectionCards.PAR, InfectionCards.ESS,InfectionCards.IST));
        InfectionCards.NEW.neighbours.addAll(List.of(InfectionCards.WAS,InfectionCards.MON,InfectionCards.LON,InfectionCards.MAD));
        InfectionCards.MAD.neighbours.addAll(List.of(InfectionCards.SAO,InfectionCards.NEW,InfectionCards.LON,InfectionCards.PAR,InfectionCards.ALG));
        InfectionCards.PAR.neighbours.addAll(List.of(InfectionCards.ALG,InfectionCards.MAD,InfectionCards.LON,InfectionCards.ESS,InfectionCards.MIL));
        InfectionCards.WAS.neighbours.addAll(List.of(InfectionCards.MIA,InfectionCards.ATL,InfectionCards.MON,InfectionCards.NEW));
        InfectionCards.CHI.neighbours.addAll(List.of(InfectionCards.SANF,InfectionCards.LOS,InfectionCards.MEX,InfectionCards.ATL,InfectionCards.MON));
        InfectionCards.STP.neighbours.addAll(List.of(InfectionCards.ESS,InfectionCards.IST,InfectionCards.MOS));
        InfectionCards.ESS.neighbours.addAll(List.of(InfectionCards.LON, InfectionCards.PAR, InfectionCards.MIL, InfectionCards.STP));
        InfectionCards.SANF.neighbours.addAll(List.of(InfectionCards.TOK,InfectionCards.MAN,InfectionCards.LOS,InfectionCards.CHI));
        InfectionCards.ATL.neighbours.addAll(List.of(InfectionCards.CHI,InfectionCards.WAS, InfectionCards.MIA));
        InfectionCards.LON.neighbours.addAll(List.of(InfectionCards.NEW,InfectionCards.MAD,InfectionCards.PAR,InfectionCards.ESS));
    }

}
