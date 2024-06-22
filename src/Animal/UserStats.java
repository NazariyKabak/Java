package Animal;

import java.util.Optional;

public class UserStats {
    private Optional<Long> visitCount;

    public UserStats(Long visitCount) {
        // Встановлюємо visitCount як Optional, враховуючи, що воно може бути null
        this.visitCount = Optional.ofNullable(visitCount);
    }

    public Optional<Long> getVisitCount() {
        return visitCount;
    }

    // Метод для встановлення кількості візитів (можливо, ззовнішнього джерела)
    public void setVisitCount(Long visitCount) {
        this.visitCount = Optional.ofNullable(visitCount);
    }
}
