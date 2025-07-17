package Java_Self_Practice;

public class StringMethods_ignorecase {

	public static void main(String[] args) 
	{
		String a = "abcd";
		String b = "ABCD";
		String c = new String("ABCD");
		System.out.println(b.equalsIgnoreCase(a));
		System.out.println(c.equalsIgnoreCase(a));

	}

}
