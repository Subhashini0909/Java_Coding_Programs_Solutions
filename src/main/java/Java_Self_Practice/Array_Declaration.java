package Java_Self_Practice;

public class Array_Declaration {

	public static void main(String[] args) {
		
		//DECLARATION - Approach 1 - Fixed
			int a[] = new int[5];
			
		//ASSIGNING
			a[0] = 1;
			a[1] = 2;
			a[2] = 5;
			a[3] = 3;
			a[4] = 4;
			
		
		//DECLARATION & ASSIGNING - Approach 2 - Dynamic
			int[] b = {3,6,9,12,15};
			
		//Find Size
			System.out.println("Length of an array: " +a.length);
			
		//Read an element
			System.out.println("Read index 3: " +b[3]);
			
		//Read multiple element
			System.out.print("Read elements in index 1 to 4: " );
			for(int i=1; i<=4; i++)
			{
				System.out.print(a[i] + ",");
			}
			System.out.println();
		//FOR EACH
			for(int c : a)
			{
				System.out.println(c);
			}

	}

}
