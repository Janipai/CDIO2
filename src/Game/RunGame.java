package Game;

import Game.GameRuleLogic;

public class RunGame {
    public static void main(String[] args) {
        //uses the game logic class and starts the game
        GameRuleLogic grl = new GameRuleLogic();

        grl.generateField();
        grl.gameFlow();

    }
}