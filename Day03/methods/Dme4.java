/*4. Using recursion, define a method to know nth term of a Fibonacci series.
Nth term of Fibonacci series is
F(n) = F(n-1)+(n-2)
F(0) = 0
F(1) = 1
F(2) = F(1)+(0) = 1+0 = 1
F(3) = F(2)+(1) = 1+1 = 2
F(4) = F(3)+(2) = 2+1 = 3*/


import java.util.*;
class Dme4{
	public static void main(String[] args){
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter number: ");
	int n=s.nextInt();
	int f=fib(n);
	System.out.println(n+" th term of fibonacci is: "+f);
	}
 public static int fib(int num){
  if(num==0)
   return num;
  else if(num==1)
  return num;
 else
   return fib(num-1)+fib(num-2);
}
}