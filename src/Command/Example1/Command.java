package Command.Example1;

public abstract class Command {
    public Editor editor;
    private String backup;
    public Command(Editor editor) {
        this.editor = editor;
    }
    void backup(){
        backup=editor.textField.getText();
    }
    public void undo(){
        editor.textField.setText(backup);
    }
    public abstract boolean execute();
}
/**Це абстрактний клас, який представляє команду.
 * Містить посилання на редактор editor і змінну backup, яка зберігає резервну копію тексту.
 * Має методи backup(), що зберігає резервну копію тексту, і undo(), що відновлює текст з резервної копії.
 * Метод execute() визначає логіку виконання команди і повинен бути реалізований у підкласах.**/