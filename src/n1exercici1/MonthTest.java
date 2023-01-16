package n1exercici1;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class MonthTest {
	//Verifica amb jUnit que la llista té 12 posicions, que no és nul·la i que en la seva posició 8 conté el nom 'agost'.
	@Test
	void testRetornSize() {
		Month months= new Month();
		int sizeOfArrayLEsperado = 12;
		int sizeOfArrayLReal=  months.retornSize(); 
		assertEquals(sizeOfArrayLEsperado, sizeOfArrayLReal, 0); 
	}

	@Test
	void testRetornTrueSiNulla() {
		Month months= new Month();
		boolean sizeOfArrayLReal= months.retornTrueSiNulla();
		assertTrue(sizeOfArrayLReal); 
	}

	@Test
	void testRetornaTrueSiWordAreTheSame() {
		Month months= new Month();
		String monthToLook= "Agosto";
		boolean expectedWord = months.retornaTrueSiWordAreTheSame(monthToLook);
		assertTrue(expectedWord);  
	}

}
