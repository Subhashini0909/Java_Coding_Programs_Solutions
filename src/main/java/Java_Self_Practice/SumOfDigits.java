package Java_Self_Practice;

public class SumOfDigits {

	public static void main(String[] args) 
	{
		int n =5232;
		
		int sum = 0, LD =0;
		
		while(n>0)
		{
			LD=n%10; //Get last digit
			sum = sum+LD; //Add to sum
			n=n/10; //Remove last digit
		}
		System.out.println(sum);

	}

}
