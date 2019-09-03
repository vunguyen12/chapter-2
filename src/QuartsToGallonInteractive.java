import java.util.Scanner;

public class QuartsToGallonInteractive {

    public static void main(String[] args) {
        int numQuarts;
        int numGallon;
        int quartsRemaining;
        int NUM_QUARTS_IN_GALLON = 4;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("enter the num ber of quarts your have >>>");
        numQuarts = keyboard.nextInt();
        numGallon = numQuarts / NUM_QUARTS_IN_GALLON;
        quartsRemaining = numQuarts % NUM_QUARTS_IN_GALLON;
        System.out.println("the number of gallons is " + numGallon + " with "+
         quartsRemaining + " Quarts remaining");

    }
}
