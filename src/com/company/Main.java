package com.company;

import com.company.models.Dice;
import com.company.models.SLBoard;
import com.company.models.SLPlayer;
import com.company.runner.SLGameRunner;
import com.company.utils.MoveGeneratorImpl;
import com.company.models.SLGame;
import com.company.utils.SLGameBuilder;
import com.company.utils.SLRuleServiceImpl;

import java.util.ArrayList;

public class Main {

    private static Dice getDice(){
        Dice dice = new Dice();
        dice.addOutcome(1);
        dice.addOutcome(2);
        dice.addOutcome(3);
        dice.addOutcome(4);
        dice.addOutcome(5);
        dice.addOutcome(6);
        return dice;
    }

    private static SLBoard getBoard(){
        SLBoard slBoard = new SLBoard(100);
        slBoard.addLadder(5,22);
        slBoard.addLadder(67, 78);
        slBoard.addSnake(50, 5);
        slBoard.addSnake(99, 56);
        return slBoard;
    }

    private static ArrayList<SLPlayer> getPlayers(){
        ArrayList<SLPlayer> players = new ArrayList<>();
        players.add(new SLPlayer("Prabhat"));
        players.add(new SLPlayer("Shubham"));
        return players;
    }

    public static void main(String[] args) {
	    Dice dice = getDice();
        ArrayList<Dice> dices = new ArrayList<>();
        dices.add(dice);
        MoveGeneratorImpl moveGenerator = new MoveGeneratorImpl(dices);
        SLBoard slBoard = getBoard();
        SLRuleServiceImpl ruleService = new SLRuleServiceImpl(slBoard);
        ArrayList<SLPlayer> players = getPlayers();
        SLGame game = new SLGameBuilder()
                .setRuleService(ruleService)
                .setMoveGenerator(moveGenerator)
                .setPlayers(players)
                .createSLGame();
        SLGameRunner runner = new SLGameRunner(game);
        runner.run();
    }
}
