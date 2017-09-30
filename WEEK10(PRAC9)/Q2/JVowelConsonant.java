import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class JVowelConsonant{

    //Vowels
    private static final String[] VOWELS = {"A","E","I","O","U"};

    //26 Buttons
    private JButton[] alphabetButons = new JButton[26];
    //Frame
    private JFrame frame;
    //Panels
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    //Jlabel for panel 3
    private JLabel label;

    //action listener
    private ActionListener actionListener;

    // to make random numbers unique
    Set<Integer> usedRand = new HashSet<Integer>();

    public JVowelConsonant(){

        // initialize the buttons
        int i=0;
        char alpha = 'A';
        do{
            alphabetButons[i] = new JButton();
            alphabetButons[i].setText(String.valueOf(alpha));

            i++;
            alpha++;

        }
        while(i<alphabetButons.length);

        frame = new JFrame("JVowelConsonants");
        frame.setSize(500, 500);
        frame.getContentPane().setLayout(new GridLayout(2, 2));
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();

        frame.getContentPane().add(panel1);
        frame.getContentPane().add(panel2);
        frame.getContentPane().add(panel3);
        panel3.setLayout(null);

        label = new JLabel();
        label.setBounds(24, 30, 189, 149);
        panel3.add(label);

        addButtonsToPanel();
        addActions();


        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //Add alphabets to buttons
    private void addButtonsToPanel(){

        Random rand = new Random();
        panel1.setLayout(new GridLayout(2, 2));
        panel2.setLayout(new GridLayout(2, 2));
        for(int i=0; i<4; i++){
            int rand1 = rand.nextInt(26);
            while(usedRand.contains(rand1)){
                rand1 = rand.nextInt(26);
            }
            usedRand.add(rand1);

            int rand2 = rand.nextInt(26);
            while(usedRand.contains(rand2)){
                rand2 = rand.nextInt(26);
            }
            usedRand.add(rand2);

            panel1.add(alphabetButons[rand1]);
            System.out.println("added "+alphabetButons[rand1].getText()+" to panel 1");
            panel2.add(alphabetButons[rand2]);
            System.out.println("added "+alphabetButons[rand2].getText()+" to panel 2");
        }
    }



    private void addActions(){
        actionListener = new ActionListener(){

            public void actionPerformed(ActionEvent e) {

                Object source = e.getSource();

                for(int i=0; i<alphabetButons.length; i++){

                    if(source.equals(alphabetButons[i])){
                        label.setText(checkVowels(alphabetButons[i].getText()));

                        JPanel parent = (JPanel) alphabetButons[i].getParent();
                        parent.remove(alphabetButons[i]);
                        Random rand = new Random();
                        int randNum = rand.nextInt(26);
                        while(usedRand.contains(randNum)){
                            randNum = rand.nextInt(26);
                        }

                        usedRand.add(randNum);
                        usedRand.remove(i);

                        parent.add(alphabetButons[randNum]);

                        frame.revalidate();
                        frame.repaint();
                    }
                }


            }

        };

        for(JButton button: alphabetButons){
            button.addActionListener(actionListener);
        }

    }


    private String checkVowels(String alphabet){
        for(String letter: VOWELS){
            if(letter.equalsIgnoreCase(alphabet)){
                return alphabet+": Vowel";
            }
        }
        return alphabet+": Consonant";
    }


    public static void main(String[] args) {

        JVowelConsonant jVowelConsonant = new JVowelConsonant();

    }

}