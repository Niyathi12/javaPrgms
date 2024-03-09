/*6. Write a program that would print the information (name, year of joining, salary, address)
 of three employees by creating a class named 'Employee'. The output should be as follows:

Name        Year of joining        Address
Robert            1994                64C- WallsStreet
Sam                2000                68D- WallsStreet
John                1999                26B- WallsStreet */
public class Main {
    public static void main(String[] args) {
        System.out.println("Name  Year of joining \t Address");
        Employee emp1=new Employee();
        Employee emp2=new Employee();
        Employee emp3=new Employee();
        emp1.details("Robert",1994,"64c-WallsStreet");
        emp2.details("John",1999,"26B-WallsStreet");
        emp3.details("Sam",2000,"68D=WallsStreet");
    }
}
