package runningback;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class Tackle extends JButton{
    int x;
    int y;
    int playerX;
    int playerY;
    double targetX;
    double targetY;
    double unitX;
    double unitY;
    double idk;
    RunBack player = new RunBack();
    ImageIcon tackle = new ImageIcon("TackleIcon.png");
    public Tackle(RunBack ply){
        setBorder(new EmptyBorder(10,-2,8,0));
        setIcon(tackle);
        setBackground(Color.green);
        player = ply;
    }
    public void moveTackle(int spd){
        playerX = player.getBounds().x;
        playerY = player.getBounds().y;
        x = getBounds().x;
        y = getBounds().y;
        targetX = playerX - x;
        targetY = playerY - y;
        idk = Math.sqrt(Math.pow(targetX,2)+Math.pow(targetY,2));
        unitX = (targetX / idk);
        unitY = (targetY / idk);
        unitX = unitX * spd;
        unitY = unitY * spd;
        setBounds(x+(int)unitX,y+(int)unitY,30,60);
    }
}
