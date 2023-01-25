package n1exercici3;
import org.junit.Test;


//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;

public class ArrayOutOfBoundExceptionTest {

	@Test (expected = ArrayIndexOutOfBoundsException.class )
	public void testCompuebaArrayIndexOutOfBoundsException() {
		
		ArrayOutOfBoundException.compuebaArrayIndexOutOfBoundsException();
		
		/*int index=10;	
		
		ArrayOutOfBoundException pruebaArray = new ArrayOutOfBoundException(index);	
		
		try {
			ArrayList<Integer>indexArray= pruebaArray.compuebaArrayIndexOutOfBoundsException();
			System.out.println("index de list"+ index+ indexArray[index]);
			pruebaArray.compuebaArrayIndexOutOfBoundsException();
			//fail("Expected an IndexOutOfBoundsException to be thrown");
			}catch(IndexOutOfBoundsException  e){
				System.out.println("indice de ArrayIncorrecto!");
				}*/
		}

}
