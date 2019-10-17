public class Test {
    class Felt
    {
        public int roll_no;
        public String name;
        Felt(int roll_no, String name)
        {
            this.roll_no = roll_no;
            this.name = name;
        }
    }

    public class GFG
    {
        public static void main (String[] args)
        {
            Felt[] arr;

            arr = new Felt[12];

            arr[2] = new Test(250,"Tower ");
            arr[3] = new Test(-100,"Crater ");
            arr[4] = new Test(100,"Palace gates");
            arr[5] = new Test(-20,"Cold Desert");
            arr[6] = new Test(180,"Walled city ");
            arr[7] = new Test(0,"Monastery ");
            arr[8] = new Test(-70,"Black cave ");
            arr[9] = new Test(60,"Huts in the mountain");
            arr[10] = new Test(-80,"The Werewall (werewolf-wall)");
            arr[11] = new Test(-50,"The pit ");
            arr[12] = new Test(650,"Goldmine ");

            for (int i = 0; i < arr.length; i++)
                System.out.println("Element at " + i + " : " +
                        arr[i].roll_no +" "+ arr[i].name);
        }
    }
}
