package n1exercici3;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class ArrayOutOfBoundExceptionTest {

	@Test
	void testCompuebaArrayIndexOutOfBoundsException() {
		
		int index=10;		
		ArrayOutOfBoundException pruebaArray = new ArrayOutOfBoundException(index);	
		
		try {
			int[] indexArray= pruebaArray.getMi_matriz();
			System.out.println("index de list"+ index+ indexArray[index]);
			pruebaArray.compuebaArrayIndexOutOfBoundsException();
			fail("Expected an IndexOutOfBoundsException to be thrown");
			}catch(IndexOutOfBoundsException  e){
				System.out.println("indice de ArrayIncorrecto!");
				}
	}

}
