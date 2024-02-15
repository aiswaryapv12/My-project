package sum2darray;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{2,3,1},{4,7,1},{1,2,2}};
		int b[][]= {{1,2,3},{5,1,2},{1,2,3}};  
		int c[][]= new int[3][3];
		for(int i =0; i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j] =a[i][j] + b[i][j];
				
				System.out.print(c[i][j] + " ");
			}
			
			System.out.println();
		}
		
	}

}
