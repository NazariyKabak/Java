package OOP.Task14;

public class SquareMatrix {
    int[][] a =null;
    private static boolean verify(int n) {
        if (n<=0){
            return false;
        }
        return true;
    }
    SquareMatrix(int n) {
        a = new int[n][n];
    }
    int[][] getLineMatrix() {
        for (int i = 0; i < a.length; i++) {
            a[i][i] = 1;
        }
        return a;
    }

    int[][] getSpecialMatrix() {
        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a.length; c++) {
                a[r][c] = c+1;
            }
        }
        return a;
    }


}
