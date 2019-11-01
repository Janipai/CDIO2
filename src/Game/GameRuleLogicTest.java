package Game;
import Game.GameRuleLogic;
import Game.Player;

import static org.junit.Assert.*;

public class GameRuleLogicTest {

    public void setPointsNegativ(){
        Game.Player player = new Game.Player();

        player.setPoints(-10);

    }



}