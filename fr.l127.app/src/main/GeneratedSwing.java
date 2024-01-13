package main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class GeneratedSwing extends JFrame {

	private SchemaTable schemaTable; 
	private Table tableDisplayed;

	private static final long serialVersionUID = 9122431279624803101L;
	private DefaultTableModel tableModel;
    private JTable table;

    private JScrollPane scrollPane;
    private JButton jbAddRowButton, jbAddColumnButton, jbImportCSVFile, jbExportCSVFile, jbExecute, jbClean;

    private JComboBox<String> tableSelector;

    private CustomCellRenderer customCellRenderer = new CustomCellRenderer();

    
    {
		/* Zone A */
		
		schemaTable = new SchemaTable();
		Table currentTable;
		Column currentColumn;	
		// Constraint currentConstraint;
		// String[] currentArgument;
		
		/* Fin zone A */

		// Extraire les tables et les colonnes du métamodèle

		// table courante : 0
		currentTable = new Table("Table 1");

			// colonne courante : 0

			currentColumn = new Column(0, "Zero", String.class);
			currentTable.add(currentColumn);

			// colonne courante : 1

			currentColumn = new Column(1, "Un", String.class);
			currentTable.add(currentColumn);

			// colonne courante : 2

			currentColumn = new Column(2, "Deux", Integer.class);
			currentTable.add(currentColumn);


		schemaTable.add(currentTable);

		// table courante : 1
		currentTable = new Table("Table 2");

			// colonne courante : 3

			currentColumn = new Column(3, "Add1", Integer.class);
			currentTable.add(currentColumn);

			// colonne courante : 4

			currentColumn = new Column(4, "Add2", Integer.class);
			currentTable.add(currentColumn);

			// colonne courante : 5

			currentColumn = new Column(5, "Result", Integer.class);
			currentTable.add(currentColumn);


		schemaTable.add(currentTable);


		Algorithm currentAlgorithm = new Algorithm("add.py", schemaTable);
		// Ajout des l'entrées
		currentAlgorithm.addInput(3);
		currentAlgorithm.addInput(4);
		// Ajout des sorties
		currentAlgorithm.addOutput(5);
		
		schemaTable.addAlgorithm(currentAlgorithm);
    }
    
    
	public GeneratedSwing() {
		super("Excel-Like GUI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); // Centre la fenêtre
        this.setMinimumSize(new Dimension(800, 600));
        this.setSize(800, 600);
        
        // Création du modèle de tableau par défaut
        tableModel = new DefaultTableModel();
        // Au besoin, voici comment définir des valeurs dans certaines cases (exemple en dessous)
        // tableModel.setValueAt("A1", 0, 0);

        // Initialisation du tableau avec le modèle
        table = new JTable(tableModel);
        
        // Configuration du renderer personnalisé
        table.setDefaultRenderer(Object.class, customCellRenderer);
        
        // Ajouter un écouteur de modèle de tableau
        tableModel.addTableModelListener(new TableListener());        
        
        // Ajout du tableau dans un JScrollPane
        scrollPane = new JScrollPane(table);
        this.add(scrollPane, BorderLayout.CENTER);

        // Bouton pour ajouter une ligne
        jbAddRowButton = new JButton("Ajouter une ligne");
        jbAddColumnButton = new JButton("Ajouter une colonne");
        jbImportCSVFile = new JButton("Importer CSV");
        jbExportCSVFile = new JButton("Exporter CSV");
        jbExecute = new JButton("Exécuter");
        jbClean = new JButton("Clean");
        tableSelector = new JComboBox<>();

        for (Table table : schemaTable.getTables()) {
        	tableSelector.addItem(table.getName()); // Il faut s'assurer que chaque Table a un nom ou un identifiant unique
        }

        //jbAddColumnButton.addActionListener(new ActionButtons());
        jbAddRowButton.addActionListener(new ActionButtons());
        jbImportCSVFile.addActionListener(new ActionButtons());
        jbExportCSVFile.addActionListener(new ActionButtons());
        jbExecute.addActionListener(new ActionButtons());
        jbClean.addActionListener(new ActionButtons());
        tableSelector.addActionListener(new ActionButtons());

        // Panneau pour les boutons
        // JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JToolBar toolBar = new JToolBar();
        
        //toolBar.add(jbAddColumnButton);
        toolBar.add(jbAddRowButton);
        toolBar.add(jbImportCSVFile);
        toolBar.add(jbExportCSVFile);
        toolBar.add(jbExecute);
        toolBar.add(jbClean);
        toolBar.add(tableSelector);
        
        // Ajout du panneau de boutons dans le BorderLayout en bas
        this.add(toolBar, BorderLayout.SOUTH);

        updateTableModel(schemaTable.getTables().get(0));
        // Rendre la fenêtre visible
        this.setVisible(true);
    }

	private void updateTableModel(Table selectedTable) {
		tableDisplayed = selectedTable;
	    // Effacer les données actuelles
	    tableModel.setRowCount(0);
	    tableModel.setColumnCount(0);

	    // Vérifier si la table sélectionnée n'est pas nulle
	    if (selectedTable != null) {
	        // Ajouter les colonnes
	        for (Column column : selectedTable.getColumns()) {
	            tableModel.addColumn(column.getName());
	        }

	        // Ajouter les données
	        for (List<Object> row : selectedTable.getRows()) {
	            tableModel.addRow(row.toArray());
	        }
	    }
	}
	
	class TableListener implements TableModelListener {

		private boolean isUpdating = false; // Drapeau pour contrôler les mises à jour

		@Override
		public void tableChanged(TableModelEvent e) {
			
			if (!isUpdating) {
				int row = e.getFirstRow();
				int column = e.getColumn();
				System.out.println(row + "\t" + column + " : tableChanged");
				
				if (row < 0 || column < 0) return;
				
				TableModel model = (TableModel) e.getSource();
				Object data = model.getValueAt(row, column);
				
				// Mettre à jour l'objet Table ici
				updateTableObject(row, column, data);				
			}
			
		}
		
		private void updateTableObject(int row, int column, Object data) {
		    // Obtenez la table actuellement sélectionnée dans le JComboBox
		    String selectedTableName = (String) tableSelector.getSelectedItem();
		    Table selectedTable = schemaTable.getTableByName(selectedTableName); // Méthode à implémenter dans SchemaTable

		    if (selectedTable != null) {
		        Column targetColumn = selectedTable.getColumns().get(column);
		        
		        if (targetColumn != null) {
		        	Object convertedData = convertStringToTargetType((String) data, targetColumn.getDataType());
		            
		        	if (convertedData != null) {
		        		targetColumn.updateData(row, convertedData);
		        	} else {
		        		System.out.println("Erreur de type :");
		        		System.out.println(targetColumn.getDataType() + " était attendu");
		        		System.out.println("Reçu : " + data + " de type " + data.getClass().getName());
		        		
		        		// Désactiver temporairement la mise à jour
	                    isUpdating = true;

	                    // Réinitialiser la donnée dans la JTable
	                    tableModel.setValueAt(null, row, column);

	                    // Mettre la cellule en rouge temporairement
	                    highlightCell(row, column);

	                    // Réactiver les mises à jour
	                    isUpdating = false;
		        	}	
		        }
		        
		    }
		}
		
		private void highlightCell(int row, int column) {
	        customCellRenderer.addHighlightedCell(row, column);
	        table.repaint();

	        Timer timer = new Timer(1000, e -> {
	            customCellRenderer.clearHighlightedCells();
	            table.repaint();
	        });

	        timer.setRepeats(false);
	        timer.start();
	    }
	}
	
    class ActionButtons implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == jbAddColumnButton) {
				tableModel.addColumn("Colonne " + (tableModel.getColumnCount() + 1));
			}
			else if (e.getSource() == jbAddRowButton) {
				tableModel.addRow(new Object[tableModel.getColumnCount()]);
			}
			else if (e.getSource() == jbImportCSVFile) {
				onImportCSVFile();
			}
			else if (e.getSource() == jbExportCSVFile) {
				onExportCSVFile();
			}
			else if (e.getSource() == jbExecute) {
				onExecute();
			}
			else if (e.getSource() == jbClean) {
				onClean();
			}
			else if (e.getSource() == tableSelector) {
				onSwitchTable();
			}
			else {
				System.out.println("Shouldn't see that, call 911");
			}
		}
    	
    }
    
	private void onSwitchTable() {
        
		String selectedTableName = (String) tableSelector.getSelectedItem();
        Table selectedTable = schemaTable.getTableByName(selectedTableName);
        updateTableModel(selectedTable); // Méthode pour mettre à jour le JTable en fonction de la Table sélectionnée
	}

	private void onImportCSVFile() {
		JFileChooser fileChooser = new JFileChooser();
	    if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
	        File csvFile = fileChooser.getSelectedFile();
	        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                String[] data = line.split(",");
	                tableModel.addRow(data);
	            }
	        } catch (IOException ioException) {
	            ioException.printStackTrace();
	        }
	    }
	}
	
	private void onExecute() {
		for (Algorithm algorithm : schemaTable.getAlgorithms()) {
	        // Vérifier la validité des colonnes d'entrée
	        boolean validInput = true;
	        for (Column inputColumn : algorithm.getInputs()) {
	            if (inputColumn == null || !inputColumn.checkTypesAndNoNull()) {
	                validInput = false;
	                break;
	            }
	        }

	        if (validInput) {
	        	System.out.println("on est bon");
	            // Générer le fichier CSV d'entrée
	            String csvInputPath;
				try {
					csvInputPath = generateCsvForAlgorithmInput(algorithm);
					System.out.println("csv Input generated");
					
					// Exécuter l'algorithme via Python
					String csvOutputPath = executePythonAlgorithm(algorithm.getPath(), csvInputPath, algorithm.getPath().replaceAll(".py", "") + "-output.csv");
					
					System.out.println("csv output generated");
					
					// Lire les résultats et mettre à jour les colonnes de sortie
					List<List<String>> resultData = readCsvResults(csvOutputPath);
					updateOutputColumns(algorithm.getOutputs(), resultData);
					
					updateTableModel(tableDisplayed);
					System.out.println("finished !");
				} catch (IOException | InterruptedException e) {
					e.printStackTrace();
				}

	        }
	    }
	}
		
	private String generateCsvForAlgorithmInput(Algorithm algorithm) throws IOException {
	    String csvFilePath = algorithm.getPath().replaceAll(".py", "") + "-input.csv"; // Chemin du fichier CSV à générer
	  
	    try (PrintWriter csvWriter = new PrintWriter(new File(csvFilePath))) {
	    	
	        for (Column inputColumn : algorithm.getInputs()) {
	        	
	            if (inputColumn != null) {
	            	boolean isPremier = true;
	                // Écrire les données de la colonne dans le fichier CSV
	                for (Object data : inputColumn.getDatas()) {
	                	if (isPremier) {
	                		isPremier = false;
	                	} else {
		                    csvWriter.print(","); // Séparateur CSV
	                	}
	                	csvWriter.print(data.toString());	                		
	                }
	                csvWriter.println();
	            }
	        }
	    }
	    return csvFilePath;
	}
	
	private String executePythonAlgorithm(String scriptPath, String csvInputPath, String csvOutputPath) throws IOException, InterruptedException {
	    ProcessBuilder pb = new ProcessBuilder("python3", "add.py", scriptPath, csvInputPath, csvOutputPath);
	    Process p = pb.start();
	    p.waitFor(); // Attendre la fin de l'exécution du script

	    return csvOutputPath;
	}
	
	private List<List<String>> readCsvResults(String csvFilePath) throws IOException {
        File resultFile = new File(csvFilePath);
        List<List<String>> rows = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(resultFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                rows.add(Arrays.asList(line.split(",")));
            }
        }

        // Transposer les lignes en colonnes
		return transpose(rows);
	}

	// Méthode pour transposer une liste de listes (convertir les lignes en colonnes)
	private static <T> List<List<T>> transpose(List<List<T>> table) {
	    List<List<T>> ret = new ArrayList<>();
	    final int N = table.get(0).size();
	    for (int i = 0; i < N; i++) {
	        List<T> col = new ArrayList<>();
	        for (List<T> row : table) {
	            col.add(row.get(i));
	        }
	        ret.add(col);
	    }
	    return ret;
	}

	
	private void updateOutputColumns(List<Column> outputColumns, List<List<String>> resultData) {
	    if (outputColumns.size() != resultData.size()) {
	        throw new IllegalArgumentException("Le nombre de colonnes de sortie ne correspond pas aux résultats obtenus : " + outputColumns.size() + " | " + resultData.size());
	    }

	    for (int i = 0; i < outputColumns.size(); i++) {
	        Column outputColumn = outputColumns.get(i);
	        List<String> columnData = resultData.get(i);
	        
	        outputColumn.setDatas(convertListStringToListTargetType(columnData, outputColumn.getDataType()));
	    }
	}

	
	@SuppressWarnings("unused")
	private void onExecuteOld() {

		if (tableModel.getRowCount() < 1) {
			JOptionPane.showMessageDialog(this, "ERROR : The table is empty !!!");
		} else {
		
		    try {
		    	// AVANT D'EXECUTER : exporter nos informations dans un fichier csv
		    	exportCSV(new File("input.csv"));
		    	
		        // Chemin relatif vers le script Python dans le répertoire src
		        String pythonScriptPath = "add.py";
	
		        // Chemin du fichier CSV
		        String csvFilePath = "input.csv"; // Remplacez par le chemin réel
	
		        // Commande pour exécuter le script Python
		        String[] command = {"python3", pythonScriptPath, csvFilePath};
	
		        // Exécution du script Python
		        ProcessBuilder pb = new ProcessBuilder(command);
		        Process p = pb.start();
	
		        // Lecture de la sortie standard et d'erreur du script
		        BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
		        BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
	
		        // Affichage de la sortie du script
		        String s;
		        while ((s = stdInput.readLine()) != null) {
		            System.out.println(s);
		        }
	
		        // Affichage des erreurs éventuelles
		        while ((s = stdError.readLine()) != null) {
		            System.err.println(s);
		        }
	
		        int exitCode = p.waitFor();
		        System.out.println("Exited with code : " + exitCode);
		        
		        importResult();
		        
		        
		    } catch (IOException | InterruptedException e) {
		        e.printStackTrace();
		    }
	    }
	}
	
	private void importResult() {
		try {
			// Lire les données du fichier CSV
	        File resultFile = new File("result.csv"); // Ajustez le chemin
	        List<List<String>> rows = new ArrayList<>();
	        try (BufferedReader br = new BufferedReader(new FileReader(resultFile))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                rows.add(Arrays.asList(line.split(","))); // Supposer que les valeurs sont séparées par des virgules
	            }
	        }

	        // Transposer les lignes en colonnes
	        List<List<String>> columns = transpose(rows);

	        // Ajouter chaque colonne transposée au tableau
	        int i = 1;
	        for (List<String> column : columns) {
	            tableModel.addColumn("Resultat " + i, column.toArray());
	            i++;
	        }
	  } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	private void onExportCSVFile() {
		jbExportCSVFile.addActionListener(e -> {
		    JFileChooser fileChooser = new JFileChooser();
		    if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
		        File csvFile = fileChooser.getSelectedFile();
		        exportCSV(csvFile);
		    }
		});
	}
	
	private void exportCSV(File csvFile) {
		if (tableModel.getRowCount() < 1) {
			
			JOptionPane.showMessageDialog(this, "ERROR : The table is empty !!!");
		} else {
			try (PrintWriter pw = new PrintWriter(csvFile)) {
				for (int i = 0; i < tableModel.getRowCount(); i++) {
					for (int j = 0; j < tableModel.getColumnCount(); j++) {
						if(tableModel.getValueAt(i, j) != null) {
							pw.print(tableModel.getValueAt(i, j));		                		
						}
						if (j < tableModel.getColumnCount() - 1) pw.print(",");
					}
					pw.println();
				}
			} catch (IOException ioException) {
				ioException.printStackTrace();
			}
			
		}
	}
	
	private void onClean() {
		tableModel.setRowCount(0);
	}
	

	private Object convertStringToTargetType(String data, Class<?> targetType) {
	    try {
	        if (targetType.equals(Integer.class)) {
	            return Integer.parseInt(data);
	        } else if (targetType.equals(Double.class)) {
	            return Double.parseDouble(data);
	        } else if (targetType.equals(Float.class)) {
	            return Float.parseFloat(data);
	        } else {
	            return data; // Pour les types String et autres
	        }
	    } catch (NumberFormatException e) {
	        return null; // Retourne null si la conversion échoue
	    }
	}
	
	private List<Object> convertListStringToListTargetType(List<String> datas, Class<?> targetType) {
		List<Object> result = new ArrayList<Object>();
		
		for (String data : datas) {
			result.add(convertStringToTargetType(data, targetType));
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		
		// Créer un affichage swing 
	    SwingUtilities.invokeLater(() -> new GeneratedSwing());
    }
	
}
