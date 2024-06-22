package Animal;

public interface Animal {

    static Animal createAnimal(String type){
        if (type.equalsIgnoreCase("cat")){
            return new Cat();
        } else if (type.equalsIgnoreCase("dog")) {
            return new Dog();
        }else return new Animal() {
            @Override
            public void speek(char c) {
                System.out.println(" !" + c);
            }
        };
    }
    default void say(String say){
        for (int i=0;i<say.length();i++){
            speek(say.charAt(i));
        }
        System.out.println();
    }

     void speek(char c);
}
