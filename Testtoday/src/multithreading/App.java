package multithreading;


 class Eclipse implements Runnable
{
@SuppressWarnings("deprecation")
public void run()
{
	 for(int i=0;i<5;i++)
	 {
		 System.out.println("App  thread id is"+Thread.currentThread().getId());
	 }
}
}
public class App 
{

	
	public static void main(String[] args)
	{
		Eclipse obj= new Eclipse();
		Thread obj2= new Thread(obj);
		obj2.start();
		
     
	}

}
