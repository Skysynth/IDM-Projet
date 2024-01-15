package main;

import java.util.ArrayList;
import java.util.List;

public class Table{
	
	private List<Column> columns;
	
	private String name;

	public Table(String name) {
		this.name = name;
		
		columns = new ArrayList<Column>();
	}
	
	public Table(int id) {
		this.name = "Table " + id;
		
		columns = new ArrayList<Column>();
	}
	
	public void add(Column column) {
		columns.add(column);
	}

	public List<List<Object>> getRows() {
        List<List<Object>> rows = new ArrayList<>();
        
        if (!columns.isEmpty()) {
        	int maxColumnLength = columns.stream()
	                .mapToInt(column -> column.getDatas().size())
	                .max().orElse(0);
        	
            for (int i = 0; i < maxColumnLength; i++) {
                List<Object> row = new ArrayList<>();
                for (Column column : columns) {
                    row.add(column.getDatas().size() > i ? column.getDatas().get(i) : null);
                }
                rows.add(row);
            }
        }
        return rows;
    }
	
	public List<Column> getColumns() {
		return columns;
	}
	
	public String getName() {
		return name;
	}
	
	
}
