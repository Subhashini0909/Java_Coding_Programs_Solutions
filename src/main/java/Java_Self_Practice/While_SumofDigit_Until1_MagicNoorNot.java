package Java_Self_Practice;

public class While_SumofDigit_Until1_MagicNoorNot {

	public static void main(String[] args) 
	{
		int n = 120;
		int ld, sum = 0;
		while(n>10)
		{
			while(n>0)
			{
				ld = n%10;
				sum = sum+ld;
				
				n/=10;
			}
			n = sum;
			sum=0;
		}
		System.out.println(n);
		if(n ==1)
		{
			System.out.println("Magic Number");
		}
		else
		{
			System.out.println("Not a magic number");
		}

	}

}
