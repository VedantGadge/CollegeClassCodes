//INCOMPLETE
import javax.swing.*;
import java.awt.event.*;
public class MCQ extends JFrame implements ActionListener
{
    JCheckBox[] checkBoxes;
    JButton submitB;
    String[] correctAns={"A","C","E"};
    String[] wrongAns={"B","D"};

    MCQ()
    {
        setTitle("Shows Watchlist MCQ");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel questLabel = new JLabel("Which are the web shows watched by me?");
        JLabel aLabel = new JLabel("A. Vikings");
        JLabel bLabel = new JLabel("B. FRIENDS");
        JLabel cLabel = new JLabel("C. Game of Thrones");
        JLabel dLabel = new JLabel("D. The Office");
        JLabel eLabel = new JLabel("E. Jack Ryan");
        
        checkBoxes = new JCheckBox[5];
        checkBoxes[0] = new JCheckBox("A");
        checkBoxes[1] = new JCheckBox("B");
        checkBoxes[2] = new JCheckBox("C");
        checkBoxes[3] = new JCheckBox("D");
        checkBoxes[4] = new JCheckBox("E");

        JPanelCheckBoxPanel = new JPanel();

    }
}
