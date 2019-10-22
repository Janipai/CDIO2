import java.util.Scanner;

public class GameRuleLogic {

        Player player1 = new Player("spiller1");
        Player player2 = new Player("spiller2");
        Dices dices = new Dices(8);
        boolean isGameOver = false;
        Scanner input = new Scanner(System.in);
        int [] field;

    public int [] generateField() {
        int[] field = {250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650};

        return field;
    }

    public void land(int [] field, int index){

        switch (11){
            case 2:
                System.out.println("You landed on " + 2 + ". You will get " + field[index] + " points!");
                System.out.println("Which is Tower");
                break;

            case 3:
                System.out.println("You landed on " + 3 + ". You will get " + field[index] + " points!");
                System.out.println("Which is Crater");
                break;

            case 4:
                System.out.println("You landed on " + 4 + ". You will get " + field[index] + " points!");
                System.out.println("Which is Palace gates");
                break;

            case 5:
                System.out.println("You landed on " + 5 + ". You will get " + field[index] + " points!");
                System.out.println("Which is Cold Desert");
                break;

            case 6:
                System.out.println("You landed on " + 6 + ". You will get " + field[index] + " points!");
                System.out.println("Which is Walled City");
                break;

            case 7:
                System.out.println("You landed on " + 7 + ". You will get " + field[index] + " points!");
                System.out.println("Which is Monastery");
                break;

            case 8:
                System.out.println("You landed on " + 8 + ". You will get " + field[index] + " points!");
                System.out.println("Which is Black cave");
                break;

            case 9:
                System.out.println("You landed on " + 9 + ". You will get " + field[index] + " points!");
                System.out.println("Which is Hunts in the mountain");
                break;

            case 10:
                System.out.println("You landed on " + 10 + ". You will get " + field[index] + " points!");
                System.out.println("Which is the Werewall");
                break;

            case 11:
                System.out.println("You landed on " + 11 + ". You will get " + field[index] + " points!");
                System.out.println("Which is the pit");
                break;

            case 12:
                System.out.println("You landed on " + 12 + ". You will get " + field[index] + " points!");
                System.out.println("Which is Goldmine");
                break;
        }
    }


   public void turn(Player player, int index){
        String playerinput;

        System.out.println("its "+ player.getName() + "s turn. Type \"r\" " + " to roll the dices");
        playerinput = input.nextLine();

        if (!playerinput.equals("r")){
           System.out.println("Wrong input, try again :'(");
           turn(player, index);
       } else{
            int value = dices.roll();
            land(field,index+value%12);
       }
    }
}