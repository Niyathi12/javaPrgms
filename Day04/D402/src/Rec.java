/*2. Create a class named 'Student' with String variable 'name' and integer variable
'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an
object of the class Student. Assign and print the roll number, phone number and address of
two students having names "Sam" and "John" respectively by creating two objects of class
'Student'.

 */
public class Rec {
    public static void main(String[] args) {
      Student st1=new Student(1,"sam","Ap",533238);
      Student st2=new Student(2,"john","MP",533201);
        System.out.println(st1);
        System.out.println(st2);
    }
}
