/*
b.
1010101
10101 
  101  
   1   */

class Ques5b{
	public static void main(String[] args){
		for(int i=4;i>=1;i--){
			for(int j=1;j<=(2*i-1);j++)
				System.out.print((j%2 != 0)? 1:0);
			System.out.println();
		}
	}
} 