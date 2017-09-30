import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JColorFrame extends JFrame implements ActionListener {

    private JButton button = new JButton("Click Me");
    private JButton region1 = new JButton("Region 1");
    private JButton region2 = new JButton("Region 2");
    private JButton region3 = new JButton("Region 3");
    private JButton region4 = new JButton("Region 4");

    public JColorFrame(){
        setLayout(new BorderLayout());
        add(button, BorderLayout.CENTER);
        add(region1, BorderLayout.NORTH);
        add(region2, BorderLayout.SOUTH);
        add(region3, BorderLayout.WEST);
        add(region4, BorderLayout.EAST);

        region1.setEnabled(false);
        region2.setEnabled(false);
        region3.setEnabled(false);
        region4.setEnabled(false);

        button.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int region = (int)(Math.random() * 4) + 1;

        if (region == 1){
            region1.setBackground(Color.RED);
            region2.setBackground(Color.WHITE);
            region3.setBackground(Color.WHITE);
            region4.setBackground(Color.WHITE);
        } else if (region == 2){
            region1.setBackground(Color.WHITE);
            region2.setBackground(Color.BLUE);
            region3.setBackground(Color.WHITE);
            region4.setBackground(Color.WHITE);
        }else if (region == 3) {
            region1.setBackground(Color.WHITE);
            region2.setBackground(Color.WHITE);
            region3.setBackground(Color.GREEN);
            region4.setBackground(Color.WHITE);
        } else {
            region1.setBackground(Color.WHITE);
            region2.setBackground(Color.WHITE);
            region3.setBackground(Color.WHITE);
            region4.setBackground(Color.YELLOW);
        }
    }
    public static void main(String[] args){
        JColorFrame frame = new JColorFrame();
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
