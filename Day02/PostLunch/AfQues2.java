/*2. Take 10 integer inputs from user and store them in an array. Again ask user to give a number. 
Now, tell user whether that number is present in array or not*/


import java.util.*;
class AfQues2{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<10;i++) {
			System.out.print("Enter number "+(i+1)+" : ");
			arr[i]=s.nextInt();
		}
		System.out.print("Enter an elemet: ");
		int ele=s.nextInt();
		boolean flag=false;
		for(int i=0;i<10;i++){
			if(arr[i]==ele) {
				flag=true;
				break; }
		}
		if(flag)
			System.out.print("Element is in the array");
		
		else
			System.out.print("Element is not in the array");
	}
}