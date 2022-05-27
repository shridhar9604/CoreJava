package multithread;

 class Thread7 implements Runnable {
public void run() {
	System.out.println("thread is running... ");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread7 obj=new Thread7();
	Thread t1=new Thread(obj);
		t1.start();
	}

	

		
	}


