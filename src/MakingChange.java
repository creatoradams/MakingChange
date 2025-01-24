// Nick Adams
import javax.swing.*;
import java.awt.*;
public class MakingChange
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Making Change");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 600));

        // add a register panel to frame
        RegisterPanel regPanel = new RegisterPanel();
        frame.getContentPane().add(regPanel);


        frame.pack();
        frame.setVisible(true);
    }
}
