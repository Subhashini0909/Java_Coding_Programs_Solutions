package Java_Self_Practice;

import java.util.Scanner;

public class PowerConsumend_inUnits_CalcAmount {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Total unit: ");
		int unit = sc.nextInt();

		double amount = 0;
		if(unit<=200)
		{
			amount = amount+unit*0.50;
		}
		else if(unit<=400)
		{
			amount = amount+unit*0.65+50;
		}
		else
			amount = amount+unit*0.85+220;
		
		System.out.println("Total amount: " + amount);
	}

}
