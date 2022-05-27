package collection;

import java.util.*;

public class Link1 {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.add("shridhar");
		list.add("nilesh");
		list.add("suraj");
		list.add("swapnil");
		list.add("shridhar");
		list.remove(3);
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}
}
