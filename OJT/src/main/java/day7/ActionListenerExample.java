package day7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionListenerExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("ActionListener 예제");
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton button = new JButton("클릭하세요!");
		JLabel label = new JLabel("버튼을 클릭하세요.");

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("버튼이 클릭되었습니다!");
			}
		});

		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(label);
		frame.add(panel);
		frame.setVisible(true);
	}

}
