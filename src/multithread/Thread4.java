package multithread;

public class Thread4 extends Thread {
	public void run() {
		System.out.println("Thread"+Thread.currentThread().getName());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread4 obj = new Thread4();
		Thread4 ob = new Thread4();
		Thread4 o = new Thread4();
		obj.start();
		ob.start();
		o.start();
	//	obj.stop();
		//ob.suspend();

	}

}
