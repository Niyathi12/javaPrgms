/*9. Write a program to calculate the sum of the digits of a 3-digit number.
Number : 132        Output : 6
Input the number using scanner. */

import java.util.Scanner;
class Assign09{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a 3 digit number: ");
		int num=s.nextInt();
		int fd=num/100;
		int temp=num/10;
		int sd=temp%10;
		int ld=num%10;
		System.out.println("Sum of digits is: "+ (fd+sd+ld));
	}
}