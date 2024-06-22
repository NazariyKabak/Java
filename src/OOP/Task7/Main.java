package OOP.Task7;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    public void run() {
        Aninal[] aninals={new Bear("Bob"), new Cat("Ramzik"), new Dog("Gucci")};
        Vet vet=new Vet();
        for (Aninal aninal : aninals) {
            vet.treatAnimal(aninal);
        }
        for (Aninal aninal : aninals) {
            aninal.makeNoise();
            aninal.eat();
            System.out.println(aninal.getDescription());
        }

    }
}
