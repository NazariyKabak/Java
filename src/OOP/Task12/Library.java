package OOP.Task12;

public class Library {
    private int indMax=0;
    public  boolean conditionVerify(int n){
        if (n<=0){
            System.out.println("Invalid number");
            return false;
        }
        return true;
    }

    public void generationArray(final double MAX,final double MIN, double[] arr){
        for (int i=0; i<arr.length; i++){
            arr[i]=Math.random()*(MAX-MIN)+MIN;

        }

    }
    public double minValue(double []arr){
        double min=arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    void ArrayDiv(double []arr){
        Library obj=new Library();
        double min=obj.minValue(arr);
        min = min != 0 ? min : 1;
        for (int i=0; i<arr.length; i++){
            arr[i]=arr[i]/min;
        }
    }
}
