package Command.Example1;

public class PasteCommand extends Command{
    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.clipboard==null|| editor.clipboard.isEmpty())return false;
        backup();
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }
}
/**Підклас Command, що представляє команду вставки тексту.
 * Реалізує метод execute(), який вставляє текст з буфера обміну в позицію каретки редактора.**/