/*6. Write down the names of 10 of your friends in an array and then sort those in alphabetically ascending order.
(HINT : USE the compareTo methid of String) */

import java.util.*;
class D3Asgn6{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String[] str=new String[10];
		for(int i=0;i<10;i++)
			str[i]=s.nextLine();
		String temp;
		for(int i=0;i<10;i++){
			for(int j=i+1;j<10;j++) {
			 if(str[i].compareTo(str[j])>0){
			   temp=str[i];
			   str[i]=str[j];
			    str[j]=temp;
		}}}
		System.out.print("Sorted array is: ");
		for(int i=0;i<10;i++)
		 System.out.print(str[i]+" ");
}}
		