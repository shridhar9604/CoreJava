package exception;

public class Exception10 {
static void checkage(int age) {
	if (age< 18)
	{
	throw new ArithmeticException("Access denied-you must be atleast 18 years old. ") ;	
	}
	else
		System.out.println("access granted-you are old enough!");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
checkage(15);
	}

}
