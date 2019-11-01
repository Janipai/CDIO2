package Test;

import Game.GameRuleLogic;
import Game.Player;

import static org.junit.Assert.*;

public class GameRuleLogicTest {


    @Test

    public void setPointsNegativ{
        Player player = new Player();

        player.setPoints(-2000);

    }
}