package Java_Self_Practice;

import java.util.Scanner;

public class Vowel_or_Not {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char ch = sc.next().charAt(0);
		char dup = ch;
		ch = Character.toLowerCase(ch); //Converts to lowercase - Character is a wrapper class for the primitive char type. It’s part of the java.lang package 
		if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u')
			System.out.println(dup + "-Vowel");
		else
			System.out.println(dup + "-Not a vowel");
	}

}
