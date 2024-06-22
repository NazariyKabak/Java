package Imitation.record.Task16;

public record UniversityStudent(String name, String faculty, int year) {
    @Override
    public String toString() {
        return "UniversityStudent{" +
                "name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                ", year=" + year +
                '}';
    }
}
