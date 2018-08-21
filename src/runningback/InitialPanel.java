package runningback;

import java.awt.*;
import javax.swing.*;
public class InitialPanel extends JPanel{
    public InitialPanel(){
        super();
        ScoreBoard scores = new ScoreBoard();
        Field field = new Field(scores);
        ChoiceBoard choices = new ChoiceBoard(field);
        add(choices);
        add(scores);
        add(field);
    }
}
