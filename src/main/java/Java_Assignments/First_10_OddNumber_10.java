package Java_Assignments;

public class First_10_OddNumber_10 {

	public static void main(String[] args) 
	{
		int count =0;
		for(int i=1; ; i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
				count++;
				if(count ==10)
				{
					break;
				}
			}
			
		}

	}

}
