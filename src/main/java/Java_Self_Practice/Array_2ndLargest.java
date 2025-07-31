package Java_Self_Practice;

import java.util.Arrays;

public class Array_2ndLargest {

	public static void main(String[] args) {
		
		int a[] = {21,33,54,23,46,78,35};
		
		Arrays.sort(a);
		for(int b :a)
		{
			System.out.print(b + ","); //Printing in Order
		}
		System.out.println();
		int n = a.length;
		int two = a[n-2];
		
		System.out.println(two);
		

	}

}
