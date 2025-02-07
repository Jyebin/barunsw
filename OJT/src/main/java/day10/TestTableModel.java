package day10;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;

public class TestTableModel extends AbstractTableModel {
	private Vector<Object> columns;
	private Vector<Object> data;

	public TestTableModel(Vector<Object> columns) {
		this.columns = columns;
	}

	public void setColumns(Vector<Object> columns) {
		this.columns = columns;
	}

	public void setData(Vector<Object> data) {
		this.data = data;
	}

	@Override
	public int getRowCount() {
		return (data != null) ? data.size() : 0;
	}

	@Override
	public int getColumnCount() {
		return columns.size();
	}

	@Override
	public String getColumnName(int columnIndex) {
		return (columns != null) ? columns.get(columnIndex).toString() : null;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return (data != null) ? ((Vector<Object>) data.get(rowIndex)).get(columnIndex) : null;
	}
}
