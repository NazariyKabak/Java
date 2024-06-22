package ThreadTest.logic;

import java.util.function.DoubleUnaryOperator;

public class IntegralCalculate {

    private double start;
    private double end;
    private int n;
    private DoubleUnaryOperator f;

    public IntegralCalculate(double start, double end, int n, DoubleUnaryOperator f) {
        this.start = start;
        this.end = end;
        this.n = n;
        this.f = f;
    }
    public double calculate() {
        double h = (end - start) / n;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            double x=start+i*h;
            double y=f.applyAsDouble(x);
            sum+=y;
        }
        return sum*h;
    }
}
