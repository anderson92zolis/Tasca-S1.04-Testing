package n1exercici3;


public class ArrayOutOfBoundException {
	
	public ArrayOutOfBoundException() {}
	
	public String compuebaArrayIndexOutOfBoundsException(int index) throws ArrayIndexOutOfBoundsException {
	
		String[] carsArray= {"Volvo", "BMW", "Ford", "Mazda"}; // length =4
		
		if( index > carsArray.length ||  index <0 ) {
			
			throw new ArrayIndexOutOfBoundsException("llanci una ArrayIndexOutOfBoundsException");
		
		}
		return carsArray[index];
	} 
	
}
