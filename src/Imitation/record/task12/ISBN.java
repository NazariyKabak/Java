package Imitation.record.task12;

public record ISBN(String code) {
    @Override
    public String toString() {
        return "ISBN{" +
                "code='" + code + '\'' +
                '}';
    }
}
