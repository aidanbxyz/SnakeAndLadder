package com.company.runner;

import com.company.models.SLPlayer;
import com.company.utils.Logger;
import com.company.utils.SLGame;

import java.util.Optional;

public class SLGameRunner {

    private SLGame game;

    public SLGameRunner(SLGame game){
        this.game = game;
    }

    public void run(){
        Optional<SLPlayer> playingPlayer = game.getPlayers().stream().filter(slPlayer -> !slPlayer.getGameComplete()).findAny();
        if(playingPlayer.isPresent()){
            game.getPlayers().stream().filter(slPlayer -> !slPlayer.getGameComplete()).forEach(slPlayer -> {
                Integer move = game.getMoveGenerator().getMove();
                Logger.log("Player: " + slPlayer.getName() + " got move : "+move);
                Integer position = game.getRuleService().getPosition(move, slPlayer.getPosition());
                slPlayer.setPosition(position);
                if(game.getRuleService().isWinner(position)){
                    slPlayer.setGameComplete(Boolean.TRUE);
                    game.incrementWinners();
                    slPlayer.setRank(game.getWinners());
                    Logger.log("Player: " + slPlayer.getName() + " won with rank: " + slPlayer.getRank());
                }
            });
            run();
        }
    }

}
