package polymorphism;

public class Calculate {
	void sum(int d, int e) {
		System.out.println("sum is " + (d + e));
	}

	void sum(double a, double b) {
		System.out.println("sum is" + (a + b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate cal = new Calculate();
		cal.sum(8, 50);
		cal.sum(7.2, 4.5);
	}

}
