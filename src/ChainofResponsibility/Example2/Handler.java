package ChainofResponsibility.Example2;

import com.sun.net.httpserver.Request;

public abstract class Handler {
    protected Handler successor;
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
    public abstract void handleRequest(int days);
}
