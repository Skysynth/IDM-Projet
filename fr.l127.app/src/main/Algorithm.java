package main;

import java.util.ArrayList;
import java.util.List;

public class Algorithm {
	
	// SchemaTable sur lequel s'applique l'algorithme
	private SchemaTable schemaTable;
	
	private List<Column> inputs;
	
	private List<Column> outputs;
	
	private String path;
	
	public Algorithm(String path) {
		this(path, null);
	}
	
	public Algorithm(String path, SchemaTable schemaTable) {
		this.path = path;
		this.schemaTable = schemaTable;
		
		inputs = new ArrayList<Column>();
		outputs = new ArrayList<Column>();
	}
	
	public void addInput(int id) {
		inputs.add(schemaTable.getColumnByID(id));
	}
	
	public void addOutput(int id) {
		outputs.add(schemaTable.getColumnByID(id));
	}
	
	public void apply() {
		
		// Parcours et éxecution du fichier python situé à path (Fonction de jerem je pense)
		
		
	}

	public SchemaTable getSchemaTable() {
		return schemaTable;
	}

	public List<Column> getInputs() {
		return inputs;
	}

	public List<Column> getOutputs() {
		return outputs;
	}

	public String getPath() {
		return path;
	}
	
}