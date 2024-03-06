/*5. Write a program to find the sum and product of all elements of an array.*/

import java.util.*;
class AfQues5{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		int i=0,sum=0,prod=1;
		for( i=0;i<n;i++) {
			System.out.print("Enter number "+(i+1)+" : ");
			arr[i]=s.nextInt();
		}
		for(i=0;i<n;i++){
			sum+=arr[i];
			prod*=arr[i];
		}
		System.out.println("Summ of elements of an array are: "+sum);
		System.out.println("product of elements of an array are: "+prod);
}}