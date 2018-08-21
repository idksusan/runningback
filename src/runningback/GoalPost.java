package runningback;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class GoalPost extends JButton{
    ImageIcon goalpost = new ImageIcon("GoalPost.png");
    public GoalPost(){
        setIcon(goalpost);
        setBackground(Color.green);
        setBounds(new Rectangle(800,0,190,420));
        setBorder(new EmptyBorder(10,-2,8,0));
    }
}
