public class Dices {

    int faceValue1;
    int faceValue2;

    public Dices(){

    }
    public int roll(){
        faceValue1 = (int)(Math.random() * 6 + 1);
        faceValue2 = (int)(Math.random() * 6 + 1);
        return faceValue1+faceValue2;
    }
}