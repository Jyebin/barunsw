package day7;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonExample {

	public static void main(String[] args) {
		createAndShowButton();

	}

	private static void createAndShowButton() {
		JFrame frame = new JFrame("버튼 예제");
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());

		JButton button = new JButton("클릭하세요!");

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 클릭되었습니다!");
			}
		});
		frame.add(button);
		frame.setVisible(true);
	}

}
