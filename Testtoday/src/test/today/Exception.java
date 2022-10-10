package test.today;

public class Exception
{
     void validate(int age)
     {
    	 
     
	  if(age<18)
       {
		  throw new ArithmeticException("not eligible for C2TC");
       }
	  else
	  {
		  System.out.println("They are eligible");
	  }
     }
	public static void main(String[] args)
	{
		Exception obj= new Exception();
		obj.validate(12);
		System.out.println("welcome TNS");// yes or no
       
	}

}
