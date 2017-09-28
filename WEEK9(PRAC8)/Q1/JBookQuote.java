import javax.swing.*;

public class JBookQuote {
    public static void main (String[] args){
        //Set the width and height of the frame
        final int FRAME_WIDTH = 400;
        final int FRAME_HEIGHT = 400;

        //Create the JFrame and set the title
        JFrame sentenceFrame = new JFrame();
        sentenceFrame.setTitle("Favorite book sentence");
        sentenceFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);

        //Create String of sentence and then create the a label with the String
        String sentence = "I dont read books, so nothing really to say - by Alex von Kurtz";
        JLabel sentenceLabel = new JLabel(sentence);

        //Adds the label to the frame
        sentenceFrame.add(sentenceLabel);

        sentenceFrame.setVisible(true);
        sentenceFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
