package day7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class SwingComponentsExample {
	public static void main(String[] args) {
		// JFrame 생성
		JFrame frame = new JFrame("Swing Components Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);

		// JPanel 생성
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(8, 1));
		frame.add(panel);

		// JLabel 예시
		JLabel label = new JLabel("JLabel");
		panel.add(label);

		// JTextField 예시
		JTextField textField = new JTextField("JTextField");
		panel.add(textField);

		// JCheckBox 예시
		JCheckBox checkBox = new JCheckBox("JCheckBox");
		panel.add(checkBox);

		// JComboBox 예시
		String[] comboOptions = { "Option 1", "Option 2", "Option 3" };
		JComboBox<String> comboBox = new JComboBox<>(comboOptions);
		panel.add(comboBox);

		// JButton 예시
		JButton button = new JButton("JButton");
		button.addActionListener((ActionEvent e) -> {
			JOptionPane.showMessageDialog(frame, "Button Clicked!");
		});
		panel.add(button);

		// JTable 예시
		String[] columnNames = { "Name", "Age" };
		Object[][] data = { { "Alice", 24 }, { "Bob", 30 }, { "Charlie", 28 } };
		JTable table = new JTable(data, columnNames);
		JScrollPane scrollPane = new JScrollPane(table);
		panel.add(scrollPane);

		// JFrame 표시
		frame.setVisible(true);
	}
}
