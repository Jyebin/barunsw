package day7;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableModelExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("TableModel 예제");
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		DefaultTableModel tableModel = new DefaultTableModel();
		tableModel.addColumn("이름");
		tableModel.addColumn("나이");

		tableModel.addRow(new Object[] { "홍길동", 25 });
		tableModel.addRow(new Object[] { "김철수", 30 });
		tableModel.addRow(new Object[] { "이영희", 28 });

		JTable table = new JTable(tableModel);
		JScrollPane scrollPane = new JScrollPane(table);

		frame.add(scrollPane);
		frame.setVisible(true);
	}

}
