package abstraction;

public class Abstractclass1Test extends Abstractclass1 {

	public void disp2()// ie is complete method (Conceret class)

	{
		System.out.println("i am overriding abstact method ");
	}

	public static void main(String[] args) {

		Abstractclass1Test obj = new Abstractclass1Test();
		obj.disp2();
		obj.disp1();
	}

}
