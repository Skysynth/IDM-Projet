
package main;

/**
 * - Ceci est un modèle, on peut récupérer les éléments de la zone A pour générer le swing
 * - la méthode checkConstraints est appelé sur toutes les colonnes de toutes les tables d'un import CSV
 * - à ce propos, l'import CSV doit être géré en utilisant la méthode add() fournie par une colonne
 * - si on modifie une colonne, on rappelle checkConstraint sur cette dernière
 * - 
 */
/*
public class Model {

	static SchemaTable schemaTable; 

	public static void main(String[] args) {
		
		
		schemaTable = new SchemaTable();
		Table currentTable;
		Column currentColumn;	
		Constraint currentConstraint;
		String[] currentArgument;
		

		// Extraire les tables et les colonnes du métamodèle

		// table courante : 0
		currentTable = new Table();

			// colonne courante : 0

			currentColumn = new Column<String>(0);
			currentTable.add(currentColumn);

			// colonne courante : 1

			currentColumn = new Column<String>(1);
			currentTable.add(currentColumn);

			// colonne courante : 2

			currentColumn = new Column<Integer>(2);
			currentTable.add(currentColumn);


		schemaTable.add(currentTable);

		// table courante : 1
		currentTable = new Table();

			// colonne courante : 3

			currentColumn = new Column<String>(3);
			currentTable.add(currentColumn);

			// colonne courante : 4

			currentColumn = new Column<String>(4);
			currentTable.add(currentColumn);

			// colonne courante : 5

			currentColumn = new Column<String>(5);
			currentTable.add(currentColumn);


		schemaTable.add(currentTable);


		Algorithm currentAlgorithm = new Algorithm("algo.py");
		// Ajout des l'entrées
		currentAlgorithm.addInput(2);
		currentAlgorithm.addInput(3);
		// Ajout des sorties
		currentAlgorithm.addOutput(5);
		
		// Créer un affichage swing 
		
    }

}

*/