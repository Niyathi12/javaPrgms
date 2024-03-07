/*1. Define two methods to print the maximum and the minimum number respectively 
among three numbers entered by user.*/

import java.util.*;
class Dme1{
	public static int Max(int n1,int n2,int n3){
	 if(n1>n2 && n1>n3)
		return n1;
	 else if(n2>n1 && n2>n3)
		return n2;
	else 
		return n3;
	}
	public static int Min(int n1,int n2,int n3){
	 if(n1<n2 && n1<n3)
		return n1;
	 else if(n2<n1 && n2<n3)
		return n2;
	else 
		return n3;
	}
	public static void main(String[] args){
	 Scanner s=new Scanner(System.in);
	 System.out.print("Enter num1: ");
	 int num1=s.nextInt();
	 System.out.print("Enter num2: ");
	 int num2=s.nextInt();
	 System.out.print("Enter num3: ");
	 int num3=s.nextInt();
	System.out.println("Max of 3 numbers: "+Max(num1,num2,num3));
	System.out.println("Min of 3 numbers: "+Min(num1,num2,num3));
}}