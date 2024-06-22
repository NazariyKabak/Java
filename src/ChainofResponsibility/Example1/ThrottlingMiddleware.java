package ChainofResponsibility.Example1;
/**Перевірка на ліміт запитів.ConcreteHandler. Перевіряє, чи забагато невдалих запитів на вхід. **/
public class ThrottlingMiddleware extends Middleware{
    private int requestPerMinute;
    private int request;
    private long currentTime;
    public ThrottlingMiddleware(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }


    /**Зверніть увагу, що виклик checkNext() можна вставляти як на початку, так і в кінці цього методу.**/
    /**Це дає набагато більше гнучкості, ніж простий цикл по всіх об’єктах проміжного програмного забезпечення.
     * Наприклад, елемент ланцюжка може змінити порядок перевірок, виконавши свою перевірку після всіх інших перевірок.**/

    public boolean check(String email, String password){
        if (System.currentTimeMillis() - currentTime+60000 > requestPerMinute){
            request=0;
            currentTime=System.currentTimeMillis();
        }
        request++;
        if (request>requestPerMinute){
            System.out.println("Request limit exceeded!");
            Thread.currentThread().interrupt();
        }
        return checkNext(email,password);
    }
}
/**Цей клас перевіряє кількість невдалих запитів на авторизацію.
 * Якщо кількість запитів перевищує певне значення за певний час,
 * то він припиняє обробку запитів, виводить повідомлення і перериває потік.**/