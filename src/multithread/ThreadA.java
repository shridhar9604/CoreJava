package multithread;

public class ThreadA {

	public static void main(String[] args) {
		{
      ThreadB b= new ThreadB();
     b.start();
     {
    	 System.out.println("hello");
     }
     
     
    synchronized(b) {
   try
{
	System.out.println("waiting for b to complete...");
	b.wait();
}
catch(InterruptedException e)
{
e.printStackTrace();

}
   System.out.println("Total is : " +b.total);
	}

}
	}
}
class ThreadB extends Thread{
	int total;
	
	public void run() {
		synchronized(this)
		{
			for (int i=0;i<100;i++)
			{
			total +=i;
			}
		System.out.println("hi");
		notify();
	}
	
	
	}
}
