package day7;

import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ListModelExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("ListModel 예제");
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		DefaultListModel<String> listModel = new DefaultListModel<>();
		listModel.addElement("항목 1");
		listModel.addElement("항목 2");
		listModel.addElement("항목 3");
		listModel.addElement("항목 4");
		listModel.addElement("항목 5");
		listModel.addElement("항목 6");
		listModel.addElement("항목 7");
		listModel.addElement("항목 8");
		listModel.addElement("항목 9");
		listModel.addElement("항목 10");

		JList<String> list = new JList<>(listModel);
		JScrollPane scrollPane = new JScrollPane(list);

		frame.add(scrollPane, BorderLayout.CENTER);
		frame.setVisible(true);
	}

}
