package Imitation.record.task1;

public record Child(BaseInform inf, int iq) {
    @Override
    public String toString() {
        return "Child: " +
                "inf=" + inf.name() +
                ", iq=" + iq +
                '}';
    }
}
