package collection;

import java.util.ArrayList;
import java.util.List;

public class Arraynon {
	
	public void genericArray()
	{
		ArrayList<String> a1 = new ArrayList();
		a1.add(" hello");
		a1.add("hi");
		a1.add("world");
		a1.add("aiswarya");
		a1.add("kannur");
		//a1.add(10);
		
		System.out.println(a1);
		a1.remove(2);
		
		System.out.println(a1);
		int c= a1.size();
		System.out.println("collection size is "+c);
		ArrayList<String> b1 = new ArrayList();
		b1.addAll(a1);
		System.out.println(" value of b1"+b1);
		a1.removeAll(a1);
		System.out.println(a1);
		  boolean d = b1.contains("sharu");
		System.out.println("present or not "+d);
		System.out.println(b1.get(2));
		
		
		List<String> l1 = new ArrayList();
		
		
				
	}
	public void nongenericArray()
	{
		ArrayList a2 = new ArrayList();
		a2.add(10);
		a2.add(2.5);
		a2.add("hello");
		System.out.println(a2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Arraynon  obj = new  Arraynon ();
		 obj.genericArray();
		 obj.nongenericArray();

	}

}
