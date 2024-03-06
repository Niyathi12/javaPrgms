/*7. Find largest and smallest elements of an array.*/


import java.util.*;
class AfQues7{
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
		int lar=arr[0];
		int sml=arr[0];
		for(i=0;i<n;i++){
			if(arr[i]>lar)
				lar=arr[i];
			else if(arr[i]<sml)
				sml=arr[i];
		}
		System.out.println("Larges and smallest elements are: "+lar+" , "+sml);
}}