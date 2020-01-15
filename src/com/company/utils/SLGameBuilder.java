package com.company.utils;

import com.company.models.SLGame;
import com.company.models.SLPlayer;
import com.company.services.MoveGenerator;
import com.company.services.RuleService;

import java.util.ArrayList;

public class SLGameBuilder {
    private RuleService ruleService;
    private ArrayList<SLPlayer> players;
    private MoveGenerator moveGenerator;

    public SLGameBuilder setRuleService(RuleService ruleService) {
        this.ruleService = ruleService;
        return this;
    }

    public SLGameBuilder setPlayers(ArrayList<SLPlayer> players) {
        this.players = players;
        return this;
    }

    public SLGameBuilder setMoveGenerator(MoveGenerator moveGenerator) {
        this.moveGenerator = moveGenerator;
        return this;
    }

    public SLGame createSLGame() {
        return new SLGame(ruleService, players, moveGenerator);
    }
}