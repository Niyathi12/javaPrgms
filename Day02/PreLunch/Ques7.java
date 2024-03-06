/*7. Write a program to find greatest common divisor (GCD) 
or highest common factor (HCF) of given two numbers */

import java.util.*;
class Ques7{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int gcd=1;
		System.out.print("Enter 1st number: ");
		int a=s.nextInt();
		System.out.print("Enter 2nd number: ");
		int b=s.nextInt();
		for(int i=1;i<=a&&i<=b;i++){
			if(a%i==0 && b%i==0)
				gcd=i;
		}
		System.out.println("Gcd is : "+gcd);
}}
					