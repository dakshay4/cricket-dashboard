package com.dakshay.scoreservices;

import com.dakshay.models.BallType;
import com.dakshay.models.InningsStatistics;
import com.dakshay.models.Player;
import com.dakshay.models.PlayerStatistics;

import java.util.List;
import java.util.Optional;

public class FourRun implements ScoreFactory{

    private final InningsStatistics inningsStatistics;


    public FourRun(InningsStatistics inningsStatistics) {
        this.inningsStatistics = inningsStatistics;
    }

    @Override
    public void update(int run) {
        inningsStatistics.updateOverStats(run, BallType.FOUR);
        List<PlayerStatistics> playerStatistics = inningsStatistics.getPlayerStatistics();
        Optional<PlayerStatistics> playerStatistic = playerStatistics.stream().filter(PlayerStatistics::isOnStrike).findFirst();
        playerStatistic.ifPresent(PlayerStatistics::incrementFours);

    }
}
