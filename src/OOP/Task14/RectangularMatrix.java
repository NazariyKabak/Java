package OOP.Task14;

public class RectangularMatrix {

    private String result="";

    public static boolean verify(int n, int m){
        if(n<=0&&m<=0){
            return false;
        }
        return true;
    }

    public static int[][] genMatrix(final int Max, final int Min,int n, int m){
        int [][]a = new int[n][m];
        for(int r=0;r<a.length;r++){
            for(int c=0;c<a[r].length;c++){
                a[r][c]=(int)(Math.random()*(Max-Min)+Min);
            }
        }
        return a;
    }

    public int min(int [][]a){
        int min=a[0][0];
        for(int r=0;r<a.length;r++){
            for(int c=0;c<a[r].length;c++){
                if(a[r][c]<min){
                    min=a[r][c];
                }
            }
        }
        return min;
    }
    RectangularMatrix maxOnEvenIndex(int [][]a){
        int max=a[0][0];
        for(int r=0;r<a.length;r++){
            for(int c=0;c<a[r].length;c++){
                if(r%2==0&&c%2==0&& a[r][c]>max){
                    max=a[r][c];
                }
            }
        }
        result=new Integer(max).toString();
        return this;
    }

    public String getResult() {
        return result;
    }


    public static String toString(int [][]a) {
        String result="";
        for(int r=0;r<a.length;r++){
            for(int c=0;c<a[r].length;c++){
                result+=a[r][c]+" ";
            }
            result=result+"\n";
        }
        return result;
    }

}
