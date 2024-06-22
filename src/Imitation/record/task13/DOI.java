package Imitation.record.task13;

public record DOI(String doi) {
    @Override
    public String toString() {
        return "DOI: " + doi;
    }
}
