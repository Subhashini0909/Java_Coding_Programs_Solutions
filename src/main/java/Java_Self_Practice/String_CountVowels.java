package Java_Self_Practice;

public class String_CountVowels {

	public static void main(String[] args) 
	{
		String a = "SubhashinI";
		
		int count =0;
		
		for(int i=0; i<=a.length()-1; i++)
		{
			a= a.toLowerCase();
			
			if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u')
			{
				count ++;
			}
		}
		System.out.println("No.of.vowels in "+ a + " is: " + count);
	}

}
