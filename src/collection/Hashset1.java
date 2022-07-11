package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> obj = new HashSet<String>();
		obj.add("Java");
		obj.add("shridhar");
		obj.add("shree");
		obj.add("shridhar");
		Iterator<String> itr = obj.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
