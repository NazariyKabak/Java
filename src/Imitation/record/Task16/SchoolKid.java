package Imitation.record.Task16;

public record SchoolKid(String name, int grade, int age) {

    @Override
    public String toString() {
        return "SchoolKid{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", age=" + age +
                '}';
    }
}
