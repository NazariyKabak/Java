package OOP.Task13;

public class Library {

    public boolean verify(int n, int m){
        if(n<=0 && m<=0){
            return false;
        }
        return true;
    }

    public static int [] genArray(final int MIN, final int MAX, int n, int m){
        int [] arr = new int[n*m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i*m+j] = (int) (Math.random()*(MAX-MIN)+MIN);
            }
        }
        return arr;
    }

    public static int min(int []arr, int n, int m){
        int min = arr[0];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(min>arr[i*m+j]){
                    min = arr[i*m+j];
                }
            }
        }
        return min;
    }
    public static int maxEvenIndex(int []arr, int n, int m){
        int max = arr[0];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if (i%2==0 && j%2==0 && max<arr[i*m+j]){
                    max = arr[i*m+j];
                }
            }
        }
        return max;
    }


    public static String toString(int [] arr, int n, int m) {
        StringBuilder str = new StringBuilder();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                str.append(" ").append(arr[i * m + j]);
            }
        }
        return str.toString();
    }
}
