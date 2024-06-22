package Imitation.record.task8;

public record CompanyEmployee(String name, int age, int exp) {
    @Override
    public String toString() {
        return "CompanyEmployee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", exp=" + exp +
                '}';
    }
}
