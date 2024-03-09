public abstract class Strec {
    private int rollno;
    private String name;
    private String address;
    private double phnNo;

    public Strec(int rollno, String name, String address, double phnNo) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
        this.phnNo = phnNo;
    }

    public Strec() {
    }

    @Override
    public String toString() {
        return "Strec{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phnNo=" + phnNo +
                '}';
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPhnNo() {
        return phnNo;
    }

    public void setPhnNo(double phnNo) {
        this.phnNo = phnNo;
    }
}
