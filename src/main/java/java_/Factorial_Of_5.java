package java_;

public class Factorial_Of_5 {

	public static void main(String[] args) 
	{
		int n =5;
		int fact =1;
		
		for(int i=n; i>=1; i--)
		{
			
			fact= fact*i;
			
		}
		System.out.println(fact);
	}

}
