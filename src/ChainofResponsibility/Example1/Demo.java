package ChainofResponsibility.Example1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;
    private static void init(){
        server=new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");
        /**Усі перевірки пов’язані. Клієнт може будувати різні ланцюжки, використовуючи ті самі компоненти.**/
        Middleware middleware = Middleware.link(
                new ThrottlingMiddleware(2),
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );

        /**Server gets a chain from client code.**/
        server.setMiddleware(middleware);
    }
    public static void main(String[] args) throws IOException {
        init();
        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = br.readLine();
            System.out.print("Enter password: ");
            String password = br.readLine();
            success = server.login(email, password);
        }while (!success);
    }
}
/**Цей клас містить точку входу програми.
 * ін створює екземпляр сервера, реєструє деяких користувачів і налаштовує ланцюжок Middleware для сервера.
 * Після ініціалізації він пропонує користувачеві ввести email та пароль,
 * і викликає метод login() сервера для авторизації.
 * Це відбувається в циклі do-while, доки авторизація не пройде успішно.**/