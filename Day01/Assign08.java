/* 
8. Write a program to calculate the sum of the first and the second last digit of a 5 digit.
E.g.- NUMBER : 12345        OUTPUT : 1+4=5 
Input the number using scanner. */

import java.util.Scanner;
class Assign08{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the 5 digit number : ");
		int n=s.nextInt();
		int fd=n/10000;
		int ld=n/10;
		int lastSec=ld%10;
		System.out.println("Sum of first and second last digit is : "+ (fd+lastSec));
	}
}