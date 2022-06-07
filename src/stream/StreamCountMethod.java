package stream;

import java.util.ArrayList;
import java.util.List;

public class StreamCountMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> namelist = new ArrayList<>();
		namelist.add("India");
		namelist.add("Russia");
		namelist.add("Austrelia");
		namelist.add("England");

		Long Count = namelist.stream().filter(s -> s.length() > 5).count();
		System.out.println("Total name with more than 5 lenth is" + Count);

	}

}
