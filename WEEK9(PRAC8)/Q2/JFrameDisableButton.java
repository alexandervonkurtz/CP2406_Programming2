import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton extends JFrame implements ActionListener {
    private JButton button = new JButton("Click Here");

    public JFrameDisableButton()
    {
        setTitle("Click to Disable Button");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent arg0)
    {
        button.setVisible(false);
    }

    public static void main(String[] args)
    {
        JFrameDisableButton frame = new JFrameDisableButton();
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
