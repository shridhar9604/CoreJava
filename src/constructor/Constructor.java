package constructor;

public class Constructor {
	public Constructor()// Default constructor
	{
		System.out.println("Constructor is Running");
	}

	public Constructor(int a)// parameterized Constructor
	{
		System.out.println("Constructor Running" + a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor ob = new Constructor();
		Constructor ob1 = new Constructor(5);

	}

}
