package day5;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A", "B", "C", "D");
		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
	}
}
