package com.company.models;

import com.company.common.Pair;

import java.util.ArrayList;
import java.util.List;

public class SLBoard {
    private Integer tiles;
    private ArrayList<Pair<Integer, Integer>> snakes;
    private ArrayList<Pair<Integer, Integer>> ladders;

    public SLBoard(Integer tiles){
        this.tiles = tiles;
        this.snakes = new ArrayList<>();
        this.ladders = new ArrayList<>();
    }

    public void addSnake(Integer start, Integer end){
        snakes.add(new Pair<>(start, end));
    }

    public void addLadder(Integer start, Integer end){
        ladders.add(new Pair<>(start, end));
    }

    public Integer getTiles() {
        return tiles;
    }

    public ArrayList<Pair<Integer, Integer>> getSnakes() {
        return snakes;
    }

    public ArrayList<Pair<Integer, Integer>> getLadders() {
        return ladders;
    }

}
