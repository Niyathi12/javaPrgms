/*6. Write a program to convert Fahrenheit into Celsius. Input the value using scanner.*/

import java.util.Scanner;
class Assign06{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Fahrenheit value : ");
		float f=s.nextFloat();
		float c = (float)(5.0/9.0)*(f-32);
		System.out.println("Fahrenheit to celsius value is : "+ c);
	}
}
		