package main;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Column <T> {
	
	private List<T> datas;
	
	private List<Constraint> constraints;
	
	public List<T> getDatas() {
		return datas;
	}
	
	public Column() {
		datas = new ArrayList<T>();
		constraints = new ArrayList<Constraint>();
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
				result = result && c.checkColumn(this);
			}
		}
		
		return result;
	}
	
	
	
}