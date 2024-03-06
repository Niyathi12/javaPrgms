/*1. Take 10 integer inputs from user and store them in an array and print them on screen.*/

import java.util.*;
class AfQues1{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<10;i++) {
			System.out.print("Enter number "+(i+1)+" : ");
			arr[i]=s.nextInt();
		}
		System.out.print("Elements of array are: ");
		for(int i=0;i<10;i++)
		System.out.print(arr[i]+" ");
	}
}