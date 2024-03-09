public class Triangle {
    private int l;
    private int b;
    private int h;
    public Triangle() {
    }

    public Triangle(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }
    public void area(){
        System.out.println("Area of triangle is : "+(0.5)*l*b*h);
    }
    public void perimeter(){
        System.out.println("Perimeter of traingle is : "+(l+b+h));
    }
}
