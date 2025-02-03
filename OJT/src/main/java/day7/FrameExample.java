package day7;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FrameExample {

	public static void main(String[] args) {
		Frame frame = new Frame("Frame Example");
		frame.setSize(400,300);
		frame.setLayout(new FlowLayout());
		
		frame.add(new Button("버튼 1"));
		frame.add(new Button("버튼 2"));
		
		frame.setVisible(true);
		
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent we) {
				System.exit(0);
			}
		});

	}

}
