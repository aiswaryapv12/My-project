package throwexception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowcheEX {
	public void fileMeth() throws FileNotFoundException
	{
		FileReader file = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");  
        BufferedReader fileInput = new BufferedReader(file);  
        throw new FileNotFoundException("not file");
        
  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowcheEX obj = new ThrowcheEX();
		
		try
		{
			obj.fileMeth();
		}
		catch(FileNotFoundException e) 
		{
			System.out.println(e);
		}
		System.out.println(" rest of code");

	}

}
