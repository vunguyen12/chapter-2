import javax.swing.*;

public class Eggs {
    public static void main(String[] args) {
        final double dozenEggs = 3.25;
        final double individualEgg = 0.45;
        int dozen= 12;
        int numEggsOrdered; //        userinput
        double totalRemainingEggs;
        int numOfDozenEggs;
        int remainingEggs;

        double total;
        String eggStuffString;


        eggStuffString = JOptionPane.showInputDialog(null, "how many egg you want to order ?", "ordering egg", JOptionPane.QUESTION_MESSAGE);
        numEggsOrdered = Integer.parseInt(eggStuffString);

        numOfDozenEggs = numEggsOrdered / dozen;
        remainingEggs = numEggsOrdered % dozen;
        totalRemainingEggs =  remainingEggs * individualEgg;
        total = totalRemainingEggs + (numOfDozenEggs * dozenEggs);

        JOptionPane.showMessageDialog(null,"you bought " + numEggsOrdered + " eggs");
        JOptionPane.showMessageDialog(null, " that is  "+ numOfDozenEggs +" dozen of egg and " + remainingEggs + " individual egg");
        JOptionPane.showMessageDialog(null, " your total is "+ total+ " for " + numOfDozenEggs + " dozen of eggs and " + remainingEggs + " for individual eggs");




    }
}
