package OOP.Task11;

public class Library {
    private int indMax=0;
    static boolean conditionVerify(int n){
        if (n<=0){
            System.out.println("Invalid number");
            return false;
        }
        return true;
    }

    static int [] generationArray(final int MIN,final int MAX,int n){
        int [] arr = new int[n];
        for (int i=0;i< arr.length;i++){
            arr[i]=(int)(Math.random()*(MAX-MIN)+MIN);
        }
        return arr;
    }
    int min(int [] arr){
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    void maxIndex(int[] arr){
        for (int i=0;i<arr.length;i++){
            if (arr[indMax]<=arr[i]){
                indMax=i;
            }
        }
    }

    public int getIndMax() {
        return indMax;
    }
}

