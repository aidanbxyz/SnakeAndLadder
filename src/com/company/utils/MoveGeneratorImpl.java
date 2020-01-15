package com.company.utils;

import com.company.models.Dice;

import java.util.ArrayList;
import java.util.Random;

public class MoveGeneratorImpl implements com.company.services.MoveGenerator {
    private ArrayList<Dice> dices;

    public MoveGeneratorImpl(ArrayList<Dice> dices){
        this.dices = dices;
    }

    @Override
    public Integer getMove() {
        final int[] move = {0};
        Random rand = new Random();
        dices.stream().forEach(dice -> {
            ArrayList<Integer> outcomes = dice.getOutcomes();
            Integer diceMove = outcomes.get(rand.nextInt(outcomes.size()));
            Logger.log("Dice move: " + diceMove);
            move[0] += diceMove;
        });
        Logger.log("Generated move : " + move[0]);
        return move[0];
    }
}
