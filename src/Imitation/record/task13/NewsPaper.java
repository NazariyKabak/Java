package Imitation.record.task13;

public record NewsPaper(String title, String editor, String frequency) {
    @Override
    public String toString() {
        return "Newspaper: " + title + ", Editor: " + editor + ", Frequency: " + frequency;
    }
}
