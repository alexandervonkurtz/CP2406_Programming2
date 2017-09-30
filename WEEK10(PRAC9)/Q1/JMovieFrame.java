import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMovieFrame extends JFrame implements ActionListener {
    private JButton northButton = new JButton("North time");
    private JButton southButton = new JButton("Great Southern Land");
    private JButton eastButton = new JButton("East side cowboys");
    private JButton westButton = new JButton("Go West");
    private JButton centerButton = new JButton("Center of the neighbourhood");
    private Container container = getContentPane();

    public JMovieFrame(){
        setTitle("JMovieFrame");
        container.setLayout(new BorderLayout());
        container.add(northButton, BorderLayout.NORTH);
        container.add(southButton, BorderLayout.SOUTH);
        container.add(eastButton, BorderLayout.EAST);
        container.add(westButton, BorderLayout.WEST);
        container.add(centerButton, BorderLayout.CENTER);

        setSize(500,500);

        northButton.addActionListener(this);
        southButton.addActionListener(this);
        eastButton.addActionListener(this);
        westButton.addActionListener(this);
        centerButton.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object object = e.getSource();

        if (object == northButton){
            northButton.setText("North - 22 Dec 1999");
        } else if (object == southButton) {
            southButton.setText("South - 12 Jan 2000");
        } else if (object == eastButton){
            eastButton.setText("East - 5 Feb 1988");
        }else if (object == westButton){
            westButton.setText("West - 10 Aug 1970");
        }else {
            centerButton.setText("Center - 29 Aug 1985");
        }
    }
    public static void main(String [] args){
        JMovieFrame frame = new JMovieFrame();
        frame.setVisible(true);
    }
}
