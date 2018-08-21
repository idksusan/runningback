package runningback;

import java.awt.*;
import javax.swing.*;
public class InitialFrame extends JFrame{
    public InitialFrame(){
        super("Running Back");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        InitialPanel inp = new InitialPanel();
        add(inp);
        inp.setLayout(new BoxLayout(inp,BoxLayout.PAGE_AXIS));
        setSize(1000,600);
        setVisible(true);
    }
}
