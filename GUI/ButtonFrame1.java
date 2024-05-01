import javax.swing.*;
public class ButtonFrame1 //using Swing by association(creating and using an object of the JFrame class)
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Button Frame"); //creates a frame window,whose name is "Button Frame"
        JButton button = new JButton("Click Me!");//creates a button,on whiche "Click Me!" is getting displayed
        button.setBounds(130,100,100,40);
        frame.add(button);
        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}