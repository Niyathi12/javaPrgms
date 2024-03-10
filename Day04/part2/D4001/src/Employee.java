
public class Employee {
   private String name,doj;
   private int salary;

    @java.lang.Override
    public java.lang.String toString() {
        return "Employee{" +
                "name=" + name +

                ", salary=" + salary +
                ", doj=" + doj +
                '}';
    }

    public Employee() {
    }

    public Employee(String name, int salary,String doj) {
        this.name = name;
        this.salary = salary;
        this.doj = doj;
    }
    public void details() {
        System.out.println("Name: " + name + "\t Salary: " + salary + "\t Date of Joining: " + doj);
    }
}
