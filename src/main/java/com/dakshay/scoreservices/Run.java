package com.dakshay.scoreservices;

import com.dakshay.models.BallType;
import com.dakshay.models.InningsStatistics;
import com.dakshay.models.PlayerStatistics;

import java.util.List;
import java.util.Optional;

import static com.dakshay.models.PlayerStatus.ON_CREASE;

public class Run implements ScoreFactory{

    private final InningsStatistics inningsStatistics;


    public Run(InningsStatistics inningsStatistics) {
        this.inningsStatistics = inningsStatistics;
    }

    @Override
    public void update(int run) {
        inningsStatistics.updateOverStats(run, BallType.RUN);
        List<PlayerStatistics> playerStatistics = inningsStatistics.getPlayerStatistics();
        Optional<PlayerStatistics> strikePlayer = playerStatistics.stream().filter(PlayerStatistics::isOnStrike).findFirst();
        Optional<PlayerStatistics> nonStrikePlayer = playerStatistics.stream()
                .filter(player->ON_CREASE.equals(player.getPlayerStatus()) && !player.isOnStrike()).findFirst();
        if(run%2!=0) {
            nonStrikePlayer.ifPresent(statistics -> statistics.setOnStrike(true));
            strikePlayer.ifPresent(statistics -> statistics.setOnStrike(false));
        }
        strikePlayer.ifPresent(statistics -> statistics.incrementRuns(run));

    }
}
