import java.util.Scanner;

public class GameRuleLogic {

        Player player1 = new Player("player 1");
        Player player2 = new Player("player 2");
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

        switch (11){
            case 2:
                System.out.println("You rolled a " + roll + ". You will get " + field[roll-2] + " points!");
                System.out.println("Which is Tower\n");
                break;

            case 3:
                System.out.println("You rolled a " + roll + ". You will get " + field[roll-2] + " points!");
                System.out.println("Which is Crater\n");
                break;

            case 4:
                System.out.println("You rolled a " + roll + ". You will get " + field[roll-2] + " points!");
                System.out.println("Which is Palace gates\n");
                break;

            case 5:
                System.out.println("You rolled a " + roll + ". You will get " + field[roll-2] + " points!");
                System.out.println("Which is Cold Desert\n");
                break;

            case 6:
                System.out.println("You rolled a " + roll + ". You will get " + field[roll-2] + " points!");
                System.out.println("Which is Walled City\n");
                break;

            case 7:
                System.out.println("You rolled a " + roll + ". You will get " + field[roll-2] + " points!");
                System.out.println("Which is Monastery\n");
                break;

            case 8:
                System.out.println("You rolled a " + roll + ". You will get " + field[roll-2] + " points!");
                System.out.println("Which is Black cave\n");
                break;

            case 9:
                System.out.println("You rolled a " + roll + ". You will get " + field[roll-2] + " points!");
                System.out.println("Which is Hunts in the mountain\n");
                break;

            case 10:
                System.out.println("You rolled a " + roll + ". You will get " + field[roll-2] + " points!");
                System.out.println("Which is the Werewall\n");
                break;

            case 11:
                System.out.println("You rolled a " + roll + ". You will get " + field[roll-2] + " points!");
                System.out.println("Which is the pit\n");
                break;

            case 12:
                System.out.println("You rolled a " + roll + ". You will get " + field[roll-2] + " points!");
                System.out.println("Which is Goldmine\n");
                break;
        }
    }


   private void turn(Player player){
        String playerinput;

        System.out.println("its "+ player.getName() + "s turn." + " You have " + player.getPoints()+ " points." +
                " Type \"r\" " + " to roll the dices");
        playerinput = input.nextLine();

        if (!playerinput.equals("r")){
           System.out.println("Wrong input, try again :'(");
           turn(player);
       } else{
            int roll = dices.roll();
            land(roll);
            player.setPoints(field[roll-2]+player.getPoints());
            System.out.println("You now have " + player.getPoints()+ " points.\n");
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
            System.out.println("Congratulation, player1 won");
            return true;
        }else return false;
    }
    private boolean player2victory(){
        if(player2.getPoints()>=3000){
            System.out.println("Congratulation, player2 won");
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