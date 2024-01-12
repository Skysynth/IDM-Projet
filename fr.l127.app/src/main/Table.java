package main;

import java.util.List;

public class Table{
	
	private List<Column<?>> columns;
	
	public List<Column<?>> getColumns() {
		return columns;
	}
	
	public void add(Column<?> column) {
		columns.add(column);
	}
	
}
