package Imitation.record.task13;

public record ISBN(String isbn) {
    @Override
    public String toString() {
        return "ISBN{" +
                "isbn='" + isbn + '\'' +
                '}';
    }
}
