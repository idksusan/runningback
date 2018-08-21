package runningback;

import java.awt.*;
import javax.swing.*;
public class ScoreBoard extends JPanel{
    JLabel scoreLine;
    JLabel missLine;
    int score;
    int miss;
    ScoreBoard(){
        super();
        setPreferredSize(new Dimension(1000,50));
        setBackground(Color.blue);
        scoreLine = new JLabel("TOUCHDOWNS: " + score + "  ");
        add(scoreLine);
        scoreLine.setFont(new Font("Sans-Serif",Font.PLAIN,30));
        scoreLine.setForeground(Color.black);
        missLine = new JLabel("MISSES: " + miss);
        add(missLine);
        missLine.setFont(new Font("Sans-Serif",Font.PLAIN,30));
        missLine.setForeground(Color.black);
        score = 0;
        miss = 0;
    }
    
}
