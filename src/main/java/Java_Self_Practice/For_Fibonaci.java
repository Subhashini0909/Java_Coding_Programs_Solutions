package Java_Self_Practice;

public class For_Fibonaci {

	public static void main(String[] args) 
	{
		int a=0; int b =1;
		System.out.println(a);
		System.out.println(b);
		int c=a+b;
		for(int i=0; i<=5; i++)
		{
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
			
		}

	}

}
