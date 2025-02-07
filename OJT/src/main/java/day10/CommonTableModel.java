package day10;

import java.util.Enumeration;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;

public class CommonTableModel extends AbstractTableModel {
	protected Vector<Object> columnInfo; // 열 정보
	protected Vector<Object> dataInfo; // 행 정보
	protected Vector<Object> cellEditableInfo = new Vector<>();

	public CommonTableModel() {
		columnInfo = new Vector<>();
		dataInfo = new Vector<>();
	}

	public CommonTableModel(Vector<Object> columnInfo) {
		this.columnInfo = columnInfo;
		dataInfo = new Vector<Object>();
	}

	public CommonTableModel(Vector<Object> columnInfo, Vector<Object> dataInfo) {
		this.columnInfo = columnInfo;
		this.dataInfo = dataInfo;
	}

	public void addData(Vector<Object> oneRow) { // 행 추가
		dataInfo.addElement(oneRow);
	}

	public void addDataToTop(Vector<Object> oneRow) { // 맨 위에 추가
		dataInfo.add(0, oneRow);
	}

	public void addData(Vector<Object> oneRow, int index) { // 특정 행에 데이터 추가
		dataInfo.add(index, oneRow);
	}

	public void updateData(Vector<Object> oneRow, int row) { // 특정 행 데이터 변경
		dataInfo.setElementAt(oneRow, row);
	}

	public void deleteData(int index) { // 특정 행 데이터 삭제(한 행의 모든 데이터 삭제)
		dataInfo.removeElementAt(index);
	}

	public void setData(Vector<Object> dataInfo) { // 데이터 저장
		this.dataInfo = dataInfo;
	}

	public Vector<Object> getData() { // 데이터 정보 반환
		return this.dataInfo;
	}

	public void setColumn(Vector columnInfo) {
		this.columnInfo = columnInfo;
	}

	public int getColumnCount() { // 열 개수 반환
		if (columnInfo != null) {
			return columnInfo.size();
		} else {
			return 0;
		}
	}

	public void setNumRows(int rowCount) {
		int currentRowCount = getRowCount(); // 현재 행의 수
		if (currentRowCount == rowCount) {
			return; // 현재 행 개수와 설정하려는 행 개수가 같으면 아무 작업도 하지 않고 메소드 종료
		}
		dataInfo.setSize(currentRowCount);
		if (rowCount < currentRowCount) { // 행 개수가 줄어드는 경우
			fireTableRowsDeleted(rowCount, currentRowCount - 1); // 행 삭제
		} else { // 행 개수가 늘어나는 경우
			justifyRows(currentRowCount, rowCount); // 테이블 정렬이나 조정
			fireTableRowsInserted(currentRowCount, rowCount - 1); // currentRowCount부터 rowCount-1까지의 행이 새로 추가되었다는 의미
		}
	}

	public void setValueAt(Object value, int row, int column) { // 특정 셀의 값 설정
		if (row < getRowCount()) {
			Object oneRow = dataInfo.get(row); // row에 해당하는 데이터 가져오기

			Vector<Object> vectorRow = (Vector<Object>) oneRow;

			if (column >= 0 && column < vectorRow.size()) {
				vectorRow.set(column, vectorRow);
			}
		}
	}

	public Object getValueAt(int row, int column) { // 특정 셀의 값 반환
		if (row < getRowCount()) {
			Object oneRow = dataInfo.get(row);

			if (oneRow != null) {
				Vector<Object> vectorRow = (Vector<Object>) oneRow;

				if (column < vectorRow.size()) {
					return vectorRow.get(column);
				}
			}
		}
		return null;
	}

	public int getRowCount() { // 행의 개수 반환
		if (dataInfo != null) {
			return dataInfo.size();
		} else {
			return 0;
		}
	}

	public String getColumnName(int column) { // 열 이름 반환
		return columnInfo.elementAt(column).toString();
	}

	public Class<?> getColumnClass(int column) { // 열의 데이터 타입 반환
		Object object = getValueAt(0, column); // 첫 번째 행의 column 열에서 값을 가져옴
		if (object == null) {
			return String.class; // 값이 null이라면 String class 반환 -> null은 문자열로 표현 가능하기 때문
		} else {
			return object.getClass(); // null이 아닐 경우 해당 객체의 실제 타입 반환
		}
	}

	public void setCellEditable(int column) {
		cellEditableInfo.addElement(new Integer(column));
	}

	public boolean isCellEditable(int row, int column) { // 편집 가능 여부 반환
		Enumeration<Object> enumList = cellEditableInfo.elements(); // 편집 가능한 열 정보를 담고 있는 컬렉션
		while (enumList.hasMoreElements()) { // enumList에 요소가 있는 동안
			Object o = enumList.nextElement();
			if (o instanceof Integer) {
				Integer col = (Integer) o;

				if (col.intValue() == column)
					return true;
			}
		}
		return false;
	}

	private void justifyRows(int from, int to) { // from : 시작 인덱스, to : 끝 인덱스. 주어진 범위의 행 정리
		dataInfo.setSize(getRowCount());

		for (int i = from; i < to; i++) { // 지정된 범위의 각 행을 처리
			if (dataInfo.elementAt(i) == null) {
				dataInfo.setElementAt(new Vector(), i); // 현재 요소가 null이라면 새로운 Vector 객체를 생성하여 dataInfo의 해당 인덱스 i에 설정
			}
			((Vector) dataInfo.elementAt(i)).setSize(getColumnCount());
		}
	}
}
