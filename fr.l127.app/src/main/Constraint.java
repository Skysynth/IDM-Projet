package main;

import java.lang.reflect.Method;
import java.util.List;

public class Constraint {
	
	String name;
	
	String[] arguments;
	
	Class<ConstraintsDefinition> classDC = ConstraintsDefinition.class;
	
	public Constraint(String name, String[] arguments) {
		this.name = name;
		this.arguments = arguments;	
	}
	
	public boolean checkColumn(List<Object> datas) {
		
		boolean result = true;
		
		try {
            // On obtient la méthode par son nom
            Method method = Tool.getMethodByName(classDC, name);
            
            for(Object data : datas) {
            	
				String[] augmentedArguments = new String[arguments.length + 1];
				
				augmentedArguments[0] = data.toString();
				
				int i = 0;
				while(i < arguments.length) {
					augmentedArguments[i+1] = arguments[i];
					i++;
				}
			
            	
				Object[] objectArguments = Tool.convertArguments(augmentedArguments, method.getParameterTypes());
				
				// Invocation de la méthode
			     result = result && (boolean) method.invoke(null, objectArguments);
			     
			     i = 0;
			     while(i < objectArguments.length) {
			    	 i++;
			     }
			 
            }
          
		
		} catch(Exception e) {
			result = false;
			e.printStackTrace();
		}
		
		return result;
	}	
	
}