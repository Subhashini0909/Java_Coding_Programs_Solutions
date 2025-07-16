package Java_Self_Practice;

public class While_SumofDigit {

	public static void main(String[] args) 
	{
		int n = 133;
		int ld;
		int sum =0;
		
		while(n>0)
		{
			ld = n%10;
			sum = sum+ld;
			n/=10;
			
		}
		System.out.println(sum);

	}

}
