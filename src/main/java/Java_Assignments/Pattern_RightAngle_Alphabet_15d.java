package Java_Assignments;

public class Pattern_RightAngle_Alphabet_15d {

	public static void main(String[] args) 
	{
		
		System.out.println("Using index as Numbers");
		for(int i = 1; i<=5; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				char letter = (char) ('a' + j - 1);
				System.out.print(letter + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Using index as char");
		for(char a = 'A'; a<='E'; a++)
		{
			for(char b = 'A'; b<=a; b++)
			{
				//char letter = (char) ('a' + j - 1);
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}

}
