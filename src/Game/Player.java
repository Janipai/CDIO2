package Game;

public class Player {

    String name;
    int points;

    public String getName() {

        return name;
    }

    //Method for getting the points of a player in the system
    public int getPoints() {
        return points;
    }

    //Method for setting the points of the player after a turn
    public void setPoints(int points) {
        this.points = points;
    }

    //Method that gives a player its name
    Player(String name){
        this.name = name;
        points = 1000;
    }

}
