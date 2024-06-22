package ChainofResponsibility.Example2;

public class Director extends Handler {
    @Override
    public void handleRequest(int days) {
        if (days > 10) {
            System.out.println("Director needs to review the leave request for " + days + " days.");
        } else if (successor!=null) {
            successor.handleRequest(days);
        }
    }
}
