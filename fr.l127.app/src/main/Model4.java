
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

public class Model4 {

	static SchemaTable schemaTable; 

	public static void main(String[] args) {
		
		/* Zone A */
		
		schemaTable = new SchemaTable();
		Table currentTable;
		Column currentColumn;	
		Constraint currentConstraint;
		String[] currentArgument;
		
		/* Fin zone A */

		// Extraire les tables et les colonnes du métamodèle

		// table courante : 0
		currentTable = new Table(0);

			// colonne courante : 0

			currentColumn = new Column(0,String.class);

			

			currentTable.add(currentColumn);

			// colonne courante : 1

			currentColumn = new Column(1,String.class);

			

			currentTable.add(currentColumn);

			// colonne courante : 2

			currentColumn = new Column(2,Integer.class);

			

			currentTable.add(currentColumn);


		schemaTable.add(currentTable);

		// table courante : 1
		currentTable = new Table(1);

			// colonne courante : 3

			currentColumn = new Column(3,String.class);

			

			currentTable.add(currentColumn);

			// colonne courante : 4

			currentColumn = new Column(4,String.class);

			

			currentTable.add(currentColumn);

			// colonne courante : 5

			currentColumn = new Column(5,String.class);

			

			currentTable.add(currentColumn);


		schemaTable.add(currentTable);



	Algorithm currentAlgorithm = new Algorithm("add.py",schemaTable);

		// Ajout des l'entrées
				currentAlgorithm.addInput(2);
				currentAlgorithm.addInput(3);
		// Ajout des sorties
				currentAlgorithm.addOutput(5);
		schemaTable.addAlgorithm(currentAlgorithm);

		
		
			
		
		
		
	
		// Créer un affichage swing 
		new GeneratedSwing(schemaTable);

		
    }

}
