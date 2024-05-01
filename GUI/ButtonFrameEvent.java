import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ButtonFrameEvent extends JFrame implements ActionListener
{
    JTextField text;
    ButtonFrameEvent()
    {
        JButton button = new JButton("Click Me!!");
        button.setBounds(130,100,100,40);
        text = new JTextField(20);
        text.setBounds(130,150,100,40);
        button.addActionListener(this);
        add(button);
        add(text);
        setSize(800, 800);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {  
        text.setText("Welcome...");  
    }  
   public static void main(String[] args) 
   {
    ButtonFrameEvent b=new ButtonFrameEvent();
   }
}
