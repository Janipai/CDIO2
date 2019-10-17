import java.util.Scanner;

public class Dices {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int faceValue;

        System.out.println("Skriv roll");
        String roll = input.nextLine();

        if (roll.equals("roll")) {
            faceValue = (int) (2* Math.random() * 6 + 1);
            System.out.println(faceValue);
        }
    }
}
