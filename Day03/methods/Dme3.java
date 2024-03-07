/*3. Print the multiplication table of 15 using recursion.*/

class Dme3{
	public static void main(String[] args){
	 int mul=15;
	 System.out.println("Multiplication of 15 is : ");
	 Multi15(mul,1);
	}
	public static void Multi15(int mul,int num){
		if(num<=10){
		 System.out.println(mul+" * "+ num+" = "+ mul*num);
		 Multi15(mul,num+1);
		}
	}
}