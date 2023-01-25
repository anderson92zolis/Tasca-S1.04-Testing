package n2exercici1;

import static org.junit.jupiter.api.Assertions.*;
import org.hamcrest.Matcher;
import org.hamcrest.FeatureMatcher;
import org.junit.jupiter.api.Test;

class LengthOfStringTest {
	
	public static Matcher<String> length(Matcher<? super Integer> matcher){
		return new FeatureMatcher<String, Integer>(matcher,"Longitud de String correcto","longitud de String incorrecta"){
			@Override
			protected Integer featureValueOf(String palabra) {
				return palabra.length();
			}
		};
	}
	@Test
	void testLengthOfString() {
		assertEquals(8,LengthOfString.LengthOfString("MORDOR"));
	}

}
