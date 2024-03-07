/*6. Define a method named 'perfect' that determines if parameter number is a perfect number.
 Use this function 
in a program that determines and prints all the perfect numbers between 1 and 1000.
[An integer number is said to be "perfect number" if its factors, 
including 1(but not the number itself), sum to the number. 
E.g., 6 is a perfect number because 6=1+2+3].*/


import java.util.*;
class Dme6{
	public static void main(String[] args){
	 Scanner s=new Scanner(System.in);
	for(int i=1;i<=1000;i++){
        if(perfect(i)){
   	 System.out.println(i); }
        }
}public static boolean perfect(int n){
 if(n<=1)
 return false;
 int sum=1;
 for(int i=2;i<=Math.sqrt(n);i++){
  if(n%i==0) {
   sum+=i;
   if(i!=n/i)
 	sum+=n/i;
}}
return sum==n;
}}
