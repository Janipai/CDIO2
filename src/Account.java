import java.lang.reflect.Field;

public class Account {
    Dices dices;
    Player Player;
    GameRuleLogic play;

    public Points(){

        Turn turn = new Turn();
        Field field = new Field();
        Player player = new Player();

        int playerpoints1 = 1000;
        int playerpoints2 = 1000;

        while (playerpoints1 < 3000 && playerpoints2 < 3000){

            if(turn.currentPlayer == Player.player1){
                playerpoints1 = playerpoints1 + field. ;
            }
            if(turn.currentPlayer == Player.player2){
                playerpoints2 = playerpoints2 + field.;
            }
        }
    }
}
