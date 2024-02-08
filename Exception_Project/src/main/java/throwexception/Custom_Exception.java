package throwexception;

public class Custom_Exception {
	public void votingMeth(int age) throws AgeException
	{
		if (age <18)
		{
			throw new AgeException("not eligible");
			
			
		}
		else
		{
			System.out.println("is eligible");
		}
	}
	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub
		
		Custom_Exception  obj  =new Custom_Exception ();
		obj.votingMeth(15);
	}

}
