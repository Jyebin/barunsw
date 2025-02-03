package day7;

public class SynchronousExample {
	public static void main(String[] args) {
		System.out.println("작업 1 시작");
		try {
			Thread.sleep(2000); // 2초 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("작업 1 완료");

		System.out.println("작업 2 시작");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("작업 2 완료");
	}

}
