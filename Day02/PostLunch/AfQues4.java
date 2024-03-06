/*4. Take 10 integer inputs from user and store them in an array. 
Now, copy all the elements in an another array but in reverse order. */


import java.util.*;
class AfQues4{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int arr[]=new int[10];
		int i=0;
		for( i=0;i<10;i++) {
			System.out.print("Enter number "+(i+1)+" : ");
			arr[i]=s.nextInt();
		}
		int b[]=new int[10];
		int k=10;
		for(int j=0;j<10;j++){
			k--;
				b[j]=arr[k];
		}
		System.out.println("Elements in reverse order are: ");
		for(i=0;i<10;i++)
			System.out.print(b[i]+" ");
		}
}