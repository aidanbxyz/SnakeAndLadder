package com.company.models;

import java.util.ArrayList;

public class Dice {

    private ArrayList<Integer> outcomes;

    public Dice(){
        this.outcomes = new ArrayList<>();
    }

    public ArrayList<Integer> getOutcomes() {
        return outcomes;
    }

    public void addOutcome(Integer outcome) {
        this.outcomes.add(outcome);
    }
}
