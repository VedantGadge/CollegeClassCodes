import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;

public class NameEnter extends JFrame implements ActionListener
{
    JLabel label1,label2;
    JTextField inputTF,outputTF;
    JButton enterB,resetB;
    NameEnter()
    {
        inputTF = new JTextField(10);
        setTitle("Name Check");
        label1 = new JLabel("Enter the correct name: ");
        outputTF = new JTextField(10);
        enterB = new JButton("ENTER");
        resetB = new JButton("RESET");
        add(label1);
        add(inputTF);
        add(outputTF);
        add(enterB);
        add(resetB);
        enterB.addActionListener(this);
        resetB.addActionListener(this);
        setSize(500,500);
        setVisible(true);
        setLayout(new FlowLayout());
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == enterB)
        {
            String nameEntered = inputTF.getText();
            outputTF.setColumns(20);
            if(nameEntered.equals("Vedant Gadge")||nameEntered.equals("VEDANT GADGE"))
                outputTF.setText("Correctly Entered:"+nameEntered);
            else
                outputTF.setText("Entered name is incorrect");
            outputTF.setColumns(Math.max(outputTF.getText().length(),25));
            outputTF.repaint();
            outputTF.revalidate();
        }
        else if(e.getSource()==resetB)
        {
            inputTF.setText("");
            outputTF.setText("");
        } 
    }

        public static void main(String[] args) 
        {
            NameEnter n = new NameEnter(); 
        }
}
