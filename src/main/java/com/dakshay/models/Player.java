package com.dakshay.models;

import java.util.UUID;

public class Player {

    private String id;
    private String name;
    private PlayerType playerType;



    public enum PlayerType{
        BATSMAN, BOWLER, ALL_ROUNDER, WICKETKEEPER
    }

    public Player(String name, PlayerType playerType) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.playerType = playerType;
    }
}
