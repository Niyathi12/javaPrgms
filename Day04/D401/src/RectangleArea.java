import java.util.*;
public class RectangleArea {
    public static void main(String[] args) {
        Area rec=new Area();
        Scanner s=new Scanner(System.in);
        int l=s.nextInt();
        int b=s.nextInt();
        rec.setDim(l,b);
        int res=rec.getArea();
        System.out.print(res);
    }
}
