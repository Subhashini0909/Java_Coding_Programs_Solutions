package Java_Self_Practice;

public class Array2D {

	public static void main(String[] args) {

		//DECLARATION
		int[][] a = new int[3][2];

		//Assigning
		a[0][0] = 1;
		a[0][1] = 2;

		a[1][0] = 3;
		a[1][1] = 4;

		a[2][0] = 5;
		a[2][1] = 6;

		//DECLARE & STORE VALUE
		int b[][] = {{2,4},{3,6}, {4,8}};

		//Find Size - Row
		System.out.println("Length of row array: " +a.length);

		//Find Size - Column
		System.out.println("Length of column array: " +a[0].length);

		//Read an element
		System.out.println("Read index 3: " +b[2][1]);

		//Read multiple element
		System.out.println("Read elements in index 1 to 4: " );
		for(int i=0; i<=a.length-1; i++)
		{
			for(int j=0; j<=a[0].length-1; j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		System.out.println("For each loop");
		//FOR EACH
		for(int c[] : a)
		{
			for(int d:c)
			{
				System.out.print(d);
			}
			System.out.println();
		}

	}

}
