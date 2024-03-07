/*5. Input a string which contains some palindrome substrings. 
Find out the position of palindrome substrings if exist and replace it by *. 
(For example if input string is “bob has a radar plane” 
then it should convert in “*** has a ***** plane”.  */


import java.util.*;
class D3Asgn5{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str=s.nextLine();
		String pal=repPal(str);
		System.out.println("replaced string is :"+pal);
	}
	public static String repPal(String str){
	 String st[]=str.split(" ");
	 StringBuilder res=new StringBuilder();
	 for(String s1:st){
	   if(isPal(s1))
		res.append("*".repeat(s1.length())).append(" ");
	   else
		res.append(s1).append(" ");
	}
	return res.toString().trim();
}	public static boolean isPal(String s1){
	 String rev=new StringBuilder(s1).reverse().toString();
	 return s1.equalsIgnoreCase(rev);
}}