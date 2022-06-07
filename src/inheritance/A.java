package inheritance;

public class A {
	public void methodA() {
		System.out.println("Base class method");
	}
	public void methodB() {
		// TODO Auto-generated method stub
		
	}
	class B extends A{
				
		public void methodB() {
			System.out.println("Child class method");
	   }

	}
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			A obj=new A();
			obj.methodA();
		
			
      }
		
		
}		
		
	


