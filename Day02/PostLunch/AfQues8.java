

import java.util.*;
class AfQues8{
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
System.out.println("Maximun difference is: "+(lar-sml));
		int sl=arr[0];
		int ss=arr[0];
		for(i=0;i<n;i++){
			if(arr[i]>lar){
				sl=lar;
				lar=arr[i];  }
			else if(arr[i]>sl && arr[i] != lar)
				sl=arr[i];
		}
		for(i=0;i<n;i++){
			if(arr[i]<sml){
				ss=sml;
				sml=arr[i];  }
			else if(arr[i]<ss && arr[i] != sml)
				ss=arr[i];
		}
		System.out.println("Minimun difference is: "+(sl-ss));
	}
}