package Imitation.record.Task16;

public record GptuStudent(String name, String specialization, int year) {

    @Override
    public String toString() {
        return "GptuStudent{" +
                "name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", year=" + year +
                '}';
    }
}
