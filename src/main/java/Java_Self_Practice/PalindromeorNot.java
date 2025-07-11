package Java_Self_Practice;

public class PalindromeorNot {

	public static void main(String[] args) 
	{
		int n = 12210;
		int LD=0;
		int rev=0;
		int pal = n;
		
		while(n>0)
		{
			LD = n%10;
			rev = rev*10+LD;
			n=n/10;
		}
		if(rev == pal)
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not a palindrome");
	}

}
