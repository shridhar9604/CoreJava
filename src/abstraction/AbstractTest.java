package abstraction;

public class AbstractTest extends Abstractclass1 {

	public void disp2()// ie is complete method (Conceret class)

	{
		System.out.println("i am overriding abstact method ");
	}

	public static void main(String[] args) {

		AbstractTest obj = new AbstractTest();
		obj.disp2();
		obj.disp1();
	}

}
