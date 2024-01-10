
package main;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * - Ceci est un modèle, on peut récupérer les éléments de la zone A pour générer le swing.
 * - la méthode checkConstraints est appelé sur toutes les colonnes de toutes les tables d'un import CSV
 * - à ce propos, l'import CSV doit être géré en utilisant la méthode add() fournie par une colonne
 * - si on modifie une colonne, on rappelle checkConstraint sur cette dernière
 */
public class App {

	static List<List<Column>> schemaTable; 

	public static void main(String[] args) {
		
		/* Zone A */
		
		schemaTable = new ArrayList<List<Column>>();
		List<Column> currentTable;
		Column currentColumn;	
		Constraint currentConstraint;
		String[] currentArgument;
		
		/* Fin zone A */
		
		
		// Extraire les tables et les colonnes du métamodèle

		// table courante : 0
		currentTable = new ArrayList<Column>();

			// colonne courante : 0

			currentColumn = new Column<String>();

					
					currentArgument = new String[]{"a"};
					currentConstraint = new Constraint("beginBy", currentArgument);

					currentColumn.addConstraint(currentConstraint);
					
					currentColumn.add("abruti");
					
					currentColumn.add("bdieu");
					
					System.out.println(currentColumn.checkConstraints());
					
					
					
			

			currentTable.add(new Column());

			// colonne courante : 1

			currentColumn = new Column<String>();

			

			currentTable.add(new Column());

		// table courante : 1
		currentTable = new ArrayList<Column>();

			// colonne courante : 2

			currentColumn = new Column<String>();

			

			currentTable.add(new Column());

			// colonne courante : 3

			currentColumn = new Column<String>();

			

			currentTable.add(new Column());

	
		// Créer un affichage swing 
		
    }

}

