package Java_Self_Practice;

import java.util.Scanner;

public class TotalNoofNotes_inGivenAmount {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Amount: ");
		int amount = sc.nextInt();
		
		int note2000 = 0, note500 = 0, note200 =0, note100 = 0,note50 = 0, note20 = 0;
        int note10 = 0, note5 = 0, note2 = 0, note1 = 0;

        if(amount>=2000) //Checks if the amount is greater than 2000
        {
        	note2000 = amount/2000; //Find how many ₹2000 notes fit in the amount
        	amount = amount%2000; //Get the remaining amount after removing those ₹2000 notes
        }
        
        if(amount>=500)
        {
        	note500 = amount/500;
        	amount = amount%500;
        }
        
        if(amount>=200)
        {
        	note200 = amount/200;
        	amount = amount%200;
        }
        
        if(amount>=100)
        {
        	note100 = amount/100;
        	amount = amount%100;
        }
        
        if(amount>=50)
        {
        	note50 = amount/50;
        	amount = amount%50;
        }
        
        if(amount>=20)
        {
        	note20 = amount/20;
        	amount = amount%20;
        }
        
        if(amount>=10)
        {
        	note10 = amount/10;
        	amount = amount%10;
        }
        
        if(amount>=5)
        {
        	note5 = amount/5;
        	amount = amount%5;
        }
        
        if(amount>=2)
        {
        	note2 = amount/2;
        	amount = amount%2;
        }
        
        if(amount>=1)
        {
        	note1 = amount/1;
     
        }
        
        if(note2000>0)
        	System.out.println("2000 x " + note2000);
        if(note500>0)
        	System.out.println("500 x " + note500);
        if(note200>0)
        	System.out.println("200 x " + note200);
        if(note100>0)
        	System.out.println("100 x " + note100);
        if(note50>0)
        	System.out.println("50 x " + note50);
        if(note20>0)
        	System.out.println("20 x " + note20);
        if(note10>0)
        	System.out.println("10 x " + note10);
        if(note5>0)
        	System.out.println("5 x " + note5);
        if(note2>0)
        	System.out.println("2 x " + note2);
        if(note1>0)
        	System.out.println("1 x " + note1);

	}

}
