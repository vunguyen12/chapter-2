import javax.swing.*;

public class PosterFactory {
    public static void main(String[] args) {
        int posterBought;
        int boxesFilled;
        int posterLeftOver;
        final int BOX_LIMIT=11;
        String posterBoughtString;
        posterBoughtString = JOptionPane.showInputDialog(null,"how many poster order today ?" , "order dialog", JOptionPane.INFORMATION_MESSAGE);

        posterBought = Integer.parseInt(posterBoughtString);

        boxesFilled = posterBought/BOX_LIMIT;
        posterLeftOver = posterBought % BOX_LIMIT;

        JOptionPane.showMessageDialog(null, "The number of boxes filled were " + boxesFilled + " with " + posterLeftOver + " posters left over");

    }
}
