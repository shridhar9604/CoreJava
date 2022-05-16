package oopsConcept;

      public class overload {
		
         void demo (int a) {
	     System.out.println("a:"+a);
     }
              void demo (int a,int b)
     {
	   System.out.println("a and b:"+a+","+b);
    }
	   double demo (double a){
	   
		System.out.println("double a:" +a);
	
              return a*a;
	}
       int demo(int a,int b,int c){
	      return a+b+c;
   }
   
      public static void main(String[]args) {
    	  overload obj = new overload();
    	  double result;
    	  int add;
    
    	  
    	  obj.demo(10);
    	 obj.demo(10, 20);
    
    	  result=obj.demo(5.5);
    	  System.out.println("o/p : "  +result);
    	add=  obj.demo(10, 20,30);
    	  System.out.println("o/p : " +add);
      }
    	  
      }
   