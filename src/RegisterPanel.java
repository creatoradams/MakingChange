import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegisterPanel extends JPanel
{
    private Register reg = new Register(); // Register object
    private JTextField amtText = new JTextField(5); // to hold the amount up to 5 digits
    private PursePanel p = new PursePanel(); // panel to display results

    public RegisterPanel()
    {
        setLayout(new BorderLayout());

        // create panel for input
        JPanel input = new JPanel();
        input.add(new JLabel("Enter Amount: "));
        input.add(amtText);
        JButton buttonForChange = new JButton("Make Change");
        input.add(buttonForChange);
        add(input, BorderLayout.SOUTH);

        // create result panel
        JPanel subPanel = new JPanel();
        subPanel.setBackground(Color.lightGray);
        add(subPanel, BorderLayout.CENTER);

        // create listener


    }

}
