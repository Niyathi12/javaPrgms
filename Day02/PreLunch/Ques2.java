/*2. A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.*/

import java.util.*;
class Ques2{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the marks: ");
		int marks=s.nextInt();
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
}