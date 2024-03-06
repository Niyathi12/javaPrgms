/* 3. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
allow student to sit if he/she has medical cause. 
Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly. */

import java.util.*;
class Ques3{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of classes held: ");
		int held=s.nextInt();
		System.out.print("Enter the number of classes attended: ");
		int attend=s.nextInt();
		int perct=(attend/held)*100;
		System.out.print("Enter if you have medical cause or not [Y/N] : ");
		String ch=s.next();
		switch(ch){
			case "Y" :
				System.out.println("Student is allowed to sit in the class");
				break;
			case "N":
				if (perct >= 75)
					System.out.println("Student is allowed to sit in the class");
				else
					System.out.println("Student is not allowed to sit in the class");
				break;
			default:
				System.out.println("Plz enter Y or N only");
		}
	}
}
		