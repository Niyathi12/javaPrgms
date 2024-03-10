public class Marks {
    int roll,s1,s2,s3;

    @Override
    public String toString() {
        return "Marks{" +
                "roll=" + roll +
                ", s1=" + s1 +
                ", s2=" + s2 +
                ", s3=" + s3 +
                '}';
    }

    public Marks() {
    }

    public Marks(int roll, int s1, int s2, int s3) {
        this.roll = roll;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    public int avg(int s1,int s2,int s3){
        return (s1+s2+s3)/3;
    }
}
