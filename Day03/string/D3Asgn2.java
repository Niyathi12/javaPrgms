/*2. Write a program that takes your full name as input and displays the abbreviations 
of the first and middle names except the last name which is displayed as it is. 
For example, if your name is Robert Brett Roser, then the output should be R.B.Roser. */

import java.util.*;
class D3Asgn2{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter your full name: ");
		String fname=s.nextLine();
		String name[]=fname.split(" ");
		StringBuilder abb=new StringBuilder();
		for(int i=0;i<name.length-1;i++) {
			String n=name[i];
			abb.append(n.charAt(0)).append(".");
		}abb.append(name[name.length-1]);
		System.out.println(abb);
}}