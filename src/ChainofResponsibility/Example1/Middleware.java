package ChainofResponsibility.Example1;

 /**Базовий клас перевірок**/
public abstract class Middleware {
    /**Будує ланцюжки об’єктів проміжного програмного забезпечення.**/
    private Middleware next;
    public static Middleware link(Middleware first, Middleware...chain) {
        Middleware head=first;
        for (Middleware nextInChain : chain) {
            head.next=nextInChain;
            head=nextInChain;
        }
        return first;
    }
    /**Підкласи реалізують цей метод за допомогою конкретних перевірок.**/
    public abstract boolean check(String email, String password);

    /** Запускає перевірку наступного об’єкта в ланцюжку або завершує обхід, якщо ми перебуваємо в останньому об’єкті в ланцюжку.**/
    protected boolean checkNext(String email, String password) {
        if (next==null){
            return true;
        }
        return next.check(email,password);
    }
}
/**Це абстрактний клас, який визначає основу для всіх класів-перевірок.
 * Він містить в собі посилання на наступний об'єкт Middleware у ланцюжку.
 * Має абстрактний метод check(), який буде реалізований в підкласах з конкретною логікою перевірки.
 * Метод checkNext() викликає перевірку наступного об'єкта Middleware у ланцюжку.**/
