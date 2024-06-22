package Imitation.record.task13;

public record ISSN(String issn) {
    @Override
    public String toString() {
        return "ISSN: " + issn;
    }
}
