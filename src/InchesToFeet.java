import javax.swing.*;

public class InchesToFeet {
    public static void main(String[] args) {
        int feet = 12;
        int inches = 12 ;
        int userInPut;
        String inchesToFeet;


     inchesToFeet = JOptionPane.showInputDialog(null, "please enter your number " ," inches to feet", JOptionPane.INFORMATION_MESSAGE);
        userInPut = Integer.parseInt(inchesToFeet);
        feet = userInPut / feet;
        inches = userInPut % inches;
                JOptionPane.showMessageDialog(null," inches to feet is " + feet + "feet and " + inches + " inches");

    }
}
