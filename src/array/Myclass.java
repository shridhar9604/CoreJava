package array;

public class Myclass {

	
		// TODO Auto-generated method stub
       static int a=20;
      Myclass(){
    	  a++;
      }
      void m1() {
    	  a++;
    	  System.out.println(a);
      }
      public static void main(String[] args) {
		Myclass obj = new Myclass();
		Myclass obj2 = new Myclass();
		Myclass obj3 = new Myclass();
	obj3.m1();
	}
}