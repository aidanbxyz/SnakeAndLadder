package com.company.models;

public class SLPlayer {
    private String name;
    private Integer position = 1;
    private Integer rank;
    private Integer turns = 0;
    private Boolean isGameComplete = Boolean.FALSE;

    public SLPlayer(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public void incrementTurns() {
        this.turns++;
    }

    public void setGameComplete(Boolean gameComplete) {
        isGameComplete = gameComplete;
    }

    public String getName() {
        return name;
    }

    public Integer getPosition() {
        return position;
    }

    public Integer getRank() {
        return rank;
    }

    public Integer getTurns() {
        return turns;
    }

    public Boolean getGameComplete() {
        return isGameComplete;
    }
}
