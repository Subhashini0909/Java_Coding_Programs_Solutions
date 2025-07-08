package Java_Self_Practice;

import java.util.Scanner;

public class FlightChecks {

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Welcome to Security Check in");
		
		Thread.sleep(3000);
		Scanner sc = new Scanner(System.in);
		System.out.print("Are you coming from connecting flight(Yes/No)? ");
		String Yes_No = sc.next();
		Thread.sleep(3000);
		
		if(Yes_No.equalsIgnoreCase("yes"))
		{
			System.out.println("Enjoy your fight");
		}
		else if(Yes_No.equalsIgnoreCase("No"))
		{
			System.out.println("Please proceed to security checks");
		}
		
//		if(Yes_No.equalsIgnoreCase("no"))
//		{
//			System.out.println("Please proceed to security checks");
//		}
//		System.out.println("Enjoy your fight");
	}

}
