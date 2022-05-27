package multithread;

class Thread6 extends Thread{
	public void run()
	{
		System.out.println("thread is running...");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread6 t1=new Thread6();

t1.start();

	}

}
