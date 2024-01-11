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
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class GeneratedSwing extends JFrame {

	private static final long serialVersionUID = 9122431279624803101L;
	private DefaultTableModel tableModel;
    private JTable table;

    private JScrollPane scrollPane;
    private JButton jbAddRowButton, jbAddColumnButton, jbImportCSVFile, jbExportCSVFile, jbExecute, jbClean;

    private int nbColonnesEntrees, nbColonnesSorties;

    
	public GeneratedSwing() {
		super("Excel-Like GUI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); // Centre la fenêtre
        this.setMinimumSize(new Dimension(800, 600));
        this.setSize(800, 600);
        
	    nbColonnesEntrees = 2;
	    nbColonnesSorties = 1;
        
        // Création du modèle de tableau par défaut
        tableModel = new DefaultTableModel(0, nbColonnesEntrees + nbColonnesSorties);

        // TODO : Définir des valeurs initiales dans certaines cases d'après le modèle (exemple en dessous)
        // tableModel.setValueAt("A1", 0, 0);
        // tableModel.setValueAt("B2", 1, 1);
        // tableModel.setValueAt("C3", 2, 2);

        // Initialisation du tableau avec le modèle
        table = new JTable(tableModel);

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

        jbAddColumnButton.addActionListener(new ActionButtons());
        jbAddRowButton.addActionListener(new ActionButtons());
        jbImportCSVFile.addActionListener(new ActionButtons());
        jbExportCSVFile.addActionListener(new ActionButtons());
        jbExecute.addActionListener(new ActionButtons());
        jbClean.addActionListener(new ActionButtons());

        // Panneau pour les boutons
        // JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JToolBar toolBar = new JToolBar();
        
        toolBar.add(jbAddRowButton);
        toolBar.add(jbAddColumnButton);
        toolBar.add(jbImportCSVFile);
        toolBar.add(jbExportCSVFile);
        toolBar.add(jbExecute);
        toolBar.add(jbClean);
        
        // Ajout du panneau de boutons dans le BorderLayout en bas
        this.add(toolBar, BorderLayout.SOUTH);


        // Rendre la fenêtre visible
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GeneratedSwing());
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
			else {
				System.out.println("Shouldn't see that, call 911");
			}
		}
    	
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

    // Chemin absolu du répertoire de travail actuel
    // String workingDir = System.getProperty("user.dir");

    // Construction du chemin absolu vers le script
    // String absolutePythonScriptPath = workingDir + File.separator + pythonScriptPath;
	
	private void onExecute() {

		// AVANT D'EXECUTER : exporter nos informations dans un fichier csv
		exportCSV(new File("input.csv"));
		
	    try {
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
	
	private void onClean() {
		tableModel.setRowCount(0);
	}
}
