package day3;

import java.io.FileOutputStream;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import day2.LoggerExample;

public class FileOutputStreamExample {
	private static final Logger logger = LoggerFactory.getLogger(LoggerExample.class);

	public static void main(String[] args) {
		String data = "문자열";
		byte[] byteArray = data.getBytes(); // 문자열을 바이트 배열로 반환

		try (FileOutputStream fos = new FileOutputStream("src/main/resources/example.txt")) {
			fos.write(byteArray); // 바이트 배열을 파일에 씀
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
