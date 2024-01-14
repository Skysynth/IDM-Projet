package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.Timer;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class GeneratedSwing extends JFrame {

	private SchemaTable schemaTable; 
	private Table tableDisplayed;

	private static final long serialVersionUID = 9122431279624803101L;
	private DefaultTableModel tableModel;
    private JTable table;

    private JScrollPane scrollPane;
    private JButton jbAddRowButton, jbImportCSVFile, jbExportCSVFile, jbClean;

    private JComboBox<String> tableSelector;

    private CustomCellRenderer customCellRenderer = new CustomCellRenderer();
    
    private JPopupMenu popupMenu;
    private JMenuItem deleteItem;

    
    class CustomCellRenderer extends DefaultTableCellRenderer {
        private static final long serialVersionUID = -756446113683862516L;
    	private Set<Point> highlightedCells = new HashSet<>();

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                                                       boolean isSelected, boolean hasFocus,
                                                       int row, int column) {
            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            if (highlightedCells.contains(new Point(row, column))) {
                c.setBackground(Color.RED);
            } else {
                Column columnObject = getColumnObjectAt(column);
                if (isOutputColumn(columnObject)) {
                    c.setBackground(new Color(220, 220, 220)); // Gris clair pour les colonnes de sortie
                } else {
                 
		            if (isSelected) {
		                c.setBackground(table.getSelectionBackground());
		            } else {
		                c.setBackground(table.getBackground());
		            }
                }
            }
            return c;
        }

        public void addHighlightedCell(int row, int column) {
            highlightedCells.add(new Point(row, column));
        }

        public void clearHighlightedCells() {
            highlightedCells.clear();
        }
    }

    class CustomTableModel extends DefaultTableModel {
        private static final long serialVersionUID = -5165229507929130480L;

        public CustomTableModel() {
        	super();
        }
        
		public CustomTableModel(Object[][] data, Object[] columnNames) {
            super(data, columnNames);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            // Obtenez l'objet Column correspondant à l'indice de colonne
            Column columnObject = getColumnObjectAt(column);

            // Vérifiez si la colonne est une colonne de sortie d'un algorithme
            if (isOutputColumn(columnObject)) {
                return false; // Rendre la cellule non modifiable
            }
            return true; // Sinon, la cellule est modifiable
        }

    }

	public GeneratedSwing(SchemaTable schemaTable) {
		super("Excel-Like GUI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); // Centre la fenêtre
        this.setMinimumSize(new Dimension(800, 600));
        this.setSize(800, 600);
        
        this.schemaTable = schemaTable;
        
        // Création du modèle de tableau par défaut
        tableModel = new CustomTableModel();
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
        jbImportCSVFile = new JButton("Importer CSV");
        jbExportCSVFile = new JButton("Exporter CSV");
        jbClean = new JButton("Clean");
        tableSelector = new JComboBox<>();

        for (Table table : schemaTable.getTables()) {
        	tableSelector.addItem(table.getName()); // Il faut s'assurer que chaque Table a un nom ou un identifiant unique
        }

        //jbAddColumnButton.addActionListener(new ActionButtons());
        jbAddRowButton.addActionListener(new ActionButtons());
        jbImportCSVFile.addActionListener(new ActionButtons());
        jbExportCSVFile.addActionListener(new ActionButtons());
        jbClean.addActionListener(new ActionButtons());
        tableSelector.addActionListener(new ActionButtons());

        // Panneau pour les boutons
        // JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JToolBar toolBar = new JToolBar();
        
        //toolBar.add(jbAddColumnButton);
        toolBar.add(jbAddRowButton);
        toolBar.add(jbImportCSVFile);
        toolBar.add(jbExportCSVFile);
        toolBar.add(jbClean);
        toolBar.add(tableSelector);
        
        // Ajout du panneau de boutons dans le BorderLayout en bas
        this.add(toolBar, BorderLayout.SOUTH);

        popupMenu = new JPopupMenu();
        deleteItem = new JMenuItem("Supprimer");
        
        popupMenu.add(deleteItem);
        
        table.addMouseListener(new MouseEcouteur());
        
        deleteItem.addActionListener(new ActionButtons());
        
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
	
	class MouseEcouteur extends MouseAdapter {
		@Override
	    public void mousePressed(MouseEvent e) {
	        showPopupMenu(e);
	    }

	    @Override
	    public void mouseReleased(MouseEvent e) {
	        showPopupMenu(e);
	    }

	    private void showPopupMenu(MouseEvent e) {
	        if (e.isPopupTrigger() && table.getSelectedRow() != -1) {
	            popupMenu.show(e.getComponent(), e.getX(), e.getY());
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
		        	if (data == null | data.toString().equals("")) {
		        		targetColumn.updateData(row, null);
		        	} else {
		        		Object convertedData = convertStringToTargetType((String) data, targetColumn.getDataType());
		        		
		        		if (convertedData != null) {
		        			targetColumn.updateData(row, convertedData);
		        			
		        		} else {
		        			System.out.print("Erreur de type : ");
		        			System.out.println(targetColumn.getDataType().getCanonicalName() + " était attendu");
		        			
		        			// Désactiver temporairement la mise à jour
		        			isUpdating = true;
		        			
		        			// Réinitialiser la donnée dans la JTable
		        			tableModel.setValueAt(null, row, column);
		        			targetColumn.updateData(row, null);
		        			
		        			// Mettre la cellule en rouge temporairement
		        			highlightCell(row, column);
		        			
		        			// Réactiver les mises à jour
		        			isUpdating = false;
		        		}
		        	}
		        	
		        	
		        	List<Algorithm> algos = schemaTable.getAlgorithmsTakingColumnAsInput(targetColumn);
		        	// On tente d'appliquer les algorithmes qui concernent cette colonne en input
	        		tryToExecuteAlgorithms(algos);
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
			if (e.getSource() == jbAddRowButton) {
				onAddRow();
			}
			else if (e.getSource() == jbImportCSVFile) {
				onImportCSVFile();
			}
			else if (e.getSource() == jbExportCSVFile) {
				onExportCSVFile();
			}
			else if (e.getSource() == jbClean) {
				onClean();
			}
			else if (e.getSource() == tableSelector) {
				onSwitchTable();
			}
			else if (e.getSource() == deleteItem) {
				System.out.println("deleteItem");
				deleteSelectedRows();
			}
			else {
				System.out.println("Shouldn't see that, call 911");
			}
		}
    }
  
    private void deleteSelectedRows() {
        int[] selectedRows = table.getSelectedRows();

        // Convertir les indices de vue en indices de modèle
        for (int i = 0; i < selectedRows.length; i++) {
            selectedRows[i] = table.convertRowIndexToModel(selectedRows[i]);
        }
        
        Arrays.sort(selectedRows);

        // Supprimer les données de chaque colonne dans les objets Column
        for (int col = 0; col < table.getModel().getColumnCount(); col++) {
            Column columnObject = getColumnObjectAt(col);
            for (int i = selectedRows.length - 1; i >= 0; i--) {
                columnObject.getDatas().remove(selectedRows[i]);
            }
        }

        // Supprimer les lignes du modèle de la table
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (int i = selectedRows.length - 1; i >= 0; i--) {
            model.removeRow(selectedRows[i]);
        }
    }
    
    public void onAddRow() {
    	tableModel.addRow(new Object[tableModel.getColumnCount()]);
    	
    	for (Column c : tableDisplayed.getColumns()) {
    		c.add(null);
    		
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
    				// Et on ajoute aux colonnes
    				int iColumn = 0;
    				int iData = 0;
    				int sizeColumns = tableDisplayed.getColumns().size();

    				Object[] dataToDisplay = new Object[sizeColumns];

    				while (iData < data.length && iColumn < sizeColumns) {
    					
    					Column c = tableDisplayed.getColumns().get(iColumn);
    					
    					if (c != null && !isOutputColumn(c)) {
    						// On ajoute cet élément
    						Object convertedData = convertStringToTargetType(data[iData], c.getDataType());
    						c.add(convertedData);
    						dataToDisplay[iColumn] = convertedData;
    						iData++;
    					} else {
    						dataToDisplay[iColumn] = null;
    					}
    					
    					iColumn++;
    				}
    				
    				tableModel.addRow(dataToDisplay);
    			}
    		} catch (IOException ioException) {
    			ioException.printStackTrace();
    		}
    	}
    	
    	List<Algorithm> algos = schemaTable.getAlgorithmsTakingAtLeastOneColumnAsInput(tableDisplayed.getColumns());
    	// On tente d'appliquer les algorithmes qui concernent ces colonnes en input
		tryToExecuteAlgorithms(algos);
    }

    private void tryToExecuteAlgorithms(List<Algorithm> algorithms) {
    	
    	for (Algorithm algorithm : algorithms) {
    		// Vérifier la validité des colonnes d'entrée
    		boolean validInput = true;
    		
    		List<Integer> columnSizes = new ArrayList<Integer>();
    		
    		for (Column inputColumn : algorithm.getInputs()) {
    			if (inputColumn == null || !inputColumn.checkTypes() || !inputColumn.checkConstraints()) {
    				validInput = false;
    				break;
    			}
    			columnSizes.add(inputColumn.getTailleCorrecte());
    		}

    			
			if (validInput) {
				// On réduit à la taille maximale possible qui correspond à tout le monde
				int minSize = columnSizes.stream().mapToInt((i) -> i).min().orElse(0);
				
				if(minSize > 0) {					
					// Générer le fichier CSV d'entrée
					String csvInputPath;
					try {
						csvInputPath = generateCsvForAlgorithmInput(algorithm, minSize);
						
						// Exécuter l'algorithme via Python
						String csvOutputPath = executePythonAlgorithm(algorithm.getPath(), csvInputPath, algorithm.getPath().replaceAll(".py", "") + "-output.csv");
						
						// Lire les résultats et mettre à jour les colonnes de sortie
						List<List<String>> resultData = readCsvResults(csvOutputPath);
						updateOutputColumns(algorithm.getOutputs(), resultData);
						
						updateTableModel(tableDisplayed);
						
						
						// On voit s'il y a des algorithmes où les outputs qui sont des inputs dans d'autres algos
						List<Algorithm> algos = schemaTable.getAlgorithmsTakingAtLeastOneColumnAsInput(algorithm.getOutputs());
						
						// Attention : boucle infinie possible si des algos se retournent la balle
						tryToExecuteAlgorithms(algos);
					} catch (IOException | InterruptedException e) {
						e.printStackTrace();
					}
				}
    		}
    	}
    }
    
    private String generateCsvForAlgorithmInput(Algorithm algorithm, int size) throws IOException {
    	String csvFilePath = algorithm.getPath().replaceAll(".py", "") + "-input.csv"; // Chemin du fichier CSV à générer
    	
    	try (PrintWriter csvWriter = new PrintWriter(new File(csvFilePath))) {
    		
    		for (Column inputColumn : algorithm.getInputs()) {
    			
    			if (inputColumn != null) {
    				boolean isPremier = true;
    				// Écrire les données de la colonne dans le fichier CSV
    				for (Object data : inputColumn.getSubDatas(0, size)) {
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
    		normalizeSizeOfRows(tableDisplayed);
    	}
    }

    private void normalizeSizeOfRows(Table table) {
    	int maxColumnLength = table.getColumns().stream()
				                .mapToInt(column -> column.getDatas().size())
				                .max().orElse(-1);
    	
    	if (maxColumnLength > 0) {
    		for (Column c : table.getColumns()) {
    			if (c.getDatas().size() < maxColumnLength) {
    				c.add(null, maxColumnLength - 1);    				
    			}
    		}    		
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
    		System.out.println("ERREUR : La table est vide !!!");
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
    	for(Column c : tableDisplayed.getColumns()) {
    		c.clean();
    	}
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
	
    private Column getColumnObjectAt(int modelColumnIndex) {
    	if (tableDisplayed != null) {
    		return tableDisplayed.getColumns().get(modelColumnIndex);
    	} else {
    		return null;
    	}
    }
    
    private boolean isOutputColumn(Column column) {
    	// Vérifiez si la colonne est une colonne de sortie d'un algorithme
    	for (Algorithm algorithm : schemaTable.getAlgorithms()) {
    		if (algorithm.getOutputs().contains(column)) {
    			return true;
    		}
    	}
    	return false;
    }
   
}
