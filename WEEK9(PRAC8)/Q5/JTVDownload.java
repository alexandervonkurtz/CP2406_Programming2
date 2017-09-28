import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTVDownload extends JFrame implements ActionListener {

    private String tvshows[] = {"Big Bang Theory", "Shark Tank", "Alex's Got Talent", "Futurama", "South Park"};
    private String tvshowsDescription[] = {"Comedy about nerds being nerds", "Pitch to famous world known Investors",
    "Some sexy lad showing off his talent", "Anime of a guy who wakes up on new years eve of 2999", "Anime of rude kids being rude kids"};

    private JComboBox tvShowsComboBox = new JComboBox(tvshows);
    private JLabel tvshowDescription = new JLabel();

    public JTVDownload(){
        setTitle("TV SHOWS");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        add(new JLabel("Select a tv show"));

        add(tvShowsComboBox);
        tvShowsComboBox.addActionListener(this);
        add(tvshowDescription);
    }
    @Override
    public void actionPerformed(ActionEvent e){
      int index = tvShowsComboBox.getSelectedIndex();
      tvshowDescription.setText(tvshowsDescription[index]);
    }

    public static void main(String[] args){
        final int FRAME_WIDTH = 500;
        final int FRAME_HEIGHT = 500;

        JTVDownload jtFrame = new JTVDownload();
        jtFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        jtFrame.setVisible(true);

    }

}
