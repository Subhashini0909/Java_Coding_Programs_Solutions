package Java_Self_Practice;

public class While_GreatestDigit_fromgivenNo {

	public static void main(String[] args) 
	{
		int n = 3495654;
		int LD,max = n%10;
		//System.out.println(max);
		while(n>0)
		{
			LD = n%10;
			if(LD>max)
			{
				max=LD;
			}
			n=n/10;
		}
		System.out.println(max);
	}

}
