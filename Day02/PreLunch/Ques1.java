/* 1. Take values of length and breadth of a rectangle from user and check if it is square or not.*/


/**creating java documentation 
*/ 
import java.util.*;
class Ques1{
/**program is to check square or not 
*in java
*/
	public static void main(String[] args){
/** this is the main method
*where executon starts
*/
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the Length: ");
		int len=s.nextInt();
		System.out.print("Enter the bredth: ");
		int bred=s.nextInt();
		if(len == bred){
			System.out.println("Given rectangle is also a square");
		}
		else
			System.out.println("Given rectangle is not a square");
	}
}