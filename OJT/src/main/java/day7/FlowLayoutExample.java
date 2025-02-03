package day7;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("FlowLayout Example");
		frame.setLayout(new FlowLayout()); // 컴포넌트를 왼쪽에서 오른쪽으로 배치하고 공간이 부족하면 다음 줄로 이동

		frame.add(new JButton("버튼 1"));
		frame.add(new JButton("버튼 2"));
		frame.add(new JButton("버튼 3"));
		frame.add(new JButton("버튼 4"));

		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 사용자가 창을 닫을 때 프로그램이 종료되도록 설정
		frame.setVisible(true);
	}

}
