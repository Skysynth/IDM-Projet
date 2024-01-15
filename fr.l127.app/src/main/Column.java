package main;

import java.util.ArrayList;
import java.util.List;

public class Column {
	
    private int id;
    
    private List<Object> datas;
    private List<Constraint> constraints;
    
    private String name;
    private Class<?> dataType; // Type de données attendu pour cette colonne

    public Column(int id, Class<?> dataType) {
        this(id, "Colonne " + id, dataType);
    }
    public Column(int id, String name, Class<?> dataType) {
        this.id = id;
        this.name = name;
        this.dataType = dataType;
    
        datas = new ArrayList<>();
        constraints = new ArrayList<>();
    }
    

    public void add(Object data) {
    	if (dataValid(data)) {
    		datas.add(data);    		
    	} else {
    	    throw new IllegalArgumentException("Type de donnée incorrect pour la colonne : " + name + data.getClass().getSimpleName());
    	}
    }
    
    public void add(Object data, int index) {
    	if (dataValid(data)) {    		
    		ensureCapacity(index + 1);
    		datas.set(index, data);
    	} else {
    	    throw new IllegalArgumentException("Type de donnée incorrect pour la colonne : " + name + data.getClass().getSimpleName());
    	}
    }

    public void addConstraint(Constraint c) {
        constraints.add(c);
    }

    public void updateData(int index, Object data) {
        if (data != null && !dataType.isInstance(data)) {
            throw new IllegalArgumentException("Type de donnée incorrect pour la colonne : " + name + data.getClass().getSimpleName());
        } else {
            // Assurer que l'index est dans la plage correcte
    		ensureCapacity(index + 1);
    		datas.set(index, data);	
        }
    }
    
    // Méthode pour s'assurer que la liste 'datas' a la capacité requise
    private void ensureCapacity(int size) {
        while (datas.size() < size) {
            datas.add(null);
        }
    }
    
    public int getTailleCorrecte() {
    	int taille = 0;
    	
    	while (taille < datas.size() && datas.get(taille) != null) taille++;
    	
    	return taille;
    }

    public boolean checkConstraints() {
    	
    	List<Object> subDatas = getDatasCorrects();
    	
		for(Constraint c : constraints) {
			if(!c.checkColumn(subDatas)) {
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

    private boolean dataValid(Object data) {
    	if (data != null && !dataType.isInstance(data)) {
    		return false;
    	}
    	return true;
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
	
	public List<Object> getDatasCorrects() {
		return datas.subList(0, getTailleCorrecte());
	}
	
	public List<Object> getSubDatas(int fromInclusive, int toExclusive) {
		try {			
			return datas.subList(fromInclusive, toExclusive);
		} catch (Exception e) {
			return null;
		}
	}

	public Class<?> getDataType() {
		return dataType;
	}

	public void setDatas(List<Object> datas) {
		this.datas = datas;
	}

	public void clean() {
		this.datas.clear();
	}
}
