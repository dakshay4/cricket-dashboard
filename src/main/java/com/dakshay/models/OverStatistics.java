package com.dakshay.models;

public class OverStatistics {

    private int run;
    private BallType ballType;



    public OverStatistics(int run, BallType ballType) {
        this.run = run;
        this.ballType = ballType;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public BallType getBallType() {
        return ballType;
    }

    public void setBallType(BallType ballType) {
        this.ballType = ballType;
    }
}
