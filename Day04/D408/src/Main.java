/*8. Create a class called 'Matrix' containing constructor that initializes the number of
rows and number of columns of a new Matrix object. The Matrix class has the following information:
1 - number of rows of matrix
2 - number of columns of matrix
3 - elements of matrix in the form of 2D array
The Matrix class has methods for each of the following:
1 - get the number of rows
2 - get the number of columns
3 - set the elements of the matrix at given position (i,j)
4 - adding two matrices. If the matrices are not addable, "Matrices cannot be added"
 will be displayed.
5 - multiplying the two matrices */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int m1=s.nextInt();
        int n1=s.nextInt();
        Matrix mt=new Matrix(m1,n1);
        //int mat1[][]=new int[m1][n1];
        for(int i=0;i<m1;i++){
            for(int j=0;j<n1;j++) {
                int ele = s.nextInt();
                mt.setElement(i, j, ele);
            }
        }
        int m2=s.nextInt();
        int n2=s.nextInt();
        Matrix mt2=new Matrix(m2,n2);
        for(int i=0;i<m2;i++){
            for(int j=0;j<n2;j++) {
                int ele = s.nextInt();
                mt2.setElement(i, j, ele);
            }
        }
        Matrix sum=mt.add(mt2);
        if(sum!=null){
            System.out.println("Addition is : ");
            sum.printMat();
        }
        Matrix pro=mt.multi(mt2);
        if(pro!=null){
            System.out.println("Multiplication is : ");
            pro.printMat();
        }

    }
}
