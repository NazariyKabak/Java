package ThreadTest;

import ThreadTest.adapter.ThreadIntegralCalc;
import ThreadTest.logic.IntegralCalculate;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    private double totalResult;
    private int finished;

    public void run() {
        double startTime = 0;
        double endTime = Math.PI;
        int n=100_000_000;
        IntegralCalculate calculate= new IntegralCalculate(startTime,endTime,n, Math::sin);
        long start = System.currentTimeMillis();
        totalResult=0;
        int nThreads=100;
        double delta = (endTime-startTime)/nThreads;
        //todo start threads
        for(int i=0; i<nThreads; i++) {
            ThreadIntegralCalc calc=new ThreadIntegralCalc(
                    startTime+i* delta,
                    start+i*delta+delta,
                    n/nThreads,
                    Math::sin,this);
            new Thread(calc).start();
        }
        //todo wait until all finished
        try {
            while (finished<n){
                wait();
            }
        }catch (InterruptedException ignored) {
           
        }



        long end = System.currentTimeMillis();
        System.out.println(totalResult);
        System.out.println(end-start);
    }

    public void sendResult(double v) {
        totalResult += v;
        finished++;
        notify();
    }
}
