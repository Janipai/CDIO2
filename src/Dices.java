public class Dices {

    int sides;

    int faceValue1;
    int faceValue2;

    public Dices(int sides){
        this.sides = sides;
    }
    public int roll(){
        faceValue1 = (int)(Math.random() * sides + 1);
        faceValue2 = (int)(Math.random() * sides + 1);
        return faceValue1+faceValue2;
    }
}