package Game;

public class RunGame {
    public static void main(String[] args) {
        //uses the game logic class and starts the game
        Game.GameRuleLogic grl = new Game.GameRuleLogic();

        grl.generateField();
        grl.gameFlow();

    }
}