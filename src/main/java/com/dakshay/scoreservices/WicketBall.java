package com.dakshay.scoreservices;

import com.dakshay.models.BallType;
import com.dakshay.models.InningsStatistics;
import com.dakshay.models.PlayerStatistics;

import java.util.List;
import java.util.Optional;

public class WicketBall implements ScoreFactory{

    private final InningsStatistics inningsStatistics;


    public WicketBall(InningsStatistics inningsStatistics) {
        this.inningsStatistics = inningsStatistics;
    }

    @Override
    public void updateScore(int run) {
        inningsStatistics.updateOverStats(run, BallType.WICKET);
        List<PlayerStatistics> playerStatistics = inningsStatistics.getPlayerStatistics();
        Optional<PlayerStatistics> playerStatistic = playerStatistics.stream().filter(PlayerStatistics::isOnStrike).findFirst();
        playerStatistic.ifPresent(PlayerStatistics::incrementFours);

    }
}
