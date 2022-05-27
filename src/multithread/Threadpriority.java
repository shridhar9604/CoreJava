package multithread;

public class Threadpriority extends Thread {
public void run()
{
	System.out.println("Thread"+"" +Thread.currentThread().getName());
	System.out.println("Thread priority is" +"" +Thread.currentThread().getPriority());
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Threadpriority t1=new Threadpriority();
Threadpriority t2=new Threadpriority();
Threadpriority t3=new Threadpriority();
t1.setPriority(MIN_PRIORITY);
t2.setPriority(NORM_PRIORITY);
t3.setPriority(MAX_PRIORITY);
t1.start();
t2.start();
t3.start();


	}

}
