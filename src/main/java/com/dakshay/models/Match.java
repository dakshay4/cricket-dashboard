package com.dakshay.models;

public class Match {

    private String id;
    private String location;
    private Team teamA;
    private Team teamB;
    private int overs;
    private Long startTime;

    public Match(String location, Team teamA, Team teamB, int overs, Long startTime) {
        this.location = location;
        this.teamA = teamA;
        this.teamB = teamB;
        this.overs = overs;
        this.startTime = startTime;
    }
}
