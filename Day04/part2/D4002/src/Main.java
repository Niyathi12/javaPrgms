/*2. Write a program to print the roll number and average marks of 8 students
in three subjects (each out of 100). The marks are entered by user.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Marks m[]=new Marks[8];
        for(int i=0;i<8;i++) {
            System.out.print("rollno of student" + (i + 1) + " : ");
            int roll = s.nextInt();
            System.out.print("marks of sub1 : ");
            int s1 = s.nextInt();
            System.out.print("marks of sub2 : ");
            int s2 = s.nextInt();
            System.out.print("marks of sub3 : ");
            int s3 = s.nextInt();

            m[i] = new Marks(roll, s1, s2, s3);
            System.out.println("Average " + m[i].avg(s1, s2, s3));
        }
    }
}
