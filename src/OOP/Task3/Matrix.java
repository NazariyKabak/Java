package OOP.Task3;

public class Matrix {
    private double[][] matrix;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new double[rows][cols];
    }

    public Matrix(double[][] matrix) {
        this.rows=matrix.length;
        this.cols=matrix[0].length;
        this.matrix=new double[rows][cols];
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                this.matrix[i][j]=matrix[i][j];
            }
        }
    }

    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Matrix does not have the same number of rows and columns");
        }
        Matrix result = new Matrix(rows,cols);
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                result.matrix[i][j]=this.matrix[i][j]+other.matrix[i][j];
            }
        }
        return result;
    }
    public Matrix multiply(double scalar) {
        Matrix result = new Matrix(rows,cols);
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                result.matrix[i][j]=this.matrix[i][j]*scalar;
            }
        }
        return result;
    }
    public Matrix multiply(Matrix other) {
        if (this.cols!=other.rows) {
            throw new IllegalArgumentException("Matrix does not have the same number of rows and columns");
        }
        Matrix result = new Matrix(rows,cols);
        for (int i=0; i<this.rows; i++) {
            for (int j=0; j<other.cols; j++) {
                for (int k=0; k<this.cols; k++) {
                    result.matrix[i][j]=this.matrix[i][k]*other.matrix[k][j];
                }
            }
        }
        return result;
    }

    public void printMatrix() {
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
