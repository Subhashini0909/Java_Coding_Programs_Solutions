package Java_Self_Practice;

import java.util.Scanner;

public class MultiplyBy5inReverse_Skip20and10 {

	public static void main(String[] args) 
	{
		System.out.print("Enter a number to print table: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=10; i>=1; i--)
		{
			int j =i*n;
			if(j==10 || j==20)
				continue;
			System.out.println(j);
		}

	}

}
