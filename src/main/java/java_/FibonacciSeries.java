package java_;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		int i=0;
		int j=1;
		int c;
		
		System.out.println(i); //0
		System.out.println(j); //1
		
		for(int z = 1; z<=10; z++)
		{
			c=i+j;
			System.out.println(c);
			i=j;
			j=c;
		}
		

	}

}
