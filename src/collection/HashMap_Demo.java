package collection;

import java.util.HashMap;

public class HashMap_Demo {

	public static void main(String[] args) {

		HashMap < String,String> hm = new HashMap<String,String>();
		hm.put("one", "Shridhar");
		hm.put("two", "Suraj");

		hm.put("three", "Nilesh");

		hm.put("one", "Ashwin");

		hm.put("one", "Sachin");

		System.out.println(hm);
		System.out.println("Value of second:=" + hm.get("two"));
		System.out.println("Is HashMap empty:=" + hm.isEmpty());
		hm.remove("third");
		System.out.println(hm);
		System.out.println("Size of the HashMap:=" + hm.size());

	}

}
