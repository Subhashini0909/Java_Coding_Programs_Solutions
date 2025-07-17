package Java_Self_Practice;

public class StringReverse {

	public static void main(String[] args) {
		String a = "Subha";

		for(int i=a.length()-1; i>=0; i--)
		{
			char ch = a.charAt(i);
			System.out.print(ch);
		}
		
		System.out.println();
		System.out.print("String Builder: ");
		String rev = new StringBuilder(a).reverse().toString();
		System.out.println(rev);
	}

}

