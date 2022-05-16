package multithread;

public class Thread3 extends Thread {
public void run()
{
	System.out.println("eclipse id is "+Thread.currentThread().getId());
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread3 ob=new Thread3();
ob.start();
	}

}
