package com.dakshay;

import com.dakshay.models.*;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;

public class CricketPlayService {

    public void createMatch() {

        Player p1 = new Player("Virat", Player.PlayerType.BATSMAN);
        Player p2 = new Player("Rohit", Player.PlayerType.BATSMAN);
        Player p3 = new Player("Jasprit", Player.PlayerType.BOWLER);
        Player p4 = new Player("Ms Dhoni", Player.PlayerType.WICKETKEEPER);
        Player p5 = new Player("Sanju Samson", Player.PlayerType.BATSMAN);
        Player p6 = new Player("Ravindra Jadeja", Player.PlayerType.ALL_ROUNDER);

        Player pb1 = new Player("David Warner", Player.PlayerType.BATSMAN);
        Player pb2 = new Player("Travis Head", Player.PlayerType.BATSMAN);
        Player pb3 = new Player("Mitchell Starc", Player.PlayerType.BOWLER);
        Player pb4 = new Player("Marcus Stoinis", Player.PlayerType.ALL_ROUNDER);
        Player pb5 = new Player("Pat Cummis", Player.PlayerType.BOWLER);
        Player pb6 = new Player("Glen Maxwell", Player.PlayerType.ALL_ROUNDER);

        Team teamA = new Team("India",List.of(p1,p2,p3,p4,p5,p6));
        Team teamB = new Team("Australia", List.of(pb1,pb2,pb3,pb4,pb5,pb6));
        Match m = new Match("Mumbai", teamA, teamB, 10,
                LocalDateTime.of(2024,8,10, 9, 0).toEpochSecond(ZoneOffset.UTC));


    }

    public void input(String inningId,
                      String matchId,
                      OverStatistics overStatistics,
                      Player batsman,
                      Player bowler) {
        BallType ballType = overStatistics.getBallType();

    }
}
