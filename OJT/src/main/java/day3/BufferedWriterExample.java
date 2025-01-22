package day3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import day2.LoggerExample;

public class BufferedWriterExample {
	private static final Logger logger = LoggerFactory.getLogger(LoggerExample.class);

	public static void main(String[] args) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/resources/example.txt"))) {
			bw.write("또 다시 파일 수정");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
