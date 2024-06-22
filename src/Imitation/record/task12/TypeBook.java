package Imitation.record.task12;

public record TypeBook(String name) {
    @Override
    public String toString() {
        return "TypeBook{" +
                "name='" + name + '\'' +
                '}';
    }
}
