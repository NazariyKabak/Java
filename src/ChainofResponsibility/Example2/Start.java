package ChainofResponsibility.Example2;

public class Start {
    public static void main(String[] args) {
        Handler supervisor = new Supervisor();
        Handler manager=new Maneger();
        Handler director=new Director();
        supervisor.setSuccessor(manager);
        manager.setSuccessor(director);
        supervisor.handleRequest(7);
    }
}
