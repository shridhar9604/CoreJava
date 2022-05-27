package exception;

public class Exception9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
int data=100/0;
System.out.println(data);
}
catch (Exception e)
{
	System.out.println("can't devide integer by 0");
}
finally
{
	System.out.println("The 'try catch'is finished. ");
}
	}

}
