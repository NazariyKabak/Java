package Command.Example1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Editor {
    public JTextArea textField;
    public String clipboard;
    private CommandHistory history;
    public void init(){
        JFrame frame = new JFrame("Text editor (type & use buttons, Luke!");
        JPanel content = new JPanel();
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        textField = new JTextArea();
        textField.setLineWrap(true);
        content.add(textField);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton ctrLC = new JButton("Ctrl+C");
        JButton ctrX = new JButton("Ctrl+X");
        JButton ctrV = new JButton("Ctrl+V");
        JButton ctrZ = new JButton("Ctrl+Z");
        Editor editor=this;
        ctrLC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                executeCommand(new CopyCommand(editor));
            }
        });
        ctrX.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                executeCommand(new CopyCommand(editor));
            }
        });
        ctrV.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                executeCommand(new CopyCommand(editor));
            }
        });
        ctrZ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                undo();
            }
        });
        buttons.add(ctrLC);
        buttons.add(ctrX);
        buttons.add(ctrV);
        buttons.add(ctrZ);
        content.add(buttons);
        frame.setSize(450,200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public void executeCommand(Command command){
        if (command.execute()){
            history.push(command);
        }
    }
    public void undo(){
        if (history.isEmpty())return;
        Command command=history.pop();
        if (command!=null){
            command.undo();
        }
    }

}
/**Представляє текстовий редактор з GUI.
 * Містить текстове поле textField для введення тексту і змінну clipboard для зберігання буфера обміну.
 * Створює і налаштовує графічний інтерфейс користувача (GUI) за допомогою Swing.
 * Має методи executeCommand(Command command) для виконання команди і undo() для скасування останньої команди.**/
