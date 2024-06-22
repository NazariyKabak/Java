package ChainofResponsibility.Example1;
/**Перевіряє роль користувача.**/
public class RoleCheckMiddleware extends Middleware{
    @Override
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello Admin");
            return true;
        }
        System.out.println("Hello User");
        return checkNext(email,password);
    }
}
/**Цей клас перевіряє роль користувача за введеним email.
 * Якщо email співпадає з email адміністратора, то виводиться повідомлення про вітання адміністратора**/
