package Java_Self_Practice;

public class For_NestedLoop_SquareSTARwithSplit_5Line_PATTERN {

	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i==1|| i==5||j%2==1)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
