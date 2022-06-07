package stream;

import java.util.ArrayList;

import java.util.List;

public class StreamMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<>();
		numbers.add(14);
		numbers.add(4);
		numbers.add(11);
		numbers.add(78);
		numbers.add(2);
		numbers.add(99);
		numbers.add(7);

		System.out.println(numbers);

		Integer minNum = numbers.stream().min((s1, s2) -> s1.compareTo(s2)).get();
		System.out.println("minimum numbur value in list is" + minNum);

		Integer maxNum = numbers.stream().max((s1, s2) -> s1.compareTo(s2)).get();
		System.out.println("maxmum numbur value in list is" + maxNum);
	}

}
