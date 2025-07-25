package Java_Self_Practice;

import java.util.Arrays;

public class String_Anagram {

	public static void main(String[] args) 
	{
		String a = "Heart";
		String b = "Earth";
		
		char[] a_char = a.toLowerCase().toCharArray();
		char[] b_char = b.toLowerCase().toCharArray();
		
		Arrays.sort(a_char);
		Arrays.sort(b_char);
		
		if(Arrays.equals(a_char, b_char))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
		

	}

}
