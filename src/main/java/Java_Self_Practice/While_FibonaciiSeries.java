package Java_Self_Practice;

public class While_FibonaciiSeries {

	public static void main(String[] args) 
	{
		int n =20;
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		int c=a+b;
		while(c<=n)
		{
			
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}

	}

}
