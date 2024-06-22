package Imitation.record.task15;

public record Registration(String number, String state, String expirationDate) {

    @Override
    public String toString() {
        return "Registration{" +
                "number='" + number + '\'' +
                ", state='" + state + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }
}
