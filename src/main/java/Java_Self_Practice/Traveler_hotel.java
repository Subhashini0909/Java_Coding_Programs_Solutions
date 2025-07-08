package Java_Self_Practice;

import java.util.Scanner;

public class Traveler_hotel {

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Welcome to ABC Hotel");
		
		Thread.sleep(3000);
		Scanner sc = new Scanner(System.in);
		System.out.print("Are you returning customer(Yes/No)? ");
		String Yes_No = sc.next();
		Thread.sleep(3000);
		
		if(!Yes_No.equalsIgnoreCase("no"))
		{
			System.out.println("Congratualation!! You have got 10% discount on your stay");
		}
		System.out.println("Enjoy your stay here");

	}

}
