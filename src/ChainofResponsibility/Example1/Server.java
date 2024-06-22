package ChainofResponsibility.Example1;

import java.util.HashMap;
import java.util.Map;

public class Server {
    private Map<String,String> users=new HashMap<>();
    private Middleware middleware;
    /**Клієнт передає серверу ланцюжок об’єктів.
     * Це підвищує гнучкість і полегшує тестування класу сервера.**/
    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }
    /**Сервер отримує електронну адресу та пароль від клієнта та надсилає запит на авторизацію в ланцюг.**/
    public boolean login(String email, String password) {
        if (middleware.check(email,password)){
            System.out.println("Authorization have been successful!");
            return true;
        }
        return false;
    }
    public void register(String email, String password) {
        users.put(email,password);
    }
    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }
    public boolean isValidPassword(String email,String password) {
        return users.get(email).equals(password);
    }
}
/**Цей клас представляє сервер, на якому відбувається процес авторизації.
 * Має метод login(), який викликає перевірку на ланцюжку Middleware для авторизації користувача.
 * Методи register(), hasEmail() і isValidPassword() використовуються для реєстрації користувачів,
 * перевірки наявності email та перевірки валідності пароля.**/