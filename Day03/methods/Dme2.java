/*2. Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail */

import java.util.*;
class Dme2{
	public static void Grade(int marks){
	if (marks>80) 
			System.out.println("Grade is 'A'");
		else if(marks > 60 && marks <= 80)
			System.out.println("Grade is 'B'");
		else if(marks > 50 && marks <=60)
			System.out.println("Grade is 'C'");
		else if(marks >45 && marks <= 50)
			System.out.println("Grade is 'D'");
		else if(marks > 25 && marks <= 45)
			System.out.println("Grade is 'E'");
		else
			System.out.println("Grade is 'F'");
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the marks: ");
		int mark=s.nextInt();
		if(mark>100)
		 System.out.println("Pls enter marks below 100");
		else
		 Grade(mark);}
	}	
