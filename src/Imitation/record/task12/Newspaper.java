package Imitation.record.task12;

public record Newspaper(String name) {
    @Override
    public String toString() {
        return "Newspaper{" +
                "name='" + name + '\'' +
                '}';
    }
}
