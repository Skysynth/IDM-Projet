package main;

import java.util.ArrayList;
import java.util.List;

public class SchemaTable {
	
	private List<Algorithm> algorithms;
	
	private static List<Table> tables;
	
	public SchemaTable() {
		algorithms = new ArrayList<Algorithm>();
		tables = new ArrayList<Table>();
	}
	
	public static Column<?> getColumnByID(int id) {
		
		for(Table table : tables) {
			for(Column<?> column : table.getColumns()) {
				if(column.getID() == id) {
					return column;
				}
			}
		}
		
		return null;
	
	}
	
	public void add(Table table) {
		tables.add(table);
	}
	
	public void addAlgorithm(Algorithm algorithm) {
		algorithms.add(algorithm);
	}
	
}