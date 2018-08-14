package core;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		int a[][]= new int[2][2];
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		//System.out.println(a[1][0]);
		
		int b[][]={{2,4,5},{3,10,7},{1,-2,9}};
		int min = b[0][0];
		
		for(int i=0;i<3;i++)
		{
			
		for (int j=0;j<3;j++)
		{
			if (b[i][j]> min)
			{
				min = b[i][j];
			}
		}

			
		}
		System.out.println(min);


		
	}

}
