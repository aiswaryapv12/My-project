package exceptionprgm;

public class Sample_Exception {
	public void  display()
	{
		int a= 10;
		try 
		{
			int b = (a /0);
		
		
		System.out.println(b);
		}
		catch(Exception e )
		{
			System.out.println("handled");
			System.out.println(e);
			e.printStackTrace();
		}
		finally
		{
			System.out.println("finally block");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample_Exception obj = new Sample_Exception();
		
		obj.display();
		System.out.println("end of the statement");
		
		
	}

}
