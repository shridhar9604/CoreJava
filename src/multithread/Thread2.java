package multithread;

public class Thread2 implements Runnable {
public void run()
{
	System.out.println("hi");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread2 ob=new Thread2 () ;
Thread t=new Thread(ob);
t.start();
	}

}
