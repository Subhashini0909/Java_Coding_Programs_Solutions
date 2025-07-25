package Java_Self_Practice;

public class String_CountSpace {

	public static void main(String[] args) 
	{
		
		String input = "Hello User, How are you?";
		
		int count =0;
		
		for(int i=0; i<=input.length()-1; i++)
		{
			if(input.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
