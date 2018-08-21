package runningback;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class RunBack extends JButton{
    int x = 100;
    int y = 100;
    ImageIcon runner = new ImageIcon("RunningBackIcon.png");
    public RunBack(){
        setText("player");
        setBorder(new EmptyBorder(10,10,8,0));
        setBounds(new Rectangle(x,y,30,45));
        setBackground(Color.green);
    }
}
