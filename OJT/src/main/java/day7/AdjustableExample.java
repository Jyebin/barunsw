package day7;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdjustableExample {

	public static void main(String[] args) {
		Frame frame = new Frame("Adjustable Example");
		frame.setSize(400, 200);
		frame.setLayout(new FlowLayout());

		Scrollbar scrollbar = new Scrollbar(Scrollbar.HORIZONTAL, 50, 1, 0, 100); // 초기 값 50, 스크롤바 블록 크기 1, 최소 값 0, 최대값
																					// 100
		Label label = new Label("현재 값 : 50"); // 초기 값이 50인 라벨 생성

		scrollbar.addAdjustmentListener(new AdjustmentListener() { // 슬라이더의 값이 변경될 때 호출. 슬라이더의 값이 바뀌면 해당 값을 가져와 라벨의 텍스트를 업데이트

			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				int value = scrollbar.getValue();
				label.setText("현재 값 : " + value);

			}
		});

		frame.add(scrollbar);
		frame.add(label);

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});

		frame.setVisible(true);
	}

}