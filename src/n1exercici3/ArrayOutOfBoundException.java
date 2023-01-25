package n1exercici3;

import java.util.ArrayList;

public class ArrayOutOfBoundException {
	
	
	public static  ArrayList<String> compuebaArrayIndexOutOfBoundsException() throws ArrayIndexOutOfBoundsException {
		
		ArrayList<String> mi_numbers= new ArrayList<String>();
		
		for (int i = 0; i < mi_numbers.size(); i++) {
			System.out.println(mi_numbers.get(i));
			
		} 
		
		throw new ArrayIndexOutOfBoundsException("crea la clase ArrayIndexOutOfBoundsException");
	
		}
	
	// crear el metodo que retorne un Array
}
