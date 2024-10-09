package com.dakshay.scoreservices;

import com.dakshay.models.BallType;
import com.dakshay.models.InningsStatistics;
import com.dakshay.models.PlayerStatistics;
import com.dakshay.models.PlayerStatus;

import java.util.List;
import java.util.Optional;

public class WicketBall implements ScoreFactory{

    private final InningsStatistics inningsStatistics;


    public WicketBall(InningsStatistics inningsStatistics) {
        this.inningsStatistics = inningsStatistics;
    }

    @Override
    public void update(int run) {
        inningsStatistics.updateOverStats(run, BallType.WICKET);
        List<PlayerStatistics> playerStatistics = inningsStatistics.getPlayerStatistics();
        Optional<PlayerStatistics> playerStatistic = playerStatistics.stream().filter(PlayerStatistics::isOnStrike).findFirst();
        playerStatistic.ifPresent(PlayerStatistics::wicket);
        Optional<PlayerStatistics> nextPlayerO = playerStatistics.stream().filter(player -> PlayerStatus.ABOUT_TO_PLAY.equals(player.getPlayerStatus())).findFirst();
        if(nextPlayerO.isPresent()) {
            PlayerStatistics nextPlayer = nextPlayerO.get();
            nextPlayer.setPlayerStatus(PlayerStatus.ON_CREASE);
            nextPlayer.setOnStrike(true);
        }

    }
}
