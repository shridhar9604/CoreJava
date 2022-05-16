package exception;

public class Exception7 {
	public void divide(int a,int b) {
	try
	{
		int c=a/b;
		System.out.println(c);
	}
	catch(Exception e)
	{
		System.out.println("invalid input");
	}
	finally	
	{
		System.out.println("this is finally block");
	}
	}	
	public void test() 	
	{
		System.out.println("Good morning");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Exception7 obj=new Exception7();
		obj.divide(120,0);
		obj.test();
		
		
		


	}

}
