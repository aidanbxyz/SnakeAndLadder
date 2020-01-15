package com.company.utils;

import com.company.models.SLBoard;

import java.util.ArrayList;

public class SLRuleServiceImpl implements RuleService {

    private Integer tiles;
    private int[] ladders;
    private int[] snakes;

    public SLRuleServiceImpl(SLBoard slBoard){
        this.tiles = slBoard.getTiles();
        ladders = new int[this.tiles + 1];
        snakes = new int[this.tiles + 1];
        slBoard.getSnakes().stream().forEach(ladder -> {
            ladders[ladder.getVal1()] = ladder.getVal2();
        });
        slBoard.getLadders().stream().forEach(snake -> {
            snakes[snake.getVal1()] = snake.getVal2();
        });
    }

    @Override
    public Integer getPosition(Integer outcome, Integer oldPosition) {
        Integer position = outcome + oldPosition;
        if(position > tiles){
            position = oldPosition;
        }else{
            position = correctPositionWithLadder(position);
            position = correctPositionWithSnake(position);
        }
        Logger.log("new Position for user is : " + position);
        return position;
    }

    @Override
    public Boolean isWinner(Integer position) {
        if(position.equals(tiles)){
            return Boolean.TRUE;
        }else{
            return Boolean.FALSE;
        }
    }

    private Integer correctPositionWithLadder(Integer position){
        if(ladders[position] > 0){
            Logger.log("Got ladder at "+ position);
            return ladders[position];
        }else{
            return position;
        }
    }

    private Integer correctPositionWithSnake(Integer position){
        if(snakes[position] > 0){
            Logger.log("Got snake at " + position);
            return snakes[position];
        }else{
            return position;
        }
    }

}
