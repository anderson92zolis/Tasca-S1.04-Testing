package n1exercici3;

import java.util.ArrayList;

public class ArrayOutOfBoundException {
	
	
	public static  ArrayList<String> compuebaArrayIndexOutOfBoundsException() throws ArrayIndexOutOfBoundsException {
		
		ArrayList<String> my_programs= new ArrayList<String>();
		
		//mi_numbers.add("R");
		
		for (int i = 0; i < my_programs.size(); i++) {
			System.out.println(my_programs.get(i));
		} 
		
		throw new ArrayIndexOutOfBoundsException("llanci una ArrayIndexOutOfBoundsException");
	
		}
}
