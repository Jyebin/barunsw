package day5;

import java.util.Arrays;
import java.util.List;

public class ForLoopExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A", "B", "C", "D");

		for (int i = 0; i < list.size(); i++) {
			String element = list.get(i);
			System.out.println(element);
		}
	}
}
