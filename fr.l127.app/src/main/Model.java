
package main;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * - Ceci est un modèle, on peut récupérer les éléments de la zone A pour générer le swing
 * - la méthode checkConstraints est appelé sur toutes les colonnes de toutes les tables d'un import CSV
 * - à ce propos, l'import CSV doit être géré en utilisant la méthode add() fournie par une colonne
 * - si on modifie une colonne, on rappelle checkConstraint sur cette dernière
 * - 
 */

public class Model {

	static SchemaTable schemaTable; 

	public static void main(String[] args) {
		
		/* Zone A */
		
		SchemaTable schemaTable = new SchemaTable();
		Table currentTable;
		Column currentColumn;	
		Constraint currentConstraint;
		Algorithm currentAlgorithm;
		String[] currentArgument;
		
		/* Fin zone A */

		// Extraire les tables et les colonnes du métamodèle

		// table courante : 1
		currentTable = new Table(1);

			// colonne courante : 0

			currentColumn = new Column(0,String.class);

			

			currentTable.add(currentColumn);

			// colonne courante : 1

			currentColumn = new Column(1,Integer.class);

					
					currentArgument = new String[]{"4"};
					currentConstraint = new Constraint("superieur", currentArgument);

					currentColumn.addConstraint(currentConstraint);
					
			

			currentTable.add(currentColumn);

			// colonne courante : 2

			currentColumn = new Column(2,Integer.class);

			

			currentTable.add(currentColumn);

			// colonne courante : 3

			currentColumn = new Column(3,Integer.class);

			

			currentTable.add(currentColumn);

			// colonne courante : 4

			currentColumn = new Column(4,Integer.class);

			

			currentTable.add(currentColumn);


		schemaTable.add(currentTable);

		// table courante : 2
		currentTable = new Table(2);

			// colonne courante : 5

			currentColumn = new Column(5,String.class);

					
					currentArgument = new String[]{"a"};
					currentConstraint = new Constraint("beginBy", currentArgument);

					currentColumn.addConstraint(currentConstraint);
					
			

			currentTable.add(currentColumn);

			// colonne courante : 6

			currentColumn = new Column(6,Integer.class);

			

			currentTable.add(currentColumn);

			// colonne courante : 7

			currentColumn = new Column(7,Integer.class);

			

			currentTable.add(currentColumn);

			// colonne courante : 8

			currentColumn = new Column(8,Integer.class);

			

			currentTable.add(currentColumn);


		schemaTable.add(currentTable);



	 currentAlgorithm = new Algorithm("test",schemaTable);

		// Ajout des l'entrées
				currentAlgorithm.addInput(1);
				currentAlgorithm.addInput(2);
				currentAlgorithm.addInput(3);
		// Ajout des sorties
				currentAlgorithm.addOutput(4);
		schemaTable.addAlgorithm(currentAlgorithm);

		
		
			
		
		
	 currentAlgorithm = new Algorithm("test2",schemaTable);

		// Ajout des l'entrées
				currentAlgorithm.addInput(1);
		// Ajout des sorties
				currentAlgorithm.addOutput(6);
				currentAlgorithm.addOutput(7);
		schemaTable.addAlgorithm(currentAlgorithm);

		
		
			
		
		
	 currentAlgorithm = new Algorithm("add",schemaTable);

		// Ajout des l'entrées
				currentAlgorithm.addInput(4);
				currentAlgorithm.addInput(7);
				currentAlgorithm.addInput(6);
		// Ajout des sorties
				currentAlgorithm.addOutput(8);
		schemaTable.addAlgorithm(currentAlgorithm);

		
		
			
		
		
		
	
		// Créer un affichage swing 
		new GeneratedSwing(schemaTable);

		
    }

}

