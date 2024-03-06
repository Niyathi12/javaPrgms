/*6. Take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ). 
Print average and product of all numbers.*/

import java.util.*;
class Ques6{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int sum=0;
		int prod=1;
		int c=0;
		System.out.print("Enter a number: ");
		while(s.hasNextInt()){
			int n=s.nextInt();
			sum+=n;
			prod*=n;
			c++;
			System.out.println("Enter next number or enter 'q' to exit: ");
		}
		if(c>0){
			float avg=(float)sum/c;
			System.out.println("Avergae is : "+avg);
			System.out.println("product is : "+prod);
		}
	}
}