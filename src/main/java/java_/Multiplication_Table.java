package java_;

public class Multiplication_Table {

	public static void main(String[] args) 
	
	{
		System.out.println("FOR LOOP");
		for(int i=1; i<=5; i++) {
			for(int j =1; j<=5; j++)
			{
				System.out.print("   " + i*j);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("While LOOP");
		System.out.println();
		int n=1;
		while(n<=5)
		{
			int m=1;
			while( m<=5)
			{
				System.out.print("   " + n*m);
				m++;
			}
			n++;
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Do While LOOP");
		System.out.println();
//		int x=1;
//		do
//		{
//			System.out.println();
//		}
//		while(x<=5);

	}
	
}
