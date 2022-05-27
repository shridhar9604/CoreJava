package multithread;


 abstract class Thread5 implements Runnable
 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread Thread5=new Thread("java");
Thread Thread6=new Thread("multiple");
Thread5.start();
Thread6.start();
System.out.println("Thread names are following");
System.out.println(Thread5.getName());
System.out.println(Thread6.getName());
	}
@Override
public void run() {
}
}