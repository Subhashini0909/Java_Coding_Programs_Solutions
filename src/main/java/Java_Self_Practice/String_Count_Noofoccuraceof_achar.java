package Java_Self_Practice;

public class String_Count_Noofoccuraceof_achar {

	public static void main(String[] args) 
	{
		String a= "Java has 2 main types of classes";
		
		char freq = 's';
		int count=0;
		
		for(int i =0; i<=a.length()-1; i++)
		{
			a.toLowerCase();
			if(a.charAt(i) == 's')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
