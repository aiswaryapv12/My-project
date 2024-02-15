package array1d;

public class Array1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 int arr[] = {2, 3,4};
		 int sum = 0;
		 for(int i =0; i<arr.length;i++)
		 {
			 System.out.print(arr[i]+" ");
		 }
		 
		System.out.println();
		for (int i = 0; i<3;i++)
		{
			 sum =  sum + arr[i];
		}
		System.out.println( "sum of array " + sum);

	}

}
