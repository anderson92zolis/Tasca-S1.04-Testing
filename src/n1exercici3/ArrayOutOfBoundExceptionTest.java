package n1exercici3;
import org.junit.Test;

public class ArrayOutOfBoundExceptionTest {

	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testCompuebaArrayIndexOutOfBoundsException() {
		
		ArrayOutOfBoundException firstTest= new ArrayOutOfBoundException();
			
				firstTest.compuebaArrayIndexOutOfBoundsException(6);
		
	}

}
