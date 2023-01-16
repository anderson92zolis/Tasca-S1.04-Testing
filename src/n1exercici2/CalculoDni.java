package n1exercici2;

public class CalculoDni {
	
	private char lletraDNI;

	public CalculoDni(int numeroDni) {
		
		lletraDNI = calculaLletraDNI(numeroDni);
	} 
	
	
	public char calculaLletraDNI(int numeroDNI) {
		
		String tableLetterofDni= "TRWAGMYFPDXBNJZSQVHLCKE";
		
		int moduloNumeroDni= numeroDNI%23;
		
		char letterDNI = tableLetterofDni.charAt(moduloNumeroDni);
		
		return letterDNI;
	}
	
}
