package Java_Self_Practice;

public class Array2D_FindMaximumno {

	public static void main(String[] args) 
	{
		int a[][]= {{1,2},{2,9},{3,6}};
		
		int max = a[0][0];
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				if(a[i][j]>max)
					max=a[i][j];
			}
		}
		System.out.println(max);

	}

}
