package Game;

import Game.GameRuleLogic;

public class RunGame {
    public static void main(String[] args) {
        GameRuleLogic grl = new GameRuleLogic();

        grl.generateField();
        grl.gameFlow();
    }
}