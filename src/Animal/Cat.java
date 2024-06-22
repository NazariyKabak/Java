package Animal;

public class Cat implements   Animal{
    @Override
    public void speek(char c) {
        System.out.println("Cat!" + c);
    }
}
