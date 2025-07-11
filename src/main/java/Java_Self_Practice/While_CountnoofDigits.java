package Java_Self_Practice;

public class While_CountnoofDigits {

	public static void main(String[] args) 
	{
		int n = 52324;
		int count=0;
		
		while(n>0)
		{
			count++;
			n = n/10;
			
		}
		System.out.println(count);

	}

}
