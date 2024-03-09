/*7. Write a program by creating an 'Employee' class having the following methods and print
the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as
parameter
2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day
 is more than 6 hours.*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sl=s.nextInt();
        int wrkhrs=s.nextInt();
        Employee emp=new Employee();
        if(sl<500 && wrkhrs>6){
            System.out.println(emp.addSal(sl)+emp.addWork(sl,wrkhrs)-sl);
        }
        else if(sl<500)
            System.out.println(emp.addSal(sl));
        else if(wrkhrs>6)
            System.out.println(emp.addWork(sl,wrkhrs));
    }
}
