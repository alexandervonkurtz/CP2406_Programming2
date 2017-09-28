import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTVDownload2 extends JFrame implements ActionListener {

    private String tvshows[] = {"Big Bang Theory", "Shark Tank", "Alex's Got Talent", "Futurama", "South Park"};
    private String tvshowsDescription[] = {"Comedy about nerds being nerds", "Pitch to famous world known Investors",
            "Some sexy lad showing off his talent", "Anime of a guy who wakes up on new years eve of 2999", "Anime of rude kids being rude kids"};

    private JComboBox tvShowsComboBox = new JComboBox(tvshows);
    private JLabel tvshowDescription = new JLabel();

    public JTVDownload2(){
        setTitle("TV SHOWS 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        //Need to make sure combo box it is editable
        tvShowsComboBox.setEditable(true);

        add(new JLabel("Select a tv show"));
        add(tvShowsComboBox);
        tvShowsComboBox.addActionListener(this);
        add(tvshowDescription);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        int index = tvShowsComboBox.getSelectedIndex();
        if(index != -1) {
            tvshowDescription.setText(tvshowsDescription[index]);
        } else {
            JOptionPane.showMessageDialog(null, "No match was found", "Error Message",
                    JOptionPane.OK_OPTION);
        }
    }
    public static void main (String[] args){
        final int FRAME_WIDTH = 500;
        final int FRAME_HEIGHT = 500;

        JTVDownload2 jtFrame = new JTVDownload2();
        jtFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        jtFrame.setVisible(true);
    }
}
