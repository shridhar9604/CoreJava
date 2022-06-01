package multithread;

public class FirstThread extends Thread {
public void run()
{
	System.out.println("hi");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirstThread ob=new FirstThread();
ob.run();
	}

}
