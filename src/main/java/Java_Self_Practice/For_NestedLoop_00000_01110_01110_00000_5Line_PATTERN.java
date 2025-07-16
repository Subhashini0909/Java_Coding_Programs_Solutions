package Java_Self_Practice;

public class For_NestedLoop_00000_01110_01110_00000_5Line_PATTERN {

	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i==1||i==5||j==1||j==5)
				{
					System.out.print(0 + " ");
				}
				else
					System.out.print(1 + " ");
			}
			System.out.println();
		}
	}

}
