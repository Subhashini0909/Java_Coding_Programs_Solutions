package Java_Self_Practice;

import java.util.Scanner;

public class While_ReversenoinSeparateLines {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no to reverse: ");
		int n = sc.nextInt();
		int lastdigit =0;
		
		while(n>0)
		{
			lastdigit = n%10;
			System.out.println(lastdigit);
			
			n=n/10;
			
		}
		

	}

}
