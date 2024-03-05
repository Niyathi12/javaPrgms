/*1. Write a program to calculate the area and perimeter of the rectangle. Input Length and breadth using command line arguments.*/

class Assgn01{
	public static void main(String[] args){
		int len=Integer.parseInt(args[0]);
		int bred=Integer.parseInt(args[1]);
		int area= len * bred;
		int perimeter=2*(len+bred);
		System.out.println("Area of rectangle is: "+ area);
		System.out.println("Permiter of rectangle is: "+ perimeter);
	}
}