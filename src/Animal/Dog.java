package Animal;

public class Dog implements Animal {
    @Override
    public void speek(char c) {
        System.out.println(" Dog!"+c);
    }

}
