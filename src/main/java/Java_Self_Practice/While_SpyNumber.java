package Java_Self_Practice;

public class While_SpyNumber {

	public static void main(String[] args) 
	{
		int n = 133, ld, sum =0, product = 1;
		
			while(n>0)
			{
				ld = n%10;
				sum+=ld;
				product*=ld;
				n/=10;
			}
			System.out.println("Sum: " +sum);
			System.out.println("Product: " +product);
	
	if(sum == product)
	{
		System.out.println("It's a Spy number");
	}
	else
		System.out.println("It's not a Spy number");
}
}
