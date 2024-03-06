/*6. Initialize and print all elements of a 2D array.*/

import java.util.*;
class AfQues6{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		int c=s.nextInt();
		int[][] arr=new int[r][c];
		System.out.print("Enter elements of array: ");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++)
				arr[i][j]=s.nextInt();
		}
		System.out.println("2D array is: ");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
}}