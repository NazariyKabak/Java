package Lambda;

public class Library {
    public static double newtonMethod(double x0, double eplison, Function f, Derivative df) {
        double prev =x0;
        double next = prev- f.lambda(prev)/df.lambda(prev);
        while (Math.abs(prev-next)>=eplison) {
            prev = next;
            next = prev- f.lambda(prev)/df.lambda(prev);
        }
        return prev;
    }
}
