package Java_Self_Practice;

public class String_Count_Space_digits_Vowels {

	public static void main(String[] args) {
		String check = "Java has 2 main types of classes";
		
		int vowels_count=0;
		int digit_count=0;
		int space_count=0;
		
		check = check.toLowerCase();
		
		for(int i=0; i<=check.length()-1; i++)
		{
			if(check.charAt(i)=='a' || check.charAt(i)=='e' || check.charAt(i)=='i' || check.charAt(i)=='o' || check.charAt(i)=='u')
			{
				vowels_count++;
			}
			else if(check.charAt(i)==' ')
			{
				space_count++;
			}
			else if(Character.isDigit(check.charAt(i)))
			{
				digit_count++;
			}
		}
		System.out.println("Spaces: " + space_count);
        System.out.println("Digits: " + digit_count);
        System.out.println("Vowels: " + vowels_count);
	}

}
