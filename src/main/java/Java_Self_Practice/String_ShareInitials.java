package Java_Self_Practice;

public class String_ShareInitials {

	public static void main(String[] args) 
	{
		String name = "Subhashini Chithiraipandi";
		
		String split[] = name.split(" ");
		
		for(String copy: split)
		{
			//System.out.println(copy);
			char First_char = copy.charAt(0);
			System.out.print(First_char +".");
		}
		
		

		
	}

}
