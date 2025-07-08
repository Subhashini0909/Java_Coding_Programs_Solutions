package Java_Self_Practice;

import java.util.Scanner;

public class CheckUNandPWDis_CorrectorNot {

	public static void main(String[] args) 
	{
		int dbUN = 3312;
		int dbPwd = 1234;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Username: ");
		int UN = sc.nextInt();
		
		System.out.print("Enter Password: ");
		int Pwd = sc.nextInt();
		
		if(UN == dbUN)
		{
			if(Pwd == dbPwd)
			{
			System.out.println("Login Successful");
			}
			else
				System.out.println("Incorrect password");
			
		}
		else 
		{
			if(Pwd == dbPwd)
			{
				System.out.println("Incorrect Username");
			}
			else
				System.out.println("Username and Password are incorrect");
		}

	}

}
