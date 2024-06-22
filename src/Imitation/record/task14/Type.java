package Imitation.record.task14;

public record Type(String category, String description, boolean isElectric) {
    @Override
    public String toString() {
        return "Type{" +
                "category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", isElectric=" + isElectric +
                '}';
    }
}
