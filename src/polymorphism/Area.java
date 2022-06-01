package polymorphism;

public class Area {
	void find(int a, int b) {
		System.out.println("Area is" + (a * b));
	}

	void find(int a, int b, int c) {
		System.out.println("Area is" + (a * b * c));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area ar = new Area();
		ar.find(8, 5);
		ar.find(8, 5, 4);
	}

}
