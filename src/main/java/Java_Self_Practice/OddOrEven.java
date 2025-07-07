package Java_Self_Practice;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) 
	{
		System.out.print("Enter a number to check odd or even: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println("Even");
		}
		
		else
			System.out.println("Odd");

	}

}
