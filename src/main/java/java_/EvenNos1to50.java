package java_;

public class EvenNos1to50 {

	public static void main(String[] args) {
		
		System.out.println("FOR LOOP");
		for(int i=2; i<=50; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		
		System.out.println();
		System.out.println("WHILE LOOP");
		int j=2;
		while(j<=50)
		{
			if(j%2==0)
			{
				System.out.println(j);
				j+=2;
			}
		}
		System.out.println();
		System.out.println("DO WHILE LOOP");
		
		int z=2;
		do
		{
			System.out.println(z);
			z+=2;
		}
		while(z<=50);

	}

}
