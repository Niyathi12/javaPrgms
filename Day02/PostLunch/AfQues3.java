/*3. Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s.*/


import java.util.*;
class AfQues3{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int arr[]=new int[20];
		int i=0;
		for( i=0;i<20;i++) {
			System.out.print("Enter number "+(i+1)+" : ");
			arr[i]=s.nextInt();
		}
		int p=0;
		int n=0;
		int e=0;
		int o=0;
		int z=0;
		for(i=0;i<20;i++){
			if(arr[i]>0)
				p+=1;
			else if(arr[i]<0)
				n+=1;
			else if(arr[i]==0)
				z+=1; }
		for(i=0;i<20;i++){
		 	if(arr[i]%2 == 0)
				e+=1;
			else
				o+=1;
		}
		System.out.println("Number of postive numbers are: "+p);
		System.out.println("Number of negitive numbers are: "+n);
		System.out.println("Number of zeroes are: "+z);
		System.out.println("Number of even numbers are: "+e);
		System.out.println("Number of odd numbers are: "+o);
	}
}