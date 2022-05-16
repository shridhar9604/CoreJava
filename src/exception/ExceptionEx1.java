package exception;

public class ExceptionEx1 {

	public static void main(String[] args) 
		{
			try
			{
			System.out.println("inside try block");
			System.exit(0);
		}
catch (Exception e)
{
	System.out.println ("inside catch block");
	}
finally
		
	{
	System.out.println("inside finally block");	
	}
}}