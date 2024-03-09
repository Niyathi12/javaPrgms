public class Employee {
    private int salary,workHrs;

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", workHrs=" + workHrs +
                '}';
    }
    public void getInfo(int salary,int workHrs){
        this.salary=salary;
        this.workHrs=workHrs;
    }
    public int addSal(int salary){
        return salary +10;
    }
    public int addWork(int salary,int workHrs){
        return salary+5;
    }
}
