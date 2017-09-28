import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JBookQuote2 extends JFrame implements ActionListener {

    final int FRAME_WIDTH = 400;
    final int FRAME_HEIGHT= 400;

    String quote = "Hello from the otherside!";

    JButton buttonDisplay = new JButton("Quote Display");

    JLabel quoteLabel = new JLabel();

    public JBookQuote2(){
        setTitle("Quote 2");
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setLayout(new FlowLayout());
        add(buttonDisplay);
        add(quoteLabel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonDisplay.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent x){
        quoteLabel.setText(quote);
    }
    public static void main (String[] args){
        JBookQuote2 bookFrame = new JBookQuote2();
        bookFrame.setVisible(true);
    }


}
