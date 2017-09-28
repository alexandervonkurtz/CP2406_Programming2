import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JHistoricalFacts extends JFrame implements ActionListener
{
    private JLabel fact1 = new JLabel("Alex is awesome");
    private JLabel fact2 = new JLabel("Alex loves fishing");
    private JLabel fact3 = new JLabel("Alex knows stuff");
    private JLabel fact4 = new JLabel("Alex writes too much");
    private JLabel fact5 = new JLabel("Alex's 5th fact has nothing");
    private JButton button = new JButton("Remove an awesome Alex fact");

    private JLabel[] facts = { fact1, fact2, fact3, fact4, fact5 };
    private String[] otherfacts = { "Alexs 1st other fact", "Alexs 2nd other fact", "Alexs 3rd other fact",
            "Alexs 4th other fact", "Alexs 5th other fact" };
    private Random random = new Random();

    public JHistoricalFacts() {
        super("Alex's Awesome Removing Facts");
        setLayout(new GridLayout(6, 1));

        for (int i = 0; i < 5; i++)
            add(facts[i]);
        add(button);
        // Implement ActionListener
        button.addActionListener(this);
    }
    // Overide the ActionPerformed method

    public void actionPerformed(ActionEvent e)
    {
        int factIndex = random.nextInt(5);
        int otherIndex = random.nextInt(5);

        String oldfact = facts[factIndex].getText();
        String newfact = otherfacts[otherIndex];

        facts[factIndex].setText(newfact);
        otherfacts[otherIndex] = oldfact;
    }
    public static void main(String[] args)
    {
        JHistoricalFacts frame = new JHistoricalFacts();
        // Create a JFrame and add the setDefaultCloseOperation method
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}