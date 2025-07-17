package Java_Self_Practice;

public class Array_PrintAllvalues {

	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5,7,9};

		System.out.println("Using For");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println();
		System.out.println("Using For Each");
		for(int a: arr)
		{
			System.out.println(a);
		}
	}

}
