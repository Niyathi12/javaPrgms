public class Employee {
    private String name;
    private int year;
    private String address;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", address='" + address + '\'' +
                '}';
    }

    public Employee() {
    }

    public Employee(String name, int year, String address) {
        this.name = name;
        this.year = year;
        this.address = address;
    }
    public void details(String name,int year,String address){
        System.out.println(name+"\t\t"+year+"\t\t"+address);
    }
}
