package Imitation.record.task1;

public record Pensioner(BaseInform inf, double pension) {
    @Override
    public String toString() {
        return "Pensioner:" +
                "inf=" + inf.name() +
                ", pension=" + pension +
                '}';
    }
}
