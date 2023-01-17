package n1exercici2;
import java.util.HashMap; // import the HashMap class

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculoDniTest {
		
	@Test
	void testCalculaLletraDNI() {
		
		HashMap<Integer,Character> lettersDNIinAList = new HashMap<Integer, Character>();
		
		Integer dni1 = 12345678;
		Integer dni2 = 22345678;
		Integer dni3 = 32345678;
		Integer dni4 = 42345678;
		Integer dni5 = 52345678;
		Integer dni6 = 62345678;
		Integer dni7 = 72345678;
		Integer dni8 = 82345678;
		Integer dni9 = 92345679;
		Integer dni10 = 10345678;
		
		lettersDNIinAList.put(dni1,'Z');
		lettersDNIinAList.put(dni2,'M');
		lettersDNIinAList.put(dni3,'L');
		lettersDNIinAList.put(dni4,'X');
		lettersDNIinAList.put(dni5,'R');
		lettersDNIinAList.put(dni6,'S');
		lettersDNIinAList.put(dni7,'Y');
		lettersDNIinAList.put(dni8,'C');
		lettersDNIinAList.put(dni9,'N');
		lettersDNIinAList.put(dni10,'W');
	
		int count = 0;
		
		CalculoDni metodo;
		
		for (Integer dni : lettersDNIinAList.keySet()) {
			
			metodo= new CalculoDni(dni);
			if (lettersDNIinAList.get(dni) == metodo.calculaLletraDNI(dni)) {
				count++;
				;}; 
		  }	 
		assertEquals(10,count);
	}

}
