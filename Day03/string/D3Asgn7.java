/*7. Write a program to replace a given substring in a sentence with another string. For example,
 in the sentence, ” A batman with bat” if we replace ”bat” with ”snow”, 
the new sentence should be printed as ”A snowman with snow”.*/

import java.util.*;
class D3Asgn7{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str1=s.nextLine();
		System.out.print("Enter a replacable string: ");
		String str2=s.nextLine();
		System.out.print("Enter a replacing string: ");
		String str3=s.nextLine();
		String str4=str1.replace(str2,str3);
		System.out.println(str4);
}}