public class Dices {

    int sides;

    int faceValue1;
    int faceValue2;

    //Method that rolls 2 dices and set Dices equal to the to values sums
    public Dices(int sides){
        this.sides = sides;
    }
    public int roll(){
        faceValue1 = (int)(Math.random() * sides + 1);
        faceValue2 = (int)(Math.random() * sides + 1);
        return faceValue1+faceValue2;
    }
}