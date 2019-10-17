public class Account {
    Dices dices;
    Player Player;
    GameRuleLogic play;

    public void Points(){

        GameRuleLogic grl = new GameRuleLogic();
        Dices dices = new Dices();

        int points1 = 1000;
        int points2 = 1000;

        while (points1 < 3000 && points2 < 3000){
            turnpoints = dices.faceValue;

            if(grl.currentPlayer == grl.player1){
                points1 = points1 + turnpoints;
            }
            if(grl,currentPlayer == grl.player2){
                points2 = points2 + turnpoints;
            }
        }
    }
}
