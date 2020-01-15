package com.company.utils;

import com.company.models.SLBoard;
import com.company.models.SLPlayer;
import com.company.services.MoveGenerator;

import java.util.ArrayList;

public class SLGame {
    private ArrayList<SLPlayer> players;
    private MoveGenerator moveGenerator;
    private Integer winners = 0;
    private RuleService ruleService;

    public SLGame(RuleService ruleService, ArrayList<SLPlayer> players, MoveGenerator moveGenerator) {
        this.players = players;
        this.moveGenerator = moveGenerator;
        this.ruleService = ruleService;
    }

    public RuleService getRuleService() {
        return ruleService;
    }

    public void setRuleService(RuleService ruleService) {
        this.ruleService = ruleService;
    }

    public ArrayList<SLPlayer> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<SLPlayer> players) {
        this.players = players;
    }

    public MoveGenerator getMoveGenerator() {
        return moveGenerator;
    }

    public void setMoveGenerator(MoveGenerator moveGenerator) {
        this.moveGenerator = moveGenerator;
    }

    public Integer getWinners() {
        return winners;
    }

    public void incrementWinners() {
        this.winners++;
    }
}
