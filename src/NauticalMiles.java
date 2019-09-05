import javax.swing.*;

public class NauticalMiles {
    public static void main(String[] args) {
        final double NM_TO_MILE = 1.150779;
        final double NM_TO_KILO = 1.852;
        double userInputNM;
        double nauticalToMiles;
        double nauticalToKilometer;
        String convertTo;


        convertTo  = JOptionPane.showInputDialog(null, "please enter your number", "convert to NM", JOptionPane.INFORMATION_MESSAGE);
        userInputNM = Double.parseDouble(convertTo);
        nauticalToMiles = NM_TO_MILE*userInputNM;
        nauticalToKilometer = NM_TO_KILO*userInputNM;

        JOptionPane.showMessageDialog(null, "your miles to nautical miles is " + nauticalToMiles + " and kilometer is " + nauticalToKilometer);





    }
}
