package ChainofResponsibility.Example1;

/**Перевіряє, чи існує користувач із вказаними обліковими даними.**/
public class UserExistsMiddleware extends Middleware{
    private Server server;
    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)){
            System.out.println("Email does not exist");
            return false;
        }
        if (!server.isValidPassword(email,password)){
            System.out.println("Password does not match");
            return false;
        }
        return checkNext(email,password);
    }
}
/**Цей клас перевіряє наявність користувача з введеними обліковими даними.
 * Перевіряє, чи існує введений email і чи співпадає введений пароль з паролем, пов'язаним з цим email.**/
