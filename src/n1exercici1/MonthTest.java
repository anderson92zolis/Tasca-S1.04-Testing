package n1exercici1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class MonthTest {

	
	//Verifica amb jUnit que la llista té 12 posicions, que no és nul·la i que en la seva posició 8 conté el nom 'agost'.
	
	@Test
	public void testRetornSize() {
		int sizeOfArrayLEsperado = 12;
		int sizeOfArrayLReal= Month.month().size(); 
		assertEquals(sizeOfArrayLEsperado, sizeOfArrayLReal); 
	}

	@Test
	public void testRetornTrueSiNulla() {
		assertNotNull(Month.month().size()); // assertNotNull Junit
	}

	@Test
	public void testRetornaTrueSiWordAreTheSame() {
		String monthToLook= "Agosto";
		String expectedWord = Month.month().get(7);
		assertEquals(monthToLook,expectedWord);  
	}

}
