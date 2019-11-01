public class Test {
    public static void main(String[] args) {
        //uses the game logic class and starts the game
        GameRuleLogic grl = new GameRuleLogic();

        grl.generateField();
        grl.gameFlow();

    }
}