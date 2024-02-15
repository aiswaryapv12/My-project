package collectionint;

import java.util.ArrayList;
import java.util.List;

public class ArrayInt {
	
	public void genericInt()
	{
		ArrayList<Integer> a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		System.out.println(a1);
		
		
         
		a1.remove(2);
		System.out.println(a1);
		
		int c= a1.size();
		System.out.println("collection size is "+c);
		
		ArrayList<Integer> b1 = new ArrayList();
		b1.addAll(a1);
		System.out.println("value of b1"+b1);
		
		a1.removeAll(a1);
		System.out.println(a1);
		
	    boolean d = b1.contains(10);
		System.out.println("present or not in the array"+d);
		
		System.out.println(b1.get(2));
		
		
	}
	
	public void genericList()
	{
		List<String> s1 =new ArrayList();
		s1.add("hello");
		s1.add("hi");
		s1.add("world");
		s1.add("aiswarya");
		s1.add("see");
		System.out.println(s1);
		
		s1.remove(2);
		System.out.println(s1);
		
		 int c =s1.size();
		 System.out.println("size of the list " +c);
		 
		 List<String> b1 = new ArrayList();
		 b1.addAll(s1);
		 System.out.println("added  another array "+b1);
		 
		 s1.removeAll(s1);
		 System.out.println(s1);
		 
		boolean value  = b1.contains("world");
		System.out.println("check whether world is present or not"+value );
		
		System.out.println(b1.get(2));
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayInt obj =  new ArrayInt();
		obj.genericInt();
		obj.genericList();
	}

}
