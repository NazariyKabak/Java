package Command.Example1;

public class CopyCommand extends Command{
    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard=editor.textField.getSelectedText();
        return false;
    }
}
/**Підклас Command, що представляє команду копіювання тексту.
 * Реалізує метод execute(), який копіює виділений текст у буфер обміну.**/
