package debugging;

public class FixDebugTwo3 {
    public static void main(String args[])
    {
        int a = 99;
        int b = 8;
        int result;
        long c = 7777777777777l;
        result = a % b;
        System.out.println("Divide " + a + " by " + b);
        System.out.println("remainder is " + result);
        System.out.print("c is a very large number: ");
        System.out.println(c);
    }
}


