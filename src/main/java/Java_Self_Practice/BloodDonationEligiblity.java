package Java_Self_Practice;

import java.util.Scanner;

public class BloodDonationEligiblity {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Age: ");
		int age = sc.nextInt();
		System.out.print("Weight: ");
		double weight = sc.nextDouble();
		
		if(age<18)
		{
			if(weight >=50)
			{
				System.out.println("You are too young to donate blood");
			}
			else
				System.out.println("You are not eligible");
		}
		else
		{
			if(age>=18)
			{
				if(weight>=50)
				{
					System.out.println("You are eligible");
				}
				else
					System.out.println("You are underweight to donate blood");
			}
		}

	}

}
