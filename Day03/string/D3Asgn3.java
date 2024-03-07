/* 
3. Write a program to find the number of vowels, consonents, 
digits and white space characters in a string. */



import java.util.*;
class D3Asgn3{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str=s.nextLine();
		str=str.toLowerCase();
		int v=0,c=0,w=0;
		for(int i=0;i<str.length();i++){
			Character ch=str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			  v+=1;
			else if(ch>'a' && ch<='z')
			  c+=1;
			else if(ch==' ')
			  w+=1;
		}
		System.out.print("Vowels : "+v+" consonants : "+c+" white spaces: "+w);
}}
		