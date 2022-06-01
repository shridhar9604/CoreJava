package collection;
import java.util.* ;
public class Aprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue <Integer> obj= new PriorityQueue<>();
		obj.add(10);
		obj.add(20);
		obj.add(40);
		System.out.println(obj);
		obj.remove();
		
	System.out.println(obj);	
		System.out.println(obj.peek());
		obj.remove(2);
System.out.println(obj);		
	}	

}
