package Java_Self_Practice;

public class While_SumofDigit_untilGivenNois_SingleDigit {

	public static void main(String[] args) {
		
		int sum = 0, ld, n = 864;
		
		while(n>10)
		{
			while(n>0)
			{
			ld = n%10;
			//System.out.println(ld);
			sum = sum+ld;
			n/=10;
			}
n=sum;
sum=0;
		}
System.out.println(n);
	}

}
