package test.today;

class Chrome extends Thread
{
	public void run()
	 {
		
		
			 System.out.println("Thread ID is chrome "+Thread.currentThread().getPriority());	
     	
	 }
}
public class Multi
{

	public static void main(String[] args)
	{
		Chrome obj2= new Chrome();
		obj2.setPriority(Thread.MAX_PRIORITY);
		obj2.start();
		
		
		Chrome obj=new Chrome();
		obj.setPriority(Thread.MIN_PRIORITY); 
		obj.start();
		
		Chrome obj3= new Chrome();
		obj3.setPriority(Thread.NORM_PRIORITY);
	    obj3.start();
	    
	    
	    Chrome obj4= new Chrome();
		//obj3.setPriority(Thread.NORM_PRIORITY);
	    obj4.start();	
		
		
		
		
		
	}

}
