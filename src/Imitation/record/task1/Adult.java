package Imitation.record.task1;

public record Adult(BaseInform inf, double income) {
    @Override
    public String toString() {
        return "Adult: " +inf.name()+" income: " +income;
    }
}
