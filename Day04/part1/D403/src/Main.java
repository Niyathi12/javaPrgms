/*3. Write a program to print the area and perimeter of a triangle having
sides of 3, 4 and 5 units by creating a class named 'Triangle' with constructor
having the three sides as its parameters.
 */
public class Main {
    public static void main(String[] args) {
        Triangle tr=new Triangle(3,4,5);
        tr.area();
        tr.perimeter();
    }
}
