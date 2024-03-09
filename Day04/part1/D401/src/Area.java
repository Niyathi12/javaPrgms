/*1. Write a program to print the area of a rectangle by creating a
class named 'Area' having two methods. First method named as 'setDim'
takes length and breadth of rectangle as parameters and
the second method named as 'getArea' returns the area of the rectangle.
 Length and breadth of rectangle are entered through keyboard.*/

public class Area {
    private int len;
    private int bred;

    public void setDim(int len, int bred) {
        this.len = len;
        this.bred = bred;
    }

    public int getArea() {
        return len * bred;
    }
}
