import javax.swing.*;

public class SalaryDialog {
    public static void main(String[] args) {
        String wageString;
        String dependentString;
        int dependents;
        double weeklyPay;
        final double HOURS_IN_WEEK = 37.5;
        boolean isYes;
        int selection;

        wageString = JOptionPane.showInputDialog(null, "enter employee's hourly wage",
                "Salary Dialog 1", JOptionPane.INFORMATION_MESSAGE);

        weeklyPay = Double.parseDouble(wageString) * HOURS_IN_WEEK;

        dependentString = JOptionPane.showInputDialog(null, "How many dependents?",
                "Salary Dialog 2 ", JOptionPane.QUESTION_MESSAGE);

        dependents = Integer.parseInt(dependentString);

        JOptionPane.showMessageDialog(null, " Weekly salary is $" +
        weeklyPay + "\nDeduction will be made for " + dependents +" dependents");

        selection = JOptionPane.showConfirmDialog(null," is your salary correct");
        isYes = (selection == JOptionPane.YES_OPTION);

        JOptionPane.showMessageDialog(null,"you responded " + isYes);
    }
}
