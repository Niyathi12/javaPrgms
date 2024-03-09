/*5. Print the average of three numbers entered by user by creating a class named
'Average' having a method to calculate and print the average.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        Average avg=new Average();
        System.out.println("Average of 3 numbers is : " +avg.average(a,b,c));
    }
}
