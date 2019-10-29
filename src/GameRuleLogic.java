import java.util.Scanner;

public class GameRuleLogic {

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        Dices dices = new Dices(6);
        Scanner input = new Scanner(System.in);
        int [] field;

        public GameRuleLogic(){
            this.field = generateField();
        }

    public int [] generateField() {
        int[] field = {250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650};

        return field;
    }

    private void land(int roll){

        switch (roll){
            case 2:
                System.out.println("You found a fortune of "+ field[roll-2]+" points in the tower"+"\n");
                break;
            case 3:
                System.out.println("The crater collapsed on you, loosing "+ field[roll-2]+" points"+"\n");
                break;
            case 4:
                System.out.println("The people at the palace gates greeted you, giving you "+ field[roll-2]+" points"+"\n");
                break;
            case 5:
                System.out.println("You almost froze in the cold desert,loosing "+ field[roll-2]+" points"+"\n");
                break;
            case 6:
                System.out.println("You found a fortune of gold "+ field[roll-2]+" in the Walled city"+"\n");
                break;
            case 7:
                System.out.println("You walked into the monastery in vain, finding nothing. "+ field[roll-2]+" points"+"\n");
                break;
            case 8:
                System.out.println("You couldn't find your way out from the black cave, loosing "+ field[roll-2]+" points"+"\n");
                break;
            case 9:
                System.out.println("You accidentally killed the fokes in the huts in the mountain, " +
                        "and accidentally taking all of their valuables of a total of "+ field[roll-2]+" points"+"\n");
                break;
            case 10:
                System.out.println("The werewall scared you away, while "+ field[roll-2]+" points fell out of your pocket. " +
                        "You ran and gained another turn"+"\n");
                break;
            case 11:
                System.out.println("You fell into the pit,loosing "+ field[roll-2]+" points"+"\n");
                break;
            case 12:
                System.out.println("You found a jackpot of "+ field[roll-2]+" points in the goldmine"+"\n");
                break;
        }
    }


   private void turn(Player player){
        String playerinput;

        System.out.println(player.getName() + "'s turn" + " " + "|" + " Points: " + player.getPoints() + " " + "|" +
                " Type \"r\"" + " to roll dices");
        playerinput = input.nextLine();

        if (!playerinput.equals("r")){
           System.out.println("Wrong input, try again :'(");
            System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________"+ "\n");
           turn(player);
       } else{
            int roll = dices.roll();
            land(roll);
            player.setPoints(field[roll-2]+player.getPoints());
            System.out.println("Accumulated points: " + player.getPoints());
            System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________"+ "\n");

       }
    }
    public void gameFlow(){

        while(!isGameOver()){
            turn(player1);
            if (player1victory()){
                isGameOver();
            }
            turn(player2);
            if (player2victory()){
                isGameOver();
            }
        }
    }


    private boolean player1victory(){
        if(player1.getPoints()>=3000){
            System.out.println("Congratulations, player1 won");
            return true;
        }else return false;
    }
    private boolean player2victory(){
        if(player2.getPoints()>=3000){
            System.out.println("Congratulations, player2 won");
            return true;
        }else return false;
    }
    private boolean isGameOver(){
        if(player1victory()||player2victory()){
            return true;
        }else{
            return false;
        }
    }
}