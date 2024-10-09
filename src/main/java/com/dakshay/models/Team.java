package com.dakshay.models;

import java.util.List;

public class Team {

    private String id;
    private String name;
    private List<Player> players;

    public Team(String name, List<Player> players) {
        this.name = name;
        this.players = players;
    }
}
