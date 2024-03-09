

public class Student extends Strec {
    public Student(int rollno, String name, String address, double phnNo) {
        super(rollno, name, address, phnNo);
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{} " + super.toString();
    }
}
