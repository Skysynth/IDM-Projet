package main;

public class ConstraintsDefinition {
	
	public static boolean positif(int element) {	
		return element > 0;
	}
	
	public static boolean beginBy(String element, char begin) {
		return element.charAt(0) == begin;
	}
	
	public static boolean superieur(int element, int borne) {
		return element > borne;
	}
	
}