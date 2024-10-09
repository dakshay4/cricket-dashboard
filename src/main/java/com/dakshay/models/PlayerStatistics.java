package com.dakshay.models;

public class PlayerStatistics {

    private Player playerId;
    private int fours;
    private int sixes;
    private int runs = 0;
    private int ballsPlayed;
    private boolean onStrike;
    private PlayerStatus playerStatus;

    public Player getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Player playerId) {
        this.playerId = playerId;
    }

    public int getFours() {
        return fours;
    }

    public void incrementFours() {
        this.fours +=1;
        this.runs += 4;
        this.ballsPlayed+=1;
    }

    public void incrementBallPlayed() {
        this.ballsPlayed+=1;
    }

    public void incrementRuns(int run) {
        this.runs += run;
        this.ballsPlayed+=1;
    }

    public int getSixes() {
        return sixes;
    }

    public void incrementSixes() {
        this.sixes += 1;
        this.runs += 6;
        this.ballsPlayed+=1;

    }

    public int getBallsPlayed() {
        return ballsPlayed;
    }

    public boolean isOnStrike() {
        return onStrike;
    }

    public void setOnStrike(boolean onStrike) {
        this.onStrike = onStrike;
    }
}
