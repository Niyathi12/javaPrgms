/*10. Write a program to reverse a 3-digit number. 
E.g.-Number : 132        Output : 231
Input the number using scanner. */

import java.util.Scanner;
class Assign10{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter 3 digit no: ");
		int num=s.nextInt();
		int fd=num/100;
		int temp=num/10;
		int sd=temp%10;
		int ld=num%10;
		int rev = ld*100 + sd*10 +fd;
		System.out.println("Reverse of a number : "+rev);
}}