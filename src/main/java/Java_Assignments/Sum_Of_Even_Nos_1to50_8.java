package Java_Assignments;

public class Sum_Of_Even_Nos_1to50_8 {

	public static void main(String[] args) 
	{
		int sum =0;
		for(int i = 2; i<=50; i+=2)
		{
			System.out.println(i);
			sum = sum+i;
		}
		
		
		System.out.println("The sum is : " + sum);
		
	}

}
