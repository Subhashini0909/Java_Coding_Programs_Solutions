package Java_Self_Practice;

public class While_ReverseaNumberinSameLine {

	public static void main(String[] args) 
	{
		int n = 35434;
		int LD = 0;
		
		while(n>0)
		{
			LD = n%10;
			System.out.print(LD);
			
			n=n/10;
		}

	}

}
