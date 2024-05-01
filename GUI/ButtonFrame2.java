import javax.swing.*;
public class ButtonFrame2 extends JFrame //Using Swing by inheritance(extending the JFrame)
{
    ButtonFrame2()
    {
        JButton button = new JButton("Click Me!");
        button.setBounds(130,100,100,40);
        add(button);
        setSize(400, 500);
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args) 
    {
        ButtonFrame2 b2 = new ButtonFrame2();
    }
}