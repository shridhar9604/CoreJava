package constructor;

public class Test {
	Test(){
		m2();
		
	}
	static void m1() {
		
		System.out.println("Inst");
	}
	static void m2() {
		System.out.println("Satic");
		m1();
	}
	public static void main(String[] args) {
		new Test();
		
	}

}
