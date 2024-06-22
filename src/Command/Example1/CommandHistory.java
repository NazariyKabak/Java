package Command.Example1;

import java.util.Stack;

public class CommandHistory {
    private Stack<Command> history = new Stack<>();
    public void push(Command c) {
        history.push(c);
    }
    public Command pop() {
        return history.pop();
    }
    public boolean isEmpty() {
        return history.isEmpty();
    }
}
/**Використовується для збереження історії виконаних команд.
 * Містить стек history, який зберігає команди.
 * Має методи push(Command c) для додавання команди до історії,
 * pop() для отримання та вилучення останньої команди з історії і isEmpty() для перевірки наявності команд у історії.**/