package Java_Assignments;

import java.util.Scanner;

public class Factorial_Of_9_6 {

	public static void main(String[] args) 
	{
		int fact = 1;
		int n = 9;
		
		for(int i=1; i<=n; i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of 9 is : " + fact);
	}

}
