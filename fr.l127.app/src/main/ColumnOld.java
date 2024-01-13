package main;

import java.util.ArrayList;
import java.util.List;

public class ColumnOld <T> {
	
	private int id;
	
	private List<T> datas;
	
	private List<Constraint> constraints;
	
	private String name;
	
	public ColumnOld(int id, String name) {
		datas = new ArrayList<T>();
		constraints = new ArrayList<Constraint>();
		
		this.id = id;
		this.name = name;
	}
	
	public void updateData(int index, Object data) {
        // Assurez-vous de gérer correctement les conversions de type ici
		
        if (datas.size() > index) {
            datas.set(index, (T) data); // Cast le type Object en T (le type générique de la colonne)
        } else {
            // Cela pourrait arriver si une nouvelle ligne est ajoutée au JTable
            while (datas.size() <= index) {
                datas.add(null); // Ajoute des éléments nuls pour atteindre l'index requis
            }
            datas.set(index, (T) data);
        }
    }

	public void add(T data) {
		datas.add(data);
	}
	
	public void addConstraint(Constraint c) {
		constraints.add(c);
	}
	
	public boolean checkConstraints() {
		
		System.out.println("B");
		
		boolean result = true;
		
		if(constraints != null) {
			System.out.println("C");
			for(Constraint c : constraints) {
				System.out.println("D");
				// result = result && c.checkColumn(this);
			}
		}
		
		return result;
	}
	
	public String getName() {
		return name;
	}


	public int getId() {
		return id;
	}


	public List<Constraint> getConstraints() {
		return constraints;
	}
	
	public List<T> getDatas() {
		return datas;
	}
	
	

}