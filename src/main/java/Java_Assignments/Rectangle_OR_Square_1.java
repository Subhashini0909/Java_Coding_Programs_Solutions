package Java_Assignments;

import java.util.Scanner;

public class Rectangle_OR_Square_1 {

	public static void main(String[] args) 
	{
//		int l = 10;
//		int b = 10;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		int l = sc.nextInt();
		
		System.out.print("Enter Breadth: ");
		int b = sc.nextInt();
		
		if(l!=b)
		{
			System.out.println("This is Rectangle");
		}
		if(l==b)
		{
			System.out.println("This is Square");
		}

	}

}
