/*
5. Write a program that takes as input your gross salary and your total saving and uses another
 function named taxCalculator() to calculate your tax. 
The taxCalculator() function takes as parameters the gross salary as well as the total savings amount. The tax is calculated as follows:
(a) The savings is deducted from the gross income to calculate 
the taxable income. Maximum deduction of savings can be Rs. 100,000, even though the amount can be more than this.
(b) For up to 100,000 as taxable income the tax is 0 (Slab 0); beyond 100,000 to 200,000 tax is 10% of the difference above 100,000 (Slab 1); beyond 200,000 up to 500,000 the net tax is the tax calculated from Slab 0 and Slab 1 and then 20% of the taxable income exceeding 200,000 (Slab 2); if its more than 500,000, then the tax is tax 
from Slab 0, Slab 1, Slab 2 and 30% of the amount exceeding 500,000. */

import java.util.*;
class Dme5{
 public static void main(String[] args){
  Scanner s=new Scanner(System.in);
  System.out.print("Enter gross salary: ");
  double gs=s.nextDouble();
  System.out.println("Enter tital savings: ");
   double ts=s.nextDouble();
  double tax=taxCalculator(gs,ts);
  System.out.println(tax);
}
public static double taxCalculator(double gs, double ts){
 double ti=gs=Math.min(ts,100000);
 double tax=0;
 if(ti>500000){
  tax+=0.3*(ti-500000);
   ti=500000;}
 else if(ti>200000){
  tax+=0.2*(ti-200000);
   ti=200000;}
else if(ti>100000){
  tax+=0.1*(ti-100000);
   ti=200000;}
return tax;
}
}