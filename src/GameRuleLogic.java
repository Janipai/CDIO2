import java.awt.*;
import java.util.Scanner;

public class GameRuleLogic {
    Player player1;
    Player player2;
    Dices dice;
    Account turnpoints;

    //Skal den være her
    objectgame(){
        /*Scanner input = new Scanner(System.in);

        System.out.println("Skriv dit navn, spiller1");
        String player1name = input.nextLine();
        player1 = new Player(player1name, points1);

        System.out.println("Skriv dit navn, spiller2");
        String player2name = input.nextLine();
        player2 = new Player(player2name, points2 );*/

        player1 = new Player("spiller1", Point.points1);
        player2 = new Player("spiller2", Point.points2);

        dice = new Dices();
    }

    GameRuleLogic(){
        int [] Feltliste = {2,3,4,5,6,7,8,9,10,11,12};

        Feltliste[2] = 250;
        Feltliste[3] = -100;
        Feltliste[4] = 100;
        Feltliste[5] = -20;
        Feltliste[6] = 180;
        Feltliste[7] = 0;
        Feltliste[8] = -70;
        Feltliste[9] = 60;
        Feltliste[10] = -80;
        Feltliste[11] = -50;
        Feltliste[12] = 650;

        for (int i = 0; i < Feltliste.length; i++) {

            System.out.println("Du er landt på feltet " + i + ". Derfor får du " + Feltliste[i] + " points!");

        }
    }

    public class Turn(){
        Player currentPlayer = player1;

        while(points1 < 3000 || points2 < 3000){
            if (currentPlayer == player1){
                currentPlayer = player2;
            }else if(currentPlayer == player2){
                currentPlayer = player1;
            }
        }
    }

    //roller den, og hvordan opdater man poins
    public void play(){

    }


    private Player win(){

        if(points1>points2){
            System.out.println(player1 + " har vundet");
        }
        else if (points2>points2){
            System.out.println(player2 + " har vundet");
        }
    }
}
