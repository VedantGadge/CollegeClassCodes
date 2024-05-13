import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class ButtonFrame extends JFrame implements ActionListener
{
    JTextField text;
    ButtonFrame()
    {
        JButton button =new JButton();
        button.setBounds(200,100,100,40);
        text = new JTextField(20);
        text.setBounds(200,160,100,40);
        button.addActionListener(this);
        add(button);
        add(text); 
        setSize(500,300);
        setLayout(null);
        setVisible(true);
        setTitle("Frame Title");
    }
    public void actionPerformed(ActionEvent e)
    {
        text.setText("Welcome");
        text.setHorizontalAlignment(JTextField.CENTER);
    }
    public static void main(String[] args) 
    {
        ButtonFrame b1 = new ButtonFrame();
    }
}