package Game;
import java.util.Scanner;

public class GameRuleLogic {

    Game.Player player1 = new Game.Player("Player 1");
    Game.Player player2 = new Game.Player("Player 2");
    Game.Dices dices = new Game.Dices(6);
    int lastRollValue;
    Scanner input = new Scanner(System.in);
    int [] field;
    boolean gameOver = false;


    //Creates a game board
    public GameRuleLogic(){
        this.field = generateField();
    }

    //Fills the board with values from a array
    public int [] generateField() {
        int[] field = {250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650};

        return field;
    }

    //The different values and names from the different fields.
    //Checks your dice value and checks what you land on
    private void land(int roll){
        lastRollValue = roll;
        System.out.println("You rolled a " + roll);
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


    //Is the method for the turn based system
    private void turn(Game.Player player){
        String playerinput;

        //The UI of the game. Displays name, points and who's turn it is
        System.out.println(player.getName() + "'s turn" + " " + "|" + " Points: " + player.getPoints() + " " + "|" +
                " Type \"r\"" + " to roll dices");

        //Waits for the player input and if its correct, then rolls the dices
        // Then sets the players points depend on what field they landed on. followed up by displaying them
        playerinput = input.nextLine();

        if (!playerinput.equals("r")){
            System.out.println("Wrong input, try again :'(");
            System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________"+ "\n");
            turn(player);
        } else{
            int roll = dices.roll();
            land(roll);

            if (field[roll-2]+player.getPoints() < 0){
                player.setPoints(0);
            }else{
                player.setPoints(field[roll-2]+player.getPoints());
            }
            System.out.println("Accumulated points: " + player.getPoints());
            System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________"+ "\n");

        }
    }

    //Its the flow that keeps the game going in loops until a player wins the game
    public void gameFlow(){

        boolean firstRun = true;
        String lastplayer ="";
        while(!gameOver){

            if (firstRun){
                firstRun = false;
                turn(player1);
                lastplayer="player1";
            }

            if (lastplayer.equals("player1") && lastRollValue==10){
                turn(player1);
            }

            if (lastplayer.equals("player2") && lastRollValue==10){
                turn(player2);
            }

            if(!player1victory()){
                turn(player2);
                lastplayer="player2";
            }

            if (!player2victory()){
                turn(player1);
                lastplayer="player1";
            }

            if (player1victory()){
                gameOver = true;
                System.out.println("Congratulations, player1 won");
                break;
            }

            if (player2victory()){
                gameOver = true;
                System.out.println("Congratulations, player2 won");
                break;
            }
        }
    }

    //checks if player 1 has won the game
    private boolean player1victory(){
        if(player1.getPoints()>=3000){

            return true;
        }else return false;
    }

    //Checks if player 2 has won the game
    private boolean player2victory(){
        if(player2.getPoints()>=3000){

            return true;
        }else return false;
    }
}
