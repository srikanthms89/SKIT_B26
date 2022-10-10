package test.today;

class Eclipse extends Thread
{
	 @SuppressWarnings("deprecation")
	public void run()
	 {
	   System.out.println("Thread ID is eclipse "+Thread.currentThread().getId());
	 }
}
class Sketchbook extends Thread
{
	public void run()
	 {
	   System.out.println("Thread ID is sketchbook "+Thread.currentThread().getId());
	 }
	
}
class Chrome extends Thread
{
	public void run()
	 {
     	System.out.println("Thread ID is chrome "+Thread.currentThread().getId());
	 }
}
class Gmail extends Thread
{
	public void run()
	 {
     	System.out.println("Thread ID is chrome "+Thread.currentThread().getId());
	 }
}

public class Multi
{

	public static void main(String[] args)
	{
		
		Eclipse obj= new Eclipse();
		obj.start();
		
		Sketchbook obj2=new Sketchbook();
		obj2.start();
		
		Chrome obj3= new Chrome();
		obj3.start();
		
		Gmail obj4 =new Gmail();
		obj4.start();
		
	}

}
