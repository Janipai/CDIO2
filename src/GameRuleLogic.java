import java.awt.*;

public class GameRuleLogic {
    Dices dices;
    Player player;
    Account account;

        //player1 = new Player("spiller1", Point.points1);
        //player2 = new Player("spiller2", Point.points2);
    }

    public int field(){
        int [] field = {2,3,4,5,6,7,8,9,10,11,12};

        field[2] = 250;
        field[3] = -100;
        field[4] = 100;
        field[5] = -20;
        field[6] = 180;
        field[7] = 0;
        field[8] = -70;
        field[9] = 60;
        field[10] = -80;
        field[11] = -50;
        field[12] = 650;

        Dices dices;

        i = dices.faceValue1 + dices.faceValue2;

        switch (field){
            case '2':
                System.out.println("You landed on " + i + ". You will get " + Feltliste[i] + " points!");
                System.out.println("Which is Tower");
                break;

            case '3':
                System.out.println("You landed on " + i + ". You will get " + Feltliste[i] + " points!");
                System.out.println("Which is Crater");
                break;

            case '4':
                System.out.println("You landed on " + i + ". You will get " + Feltliste[i] + " points!");
                System.out.println("Which is Palace gates");
                break;

            case '5':
                System.out.println("You landed on " + i + ". You will get " + Feltliste[i] + " points!");
                System.out.println("Which is Cold Desert");
                break;

            case '6':
                System.out.println("You landed on " + i + ". You will get " + Feltliste[i] + " points!");
                System.out.println("Which is Walled City");
                break;

            case '7':
                System.out.println("You landed on " + i + ". You will get " + Feltliste[i] + " points!");
                System.out.println("Which is Monastery");
                break;

            case '8':
                System.out.println("You landed on " + i + ". You will get " + Feltliste[i] + " points!");
                System.out.println("Which is Black cave" +);
                break;

            case '9':
                System.out.println("You landed on " + i + ". You will get " + Feltliste[i] + " points!");
                System.out.println("Which is Hunts in the mountain");
                break;

            case '10':
                System.out.println("You landed on " + i + ". You will get " + Feltliste[i] + " points!");
                System.out.println("Which is the Werewall");
                break;

            case '11':
                System.out.println("You landed on " + i + ". You will get " + Feltliste[i] + " points!");
                System.out.println("Which is the pit");
                break;

            case '12':
                System.out.println("You landed on " + i + ". You will get " + Feltliste[i] + " points!");
                System.out.println("Which is Goldmine");
                break;
        }
    }

   public class Turn{

       public void setCurrentPlayer(Player currentPlayer) {
           Player player = new Player();
           Point point = new Point();
           this.currentPlayer = player.player1;

           while(point.playerpoints1 <= 3000) || (point.playerpoints2 <= 3000)){
               if (currentPlayer == player.player1){
                   currentPlayer = player.player2;
               }else if(currentPlayer == player.player2){
                   currentPlayer = player.player1;
               }
           }
       }
    }

    public win(){
        Point point = new Point();

        if(point.playerpoints1>=3000){
            System.out.println(player1 + " vund");
        }
        else if (point.playerpoints2>=3000){
            System.out.println(player2 + " vund");
        }
    }
}
