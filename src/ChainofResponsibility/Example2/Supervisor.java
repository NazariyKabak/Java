package ChainofResponsibility.Example2;

public class Supervisor extends Handler {
    @Override
    public void handleRequest(int days) {
        if (days<=5){
            System.out.println("Supervisor approves the leave request for"+days+" days.");
        }else if (successor!=null){
            successor.handleRequest(days);
        }
    }
}
