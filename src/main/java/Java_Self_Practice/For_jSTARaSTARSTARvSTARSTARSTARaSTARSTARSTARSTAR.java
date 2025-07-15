package Java_Self_Practice;

public class For_jSTARaSTARSTARvSTARSTARSTARaSTARSTARSTARSTAR {

	public static void main(String[] args) {
		String a = "Java";
		int count = 0;
		
		for(int i = 0; i<a.length(); i++)
		{
			char c = a.charAt(i);
			System.out.print(c);
			for(int j = 0; j<=count; j++)
			{
				System.out.print("*");
			}
			count ++;
		}

	}

}
