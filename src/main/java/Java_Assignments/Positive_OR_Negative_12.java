package Java_Assignments;

import java.util.Scanner;

public class Positive_OR_Negative_12 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
			if(n<0)
			{
			System.out.println("Negative");
			}
			
			else if(n>0)
			{
				System.out.println("Positive");
			}
			
			else
			{
				System.out.println("Zero");
			}

	}

}
