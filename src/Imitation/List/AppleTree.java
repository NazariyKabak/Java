package Imitation.List;

public class AppleTree {
    private int age;
    private String colorApple;

    public AppleTree(int age, String colorApple) {
        this.age = age;
        this.colorApple = colorApple;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColorApple() {
        return colorApple;
    }

    public void setColorApple(String colorApple) {
        this.colorApple = colorApple;
    }

    @Override
    public String toString() {
        return "AppleTree{" +
                "age=" + age +
                ", colorApple='" + colorApple + '\'' +
                '}';
    }
}
