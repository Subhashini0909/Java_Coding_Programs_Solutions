package Java_Self_Practice;

import java.util.Scanner;

public class CalcTotalShippingCost_includingTax {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Shipping cost ");
		double Shipping_cost = sc.nextInt();
		
		if(Shipping_cost<=999)
		{
			Shipping_cost = Shipping_cost+Shipping_cost*0.5;
			System.out.println(Shipping_cost);
		}
		else if(Shipping_cost<=1999)
		{
			Shipping_cost = Shipping_cost+Shipping_cost*0.10;
			System.out.println(Shipping_cost);
		}
		else if(Shipping_cost<=4999)
		{
			Shipping_cost = Shipping_cost+Shipping_cost*0.15;
			System.out.println(Shipping_cost);
		}
		else
		{
			Shipping_cost = Shipping_cost+Shipping_cost*0.20;
			System.out.println(Shipping_cost);
		}

	}

}
