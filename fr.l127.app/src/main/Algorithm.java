package main;

import java.util.List;

public class Algorithm {
	
	private List<Column<?>> inputs;
	
	private List<Column<?>> outputs;
	
	private String path;
	
	public void addInput(int id) {
		inputs.add(SchemaTable.getColumnByID(id));
	}
	
	public void addOutput(int id) {
		outputs.add(SchemaTable.getColumnByID(id));
	}
	
	public void apply() {
		
		// Parcours et éxecution du fichier python situé à path (Fonction de jerem je pense)
		
		
		
		
		
	}
}