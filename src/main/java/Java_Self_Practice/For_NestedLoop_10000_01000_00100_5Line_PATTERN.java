package Java_Self_Practice;

public class For_NestedLoop_10000_01000_00100_5Line_PATTERN {

	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++)
		{
			for(int j = 1; j<=5; j++)
			{
				if(i==j)
				{
					System.out.print(1 + " ");
				}
				else
				{
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}

	}

}
