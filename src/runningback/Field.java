package runningback;

import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.util.Timer;
import java.util.TimerTask;
public class Field extends JPanel{
    int x = 100;
    int y = 100;
    int speed;
    int tackleSpeed;
    String checkSpeed;
    RunBack player = new RunBack();
    Tackle tackle1 = new Tackle(player);
    Tackle tackle2 = new Tackle(player);
    GoalPost goal = new GoalPost();
    ImageIcon runner = new ImageIcon("player1.png");
    Timer time;
    int limit = 0;
    int delay;
    int i = 0;
    ScoreBoard scores;
    Field(ScoreBoard sc){
        super();
        speed = 5;
        tackleSpeed = 10;
        checkSpeed = "slow";
        player.setIcon(runner);
        scores = sc;
        delay = 500;
        setPreferredSize(new Dimension(1000,450));
        setLayout(null);
        setBackground(Color.green);
        add(player);
        add(tackle1);
        add(tackle2);
        add(goal);
        tackle1.setBounds(new Rectangle(700,50,30,60));
        tackle2.setBounds(new Rectangle(700,300,30,60));
        setFocusable(true);
        addKeyListener(new KeyAdapter()
            {
                @Override
                public void keyPressed(KeyEvent e) {
                    int k = e.getKeyCode();
                    if (checkSpeed.equals("slow")) { speed = 1; }
                    if (checkSpeed.equals("medium")) { speed = 4; }
                    if (checkSpeed.equals("fast")) { speed = 7; }
                    if (k == e.VK_RIGHT) { x = x + speed; }
                    if (k == e.VK_LEFT) { x = x - speed; }
                    if (k == e.VK_UP) { y = y - speed; }
                    if (k == e.VK_DOWN) { y = y + speed; }
                    player.setBounds(new Rectangle(x, y, 30, 45));
                    incrementScore();
                    incrementMiss();
                }
            }
        );
        time = new Timer();
        time.schedule(new TimerTask(){@Override public void run() {tackle1.moveTackle(tackleSpeed); tackle2.moveTackle(tackleSpeed);}}, 0, delay);
    }
    public void incrementScore(){
        if(player.getBounds().intersects(goal.getBounds())){
            scores.score = scores.score + 1;
            reset();
            scores.scoreLine.setText("TOUCHDOWNS: " + scores.score + "  ");
        }
    }
    public void incrementMiss(){
        if(player.getBounds().intersects(tackle1.getBounds()) || player.getBounds().intersects(tackle2.getBounds())){
            scores.miss = scores.miss + 1;
            reset();
            scores.missLine.setText("MISSES: " + scores.miss);
        }
    }
    public void reset(){
        x = 100;
        y = 100;
        player.setBounds(new Rectangle(x,y,30,45));
        tackle1.setBounds(new Rectangle(700,50,30,60));
        tackle2.setBounds(new Rectangle(700,300,30,60));
    }
}
