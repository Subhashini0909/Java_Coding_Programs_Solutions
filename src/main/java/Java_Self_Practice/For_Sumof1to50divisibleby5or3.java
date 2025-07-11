package Java_Self_Practice;

public class For_Sumof1to50divisibleby5or3 {

	public static void main(String[] args) 
	{
		int sum=0;
		for(int i = 1; i<=50; i++)
		{
			if(i%5==0 || i%3==0)
			{
				sum = sum+i;
			}
		}
		System.out.println(sum);

	}

}
