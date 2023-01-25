package n1exercici2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class CalculoDniTest {
		
	@ParameterizedTest
	@CsvSource ({"12345678,Z", "22345678,M", "32345678,L", "42345678,X", "52345678,R",  												
		"62345678,S", "72345678,Y","82345678,C","92345679,N", "10345678,W"})	
	
	public void testCalculaLletraDNI(int numeroDNI,char correctLetterDni) {
		char myLetterDni= CalculoDni.calculaLletraDNI(numeroDNI);
		assertEquals(myLetterDni,correctLetterDni);
		
	}
}

//save for the future ->  https://www.baeldung.com/parameterized-tests-junit-5