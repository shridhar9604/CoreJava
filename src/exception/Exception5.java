package exception;

public class Exception5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	try	
	{	
  int []a=new int[7];
		a[4]=30/8;
		System.out.println("first print statement in try block");
	}	 
		 catch (ArithmeticException e)
		 {
			 System.out.println("Warning: ArthmaticException");
		 }
catch (ArrayIndexOutOfBoundsException e)
	{
	System.out.println("WarningArrayOutOfboundException");
	}
	catch (Exception e)
	{
	System.out.println("Warning: some other Exception");
	}
	{
		System.out.println("out of try-catch block...");

	}}}
	
	
	
	
	