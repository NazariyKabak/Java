package ThreadTest.adapter;

import ThreadTest.Main;
import ThreadTest.logic.IntegralCalculate;

import java.util.function.DoubleUnaryOperator;

public class ThreadIntegralCalc implements Runnable{

    private final IntegralCalculate integralCalculate;
    private final Main main;
    public ThreadIntegralCalc(double start, double end, int n, DoubleUnaryOperator f, Main main) {
        integralCalculate=new IntegralCalculate(start,end,n,f);
        this.main=main;
    }

    @Override
    public void run() {
        double v=integralCalculate.calculate();
        main.sendResult(v);
    }

}
