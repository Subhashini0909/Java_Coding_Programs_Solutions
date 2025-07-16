package Java_Self_Practice;

public class For_NestedLoop_AAAAA_BBBBB_CCCCC_5Line_PATTERN {

	public static void main(String[] args) 
	{
		
		//Method 1
		char ch = 'A';
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print(ch + " ");
			}
			ch = (char) (ch+1);
			System.out.println();
		}

		System.out.println("**************************************************");
		//Method 2
		String a = "ABCDE";
		
		for(int i = 0; i<a.length(); i++)
		{
			for(int j = 0; j<a.length(); j++)
			{
				System.out.print(a.charAt(i) + " ");
			}
			System.out.println();
		}
	}
	

}
