/*4. Write a program to check if a given string is a Palindrome.
A palindrome reads same from front and back e.g.- aba, ccaacc, mom, etc.*/



import java.util.*;
class D3Asgn4{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String org=s.nextLine();
		String rev="";
		for(int i=org.length()-1;i>=0;i--)
			rev+=org.charAt(i);
		if(org.equals(rev))
		  System.out.println(org+" is a palindrome");
		else
		   System.out.println(org+" is not a palindrome");
}}