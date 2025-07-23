package Java_Self_Practice;

public class String_Count_Words {

	public static void main(String[] args) 
	{
		String a = "Java has 2 main types of classes.";
		int count=0;
		
		String[] b = a.split(" ");
		
		for(String c: b)
		{
			count++;
		}
		System.out.println(count);

	}

}
