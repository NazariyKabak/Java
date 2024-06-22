package MediatorPatterns;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class Title extends JTextField implements Component {
    private  Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    protected void processComponentKeyEvent(KeyEvent e) {
        mediator.markNote();
    }

    public String getName(){
        return "Title";
    }
}
