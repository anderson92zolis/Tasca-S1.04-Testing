package n1exercici2;

public class CalculoDni {
	
	public CalculoDni() {} 
	
	
	public static char calculaLletraDNI(int numeroDNI) {
		
		String tableLetterofDni= "TRWAGMYFPDXBNJZSQVHLCKE";
		
		int moduloNumeroDni = numeroDNI%23;
		
		char letterDNI = tableLetterofDni.charAt(moduloNumeroDni);
		
		return letterDNI;
	}

}
