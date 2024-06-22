package Command.Example1;

public class CutCommand extends Command{
    public CutCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.textField.getSelectedText().isEmpty()) return false;
        backup();
        String source = editor.textField.getText();
        editor.clipboard=editor.textField.getText();
        editor.textField.setText(cutString(source));
        return true;
    }
    private String cutString(String source) {
        String start = source.substring(0, editor.textField.getSelectionStart());
        String end = source.substring(editor.textField.getSelectionEnd());
        return start + end;
    }
}
/**Підклас Command, що представляє команду вирізання тексту.
 * Реалізує метод execute(), який вирізає виділений текст з редактора і зберігає його в буфер обміну.**/