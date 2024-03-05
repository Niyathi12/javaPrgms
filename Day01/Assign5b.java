/*5. Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively, write two programs to swap the values of the two variables.
B - second program without using any third variable
*/

class Assign5b{
	public static void main(String args[]){
		int a=6;
		int b= 8;
		System.out.println("Before swapping a and b avalues are : "+ a+" , "+b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After swapping a and b avalues are : "+ a+" , "+b);
	}
};