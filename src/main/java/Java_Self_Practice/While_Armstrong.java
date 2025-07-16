package Java_Self_Practice;

public class While_Armstrong {

	public static void main(String[] args) 
	{
		int a = 153;
		int copy =a;
		int LD;
		int sum=0;
		while(a>0)
		{
			LD = a%10;
			System.out.println("Last digit: " + LD);
			
			a/=10;
			System.out.println("a: " + a);
			
			int cube = LD*LD*LD;
			sum = sum + cube;
			System.out.println("Sum: " +sum);
		}
		
		if(copy == sum)
			System.out.println("Armstrong");
		else
			System.out.println("Not an armstrong");
	}

}
