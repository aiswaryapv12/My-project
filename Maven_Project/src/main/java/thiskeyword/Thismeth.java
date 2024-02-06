package thiskeyword;

public class Thismeth {
	int num;
	int num2;
	public Thismeth(int num,int num2)
	{
		this.num =num;
		this.num2 = num2;
		
	}
	public void display()
	{
		this.sub();
		int  c = num+num2;
		System.out.println("sum is "+c);
		System.out.println(c);
	}
	public void sub ()
	{
		int sub = num - num2;
		System.out.println("substracte value is "+sub);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thismeth obj = new Thismeth(20,10);
		obj.display();
		

	}

}
