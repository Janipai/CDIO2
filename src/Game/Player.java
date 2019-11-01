package Game;

public class Player {

    String name;
    int points;

    public String getName() {

        return name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    Player(String name){
        this.name = name;
        points = 1000;
    }

}
