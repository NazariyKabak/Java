package Imitation.record.task12;

public record TypeJournal(String name) {
    @Override
    public String toString() {
        return "TypeJournal{" +
                "name='" + name + '\'' +
                '}';
    }
}
