package collection;


import java.util.Iterator;
import java.util.LinkedHashSet;


public class SetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String>se=new LinkedHashSet<String>();
		se.add("Shridhar");
		se.add("Suraj");
		se.add("Nilesh");
		//se.remove(2);
		{
		System.out.println(se);
		}
	
		Iterator itr = se.iterator();
    
		while (itr.hasNext()) 
	System .out.println(itr.next());
			
		}
	}


