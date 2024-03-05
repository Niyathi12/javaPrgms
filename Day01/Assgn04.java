/*4. Input the marks of Robert in three subjects using Scanner (each out of 100 ), write a program to calculate his total marks and percentage marks.*/
import java.util.Scanner;
class Assgn04{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter sub1 marks: ");
		int sub1=s.nextInt();
		System.out.print("Enter sub2 marks: ");
		int sub2=s.nextInt();
		System.out.print("Enter sub3 marks: ");
		int sub3=s.nextInt();
		int tot =sub1+sub2+sub3;
		System.out.print("Total marks obtained : " + tot);
		int percent = (tot/300)*100;
		System.out.println("Percentage of marks : "+percent);
	}
}