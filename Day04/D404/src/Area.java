public class Area {
    private int l;
    private int b;

    public Area(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public Area() {
    }

    @Override
    public String toString() {
        return "Area{" +
                "l=" + l +
                ", b=" + b +
                '}';
    }
    public int returnArea(int l,int b){
        return l*b;
    }
}
