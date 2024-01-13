package main;

import java.util.ArrayList;
import java.util.List;

public class Column {
	
    private int id;
    
    private List<Object> datas;
    private List<Constraint> constraints;
    
    private String name;
    private Class<?> dataType; // Type de données attendu pour cette colonne

    public Column(int id, String name, Class<?> dataType) {
        this.id = id;
        this.name = name;
        this.dataType = dataType;
        
        datas = new ArrayList<>();
        constraints = new ArrayList<>();
    }

    public void add(Object data) {
        datas.add(data);
    }

    public void addConstraint(Constraint c) {
        constraints.add(c);
    }

    public void updateData(int index, Object data) {
        if (data != null && !dataType.isInstance(data)) {
            throw new IllegalArgumentException("Type de donnée incorrect pour la colonne : " + name + data.getClass().getName());
        } else {
            // Assurer que l'index est dans la plage correcte
        	if (data != null) {
        		ensureCapacity(index + 1);
        		datas.set(index, data);        		
        	} else {
        		
        		// On boucle pour nelever les null jusqu'à une valeur non null
        		for(int i = index; i >= 0; i--) {
        			if (datas.get(i) == null) {
        				datas.remove(index);        				
        			}
        		}
        	}
        	
        }
    }
    
    // Méthode pour s'assurer que la liste 'datas' a la capacité requise
    private void ensureCapacity(int size) {
        while (datas.size() < size) {
            datas.add(null);
        }
    }
    
    public boolean checkConstraints() {
	
		for(Constraint c : constraints) {
			if(!c.checkColumn(this)) {
				return false;
			}
		}
		
		return true;
    }

    public boolean checkTypes() {
        for (Object data : datas) {
            if (data != null && !dataType.isInstance(data)) {
                return false; // Type incorrect
            }
        }
        return true; // Tous les types sont corrects
    }
    
    public boolean checkTypesAndNoNull() {
    	for (Object data : datas) {
            if (data == null || !dataType.isInstance(data)) {
                return false; // data incorrect
            }
        }
        return true; // tous les datas sont corrects
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
	
	public List<Object> getDatas() {
		return datas;
	}

	public Class<?> getDataType() {
		return dataType;
	}

	public void setDatas(List<Object> datas) {
		this.datas = datas;
	}
	
}
