package Java_Self_Practice;

public class Array2D_PrintAllvalues {

	public static void main(String[] args) {
		int a[][]= {{1,2},{2,4},{3,6}};
		for(int i=0; i<=a.length-1; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Using For Each");
		for(int[] row:a)
		{
			for(int col:row)
			{
				System.out.print(col);
			}
			System.out.println();
		}

	}

}
