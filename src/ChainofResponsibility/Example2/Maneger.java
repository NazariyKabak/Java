package ChainofResponsibility.Example2;

public class Maneger extends Handler{
    @Override
    public void handleRequest(int days) {
        if (days<=10){
            System.out.println("Manager approves the leave request for " + days + " days.");
        } else if (successor!=null) {
            successor.handleRequest(days);
        }
    }
}
