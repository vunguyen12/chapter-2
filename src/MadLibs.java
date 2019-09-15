import java.util.Scanner;

public class MadLibs {
    public  static void  main(String[] args) {
        String color;
        String Wordest;
        String bodypart;
        String Animal;
        String noun;
        String pluralNoun;

        int a  ;
        int b ;
        int c;

        Scanner input = new Scanner(System.in);
        System.out.println("enter a color >>>");
        color = input.nextLine();

        System.out.println("enter a Word ending in EST");
        Wordest = input.nextLine();



        System.out.println("enter an animal");
        Animal = input.nextLine();

        System.out.println("enter a noun");
        noun = input.nextLine();

        System.out.println("enter a plural noun");
        pluralNoun= input.nextLine();

        System.out.println("Enter a plural body part >>>");
        bodypart = input.nextLine();

        System.out.println("enter a number ");
        a = input.nextInt();

        System.out.println("enter another number");
        b= input.nextInt();

        c = a % b;

        System.out.println("The " + color + " dragon is the "+ Wordest+ " Dragon of all.");
        System.out.println("it has " + c +" "+ bodypart +" , and a "+ Animal +" shaped like a " + noun + ". It loves to eat " + pluralNoun+ ", although it will feast on nearly anything.");


    }
}
