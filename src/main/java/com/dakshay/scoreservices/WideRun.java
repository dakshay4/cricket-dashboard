package com.dakshay.scoreservices;

import com.dakshay.models.BallType;
import com.dakshay.models.InningsStatistics;

public class WideRun implements ScoreFactory{

    private final InningsStatistics inningsStatistics;


    public WideRun(InningsStatistics inningsStatistics) {
        this.inningsStatistics = inningsStatistics;
    }

    @Override
    public void update(int run) {
        inningsStatistics.updateOverStats(run, BallType.WIDE);

    }
}
