package exception;

public class Exception8 {
public void Divide(int a,int b)
{
	try
{
	int c=a/b;
	System.out.println(c);
}
	catch(Exception e) {
		System.out.println("throws Exception"+ e);
	}
	System.out.println("This is division");
}
	public void test()
	{
		System.out.println("Velocity class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Exception8 obj=new Exception8();
obj.Divide(10,0);
obj.test();
	}

}
