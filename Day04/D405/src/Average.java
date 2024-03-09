public class Average {
    private int a, b,c;

    @java.lang.Override
    public java.lang.String toString() {
        return "Average{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public Average() {
    }

    public Average(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int average(int a,int b,int c){
        return (a+b+c)/3;
    }
}
