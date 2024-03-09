/*4. Write a program to print the area of a rectangle by creating a class named
 'Area' taking the values of its length and breadth as parameters of its constructor
 and having a method named 'returnArea' which returns the area of the rectangle.
 Length and breadth of rectangle are entered through keyboard.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Area ar=new Area();
        int l=s.nextInt();
        int b=s.nextInt();
        System.out.println("Area of rectangle is : "+ar.returnArea(l,b));
    }
}
