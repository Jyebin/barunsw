package day7;

import java.awt.ActiveEvent;
import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyActiveEventExample {

	public static void main(String[] args) {
		Frame frame = new Frame("ActiveEvent Example");
		Button button = new Button("클릭");

		button.addActionListener(e -> {
			EventQueue.invokeLater(() -> {
				MyActiveEvent event = new MyActiveEvent();
				event.dispatch(); // ActiveEvent 분배
			});
		});
		frame.add(button);
		frame.setSize(300, 200);
		frame.setVisible(true);

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}

class MyActiveEvent implements ActiveEvent { // 비동기 이벤트 처리를 위한 인터페이스
	// 사용자 상호작용(버튼 클릭, 마우스 이동 등)이 발생했을 때 해당 이벤트를 비동기적 처리 -> 메인 스레드가 다른 작업을 계속 수행
	// 긴 작업을 수행하는 동안 UI의 응답성을 유지할 수 있음
	// UX를 위해 사용
	@Override
	public void dispatch() {
		System.out.println("ActiveEvent가 분배되었습니다.");
	}
}
