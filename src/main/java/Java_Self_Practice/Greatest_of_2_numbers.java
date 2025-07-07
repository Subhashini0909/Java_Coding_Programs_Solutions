package Java_Self_Practice;

import java.util.Scanner;

public class Greatest_of_2_numbers {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		if(n1>n2)
		{
			System.out.println("N1 is greater");
		}
		else
			System.out.println("N2 is greater");
	}

}
