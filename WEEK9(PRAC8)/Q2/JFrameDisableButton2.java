import java.awt.event.*;
import javax.swing.*;
public class JFrameDisableButton2 extends JFrame implements ActionListener
{
    private JButton button = new JButton("Click Here");
    static int count = 0;

    public JFrameDisableButton2()
    {
        setTitle("Click 8 times to Disable Button");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent arg0)
    {
        count++;

        if(count == 8)
            button.setVisible(false);
    }

    public static void main(String[] args)
    {
        JFrameDisableButton2 frame = new JFrameDisableButton2();
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}