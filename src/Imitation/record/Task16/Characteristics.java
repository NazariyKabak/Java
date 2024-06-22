package Imitation.record.Task16;

public record Characteristics(String behavior, String performance, String attendance) {
    @Override
    public String toString() {
        return "Characteristics{" +
                "behavior='" + behavior + '\'' +
                ", performance='" + performance + '\'' +
                ", attendance='" + attendance + '\'' +
                '}';
    }
}
