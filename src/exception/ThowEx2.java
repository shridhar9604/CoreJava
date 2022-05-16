package exception;

public class ThowEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	ThrowEx1 obj=new ThrowEx1();
	obj.mymethod(2);
}
	catch(Exception e)
{
System.out.println(e);
}
}}