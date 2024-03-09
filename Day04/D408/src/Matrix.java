public class Matrix {
    private int rows,cols;
    private int[][] elements;

    @java.lang.Override
    public java.lang.String toString() {
        return "Matrix{" +
                "rows=" + rows +
                ", cols=" + cols +
                ", elements=" + java.util.Arrays.toString(elements) +
                '}';
    }

    public Matrix() {
    }

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.elements=new int[rows][cols];
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }
    public void setElement(int i,int j,int k){
        if(i>=0 && i<rows && j>=0 && j<cols)
            elements[i][j]=k;
        else System.out.println("cannot set elements");
    }
    public Matrix add(Matrix mts) {
        if ((this.rows == mts.getRows()) && (this.cols == mts.getCols())) {
            Matrix res = new Matrix(rows, cols);
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++)
                    res.setElement(i, j, this.elements[i][j] + mts.elements[i][j]);
            }
            return res;
        } else {
            System.out.println("Matrix cant be added");
            return null;
        }
    }
    public Matrix multi(Matrix mts){
        if(this.cols==mts.getRows()){
            Matrix res=new Matrix(this.rows,mts.getCols());
            for(int i=0;i<this.rows;i++){
                for(int j=0;j<mts.getCols();j++){
                    int sum=0;
                    for(int k=0;k<this.cols;k++)
                        sum+=this.elements[i][k]*mts.elements[k][j];
                    res.setElement(i,j,sum);
                }
            }
            return res;
        }else {
            System.out.println("Multiplication is not possible");
            return null;
        }
        public void printMat()
        for(int i=0;i<mts.getRows();i++){
            for(int j=0;j<mts.getCols();j++)
                System.out.println(elements[i][j]);
            System.out.println();
        }
    }
}
