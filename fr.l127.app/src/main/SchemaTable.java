package main;

import java.util.ArrayList;
import java.util.List;

public class SchemaTable {
	
	private List<Algorithm> algorithms;
	
	private List<Table> tables;
	
	public SchemaTable() {
		algorithms = new ArrayList<Algorithm>();
		tables = new ArrayList<Table>();
	}
	
	public Column getColumnByID(int id) {
			
			for(Table table : tables) {
				for(Column column : table.getColumns()) {
					if(column.getId() == id) {
						return column;
					}
				}
			}
			
			return null;
		}
	
	public Table getTableByName(String name) {
		
		for(Table table : tables) {
			if (table.getName().equals(name)) {
				return table;
			}
		}
		
		return null;
	}
	
	// TODO : Pas encore implémenté
	public List<Algorithm> getAlgorithmsTakingColumnAsInput(Column c) {
		
		List<Algorithm> result = new ArrayList<Algorithm>();
		
		for(Algorithm algo : algorithms) {
			if (algo.getInputs().contains(c)) {
				result.add(algo);
			}
		}
		return result;
	}
	
	public void add(Table table) {
		tables.add(table);
	}
	
	public void addAlgorithm(Algorithm algorithm) {
		algorithms.add(algorithm);
	}

	public List<Table> getTables() {
		return tables;
	}

	public List<Algorithm> getAlgorithms() {
		return algorithms;
	}
	
}