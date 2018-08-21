package runningback;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class ChoiceBoard extends JPanel{
    JButton slow;
    JButton medium;
    JButton fast;
    Field field;
    ImageIcon player1 = new ImageIcon("player1.png");
    ImageIcon player2 = new ImageIcon("player2.png");
    ImageIcon player3 = new ImageIcon("player3.png");
    String runner;
    JLabel lab1;
    JLabel lab2;
    JSlider speed;
    public ChoiceBoard(Field fld){
        super();
        setPreferredSize(new Dimension(1000,100));
        setBackground(Color.gray);
        addLabels();
        addButtons();
        this.field = fld;
        lab2 = new JLabel("Choose speed: ");
        add(lab2);
        speed = new JSlider(JSlider.HORIZONTAL,0,10,5);
        add(speed);
        speed.setFocusable(false);
        speed.setBorder(new EmptyBorder(5,5,8,0));
        speed.setMajorTickSpacing(1);
        speed.setPaintTicks(true);
        speed.setPaintLabels(true);
        speed.setBackground(Color.gray);
        speed.addChangeListener(new ChangeListener()
            {
                @Override
                public void stateChanged(ChangeEvent e){
                    if (speed.getValue() == 0) { field.tackleSpeed = 3; }
                    if (speed.getValue() == 1) { field.tackleSpeed = 5; }
                    if (speed.getValue() == 2) { field.tackleSpeed = 7; }
                    if (speed.getValue() == 3) { field.tackleSpeed = 10; }
                    if (speed.getValue() == 4) { field.tackleSpeed = 15; }
                    if (speed.getValue() == 5) { field.tackleSpeed = 20; }
                    if (speed.getValue() == 6) { field.tackleSpeed = 25; }
                    if (speed.getValue() == 7) { field.tackleSpeed = 30; }
                    if (speed.getValue() == 8) { field.tackleSpeed = 35; }
                    if (speed.getValue() == 9) { field.tackleSpeed = 40; }
                    if (speed.getValue() == 10) { field.tackleSpeed = 50; }
                }
            }
        );
    }
    public void addButtons(){
        slow = new JButton();
        add(slow);
        slow.setBorder(new EmptyBorder(10,10,8,0));
        slow.setBounds(new Rectangle(10,10,30,45));
        slow.setBackground(Color.gray);
        slow.setIcon(player1);
        slow.setFocusable(false);
        slow.addActionListener(new ActionListener() 
            {
                @Override
                public void actionPerformed(ActionEvent e){
                    field.checkSpeed = "slow";
                    field.player.setIcon(player1);
                }
            }
        );
        medium = new JButton();
        add(medium);
        medium.setBorder(new EmptyBorder(10,10,8,0));
        medium.setBounds(new Rectangle(10,10,30,45));
        medium.setBackground(Color.gray);
        medium.setIcon(player2);
        medium.setFocusable(false);
        medium.addActionListener(new ActionListener() 
            {
                @Override
                public void actionPerformed(ActionEvent e){
                    field.checkSpeed = "medium";
                    field.player.setIcon(player2);
                }
            }
        );
        fast = new JButton();
        add(fast);
        fast.setBorder(new EmptyBorder(10,10,8,0));
        fast.setBounds(new Rectangle(10,10,30,45));
        fast.setBackground(Color.gray);
        fast.setIcon(player3);
        fast.setFocusable(false);
        fast.addActionListener(new ActionListener() 
            {
                @Override
                public void actionPerformed(ActionEvent e){
                    field.checkSpeed = "fast";
                    field.player.setIcon(player3);
                }
            }
        );
    }
    public void addLabels(){
        lab1 = new JLabel("Choose Player: ");
        add(lab1);
    }
}
