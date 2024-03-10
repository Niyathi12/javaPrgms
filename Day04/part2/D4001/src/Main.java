/*1. Write a program to print the name, salary and date of joining of 10 employees
in a company. Use array of objects.*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Employee emp[]=new Employee[10];
        for(int i=0;i<10;i++){
            System.out.print("name of emp"+(i+1)+" : ");
            String name=s.nextLine();
            System.out.print("Salary of emp"+(i+1)+" : ");
            int sal=s.nextInt();
            System.out.print("doj of emp"+(i+1)+" : ");
            s.nextLine();
            String doj=s.nextLine();
            emp[i]=new Employee(name,sal,doj);

        }
        for(Employee e:emp)
            e.details();
    }
}
