package test.today;

import java.io.IOException;

public class App
{
	  
	void m1()
	{
		System.out.println("no exception");
	}

	
	void m2() throws IOException
	{
		throw new IOException("Device  error or exception may happen");
	}
	
	void m3() throws ArithmeticException,IOException
	{
		
		throw new ArithmeticException("ArithmeticException may happen");
		throw new IOException("Io may happen");
		
	}
	public static void main(String[] args)
	{
		

	}

}
