package com.dakshay.models;

import java.util.ArrayList;
import java.util.List;

public class InningsStatistics {

    private String id;
    private int totalRuns;
    private int wicketsFall;
    public int over = 0;
    public int ball;
    private final List<List<OverStatistics>> overStatistics;
    private List<PlayerStatistics> playerStatistics;
    private List<BowlerStatistics> bowlerStatistics;

    public List<PlayerStatistics> getPlayerStatistics() {
        return playerStatistics;
    }

    public List<BowlerStatistics> getBowlerStatistics() {
        return bowlerStatistics;
    }

    public InningsStatistics() {
        this.overStatistics = new ArrayList<>();
    }

    private void incrementRuns(int run) {
        this.totalRuns+=run;
    }
    private void incrementWicketFall() {
        this.wicketsFall+=1;
    }

    public void updateOverStats(int run, BallType ballType) {
        incrementRuns(run);
        List<OverStatistics> currentOver = overStatistics.get(over);
        if(currentOver == null) currentOver = new ArrayList<>();
        currentOver.add(new OverStatistics(run, ballType));
    }

}
