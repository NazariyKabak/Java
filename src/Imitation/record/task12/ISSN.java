package Imitation.record.task12;

public record ISSN(String code) {
    @Override
    public String toString() {
        return "ISSN{" +
                "code='" + code + '\'' +
                '}';
    }
}
