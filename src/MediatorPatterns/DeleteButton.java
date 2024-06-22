package MediatorPatterns;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class DeleteButton extends JButton implements Component {

    private Mediator mediator;
    public DeleteButton(){
        super("Delete");
    }
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator=mediator;
    }
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.deleteNote();
    }
    public String getName(){
        return "DeleteButton";
    }
}
