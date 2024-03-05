/*7. The total number of students in a class are 90 out of which 45 are boys. If 50% of the total students secured grade 'A' out of which 20 are boys, then write a program to calculate the total number of girls getting grade 'A'.*/

import java.util.Scanner;
class Assign07{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int totStd=90;
		int boys=45;
		int grdA=(int)(totStd*50/100);
		int boysGrdA=20;
		int girlsGrdA= grdA-boysGrdA;
		System.out.println("Total number of girls getting grade 'A' are "+girlsGrdA);
}}