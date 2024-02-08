package throwexception;

public class ThrowEx {
	
	public void ageMeth(int a) {
		
		if (a<18)
		{
			throw new ArithmeticException("not eligible");
		}
		else
		{
			System.out.println(" eligible for driving license");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowEx obj = new ThrowEx();
		obj.ageMeth(2);
	}

}
