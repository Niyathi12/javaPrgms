/* 8. A three digit number is called Armstrong number if sum of cube of its digit is equal to number itself.
E.g.- 153 is an Armstrong number because (13)+(53)+(33) = 153.
Write all Armstrong numbers between 100 to 500.*/

class Ques8{
	public static void main(String[] args){
		int rem, temp, asn,n,i;
		for(i=100;i<=500;i++){
			asn=0;
			temp=i;
			while(temp!=0){
				rem=temp%10;
				temp/=10;
				n=rem*rem*rem;
				asn=n+asn;
			}
			if(asn==i)
			System.out.print(i+" ");
		}
	}
}