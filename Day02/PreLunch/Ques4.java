/* 4. Take 10 integers from keyboard using loop and print their average value on the screen.*/

import java.util.*;
class Ques4{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<10;i++){
			System.out.print("Enter number"+(i+1)+" : ");
			int num=s.nextInt();
			sum+=num;
		}
		float avg= (float)sum/10;
		System.out.println("Average of 10 numbers is: "+avg);
	}
}