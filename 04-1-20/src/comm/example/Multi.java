package comm.example;

public class Multi {
	public static void main(String args[])
	{
		int a[][]= {{1,2,4},{2,3,4},{2,3,4}};
		int b[][]= {{1,2,4},{2,3,4},{2,3,4}};
		int c[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.println(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
