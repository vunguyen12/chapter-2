import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        int cats = 5;
        int monkeysEntered;
        int house;

        System.out.println("number of monkey = " + cats);

        house=cats;
        System.out.println("Number of monkey in the house = " + house);
        System.out.println(" how many more cats do you want to add to tge house ? >>>");

        Scanner inputDevice = new Scanner(System.in);
        monkeysEntered = inputDevice.nextInt();

        house = cats + monkeysEntered;
        System.out.println("there are now " + house + " cats in the house");
        house = house/(1 +(int)(Math.random()*10));
        System.out.println("Due to overpoplation and diseases you killed half of the cats\n" +
        " there are now only " + house + " cats left in the house");
    }
}
