package main;

import java.lang.reflect.Method;

public class Tool {
	
	public static <T> Method getMethodByName(Class<T> c, String methodName) {
		
        Method result = null;

        Method[] methods = c.getDeclaredMethods();

        for (Method method : methods) {
            if (method.getName().equals(methodName)) {
                result = method;
            }
        }

        return result;
    }
    

    public static Object[] convertArguments(String[] arguments, Class<?>[] parameterTypes) {
        if (arguments.length != parameterTypes.length) {
            throw new IllegalArgumentException("Le nombre d'arguments ne correspond pas au nombre de paramètres de la méthode.");
        }

        Object[] convertedArgs = new Object[arguments.length];

        for (int i = 0; i < arguments.length; i++) {
            convertedArgs[i] = convertArgument(arguments[i], parameterTypes[i]);
        }

        return convertedArgs;
    }

    public static Object convertArgument(String argument, Class<?> parameterType) {

    	switch (parameterType.getSimpleName()) {
            case "String":
                return argument;
            case "int":
            case "Integer":
                return Integer.parseInt(argument);
            case "char":
            case "Character":
                return argument.charAt(0);
            case "float":
            case "Float":
                return Float.parseFloat(argument);
            default:
                throw new IllegalArgumentException("Type d'argument non pris en charge : " + parameterType.getSimpleName());
        }
    }
	
}