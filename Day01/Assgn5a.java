/*5. Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively, write two programs to swap the values of the two variables.
A - first program by using a third variable
*/

class Assgn5a{
	public static void main(String args[]){
		int a=6;
		int b= 8;
		System.out.println("Before swapping a and b avalues are : "+ a+" , "+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping a and b avalues are : "+ a+" , "+b);
	}
};