import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TranslatorTest {
	@Test
	public void canTurnIntoLetters(){
		assertEquals("number expected to be one", "one", UserInterface.getNumber(1));
		assertEquals("number expected to be two", "two", UserInterface.getNumber(2));
		assertEquals("number expected to be three", "three", UserInterface.getNumber(3));
		assertEquals("number expected to be four", "four", UserInterface.getNumber(4));
		assertEquals("number expected to be five", "five", UserInterface.getNumber(5));
		assertEquals("number expected to be six", "six", UserInterface.getNumber(6));
		assertEquals("nummber expected to be seven", "seven", UserInterface.getNumber(7));
		assertEquals("number expected to be eight", "eight", UserInterface.getNumber(8));
		assertEquals("number expected to be nine", "nine", UserInterface.getNumber(9));
		assertEquals("number expected to be ten", "ten", UserInterface.getNumber(10));
		assertEquals("number expected to be eleven", "eleven", UserInterface.getNumber(11));
		assertEquals("number expected to be twelve", "twelve", UserInterface.getNumber(12));
		assertEquals("number expected to be thirteen", "thirteen", UserInterface.getNumber(13));
		assertEquals("number expected to be fourteen", "fourteen", UserInterface.getNumber(14));
		assertEquals("number expected to be fifteen", "fifteen", UserInterface.getNumber(15));
		assertEquals("number expected to be sixteen", "sixteen", UserInterface.getNumber(16));
		assertEquals("number expected to be seventeen", "seventeen", UserInterface.getNumber(17));
		assertEquals("number expected to be eighteen", "eighteen", UserInterface.getNumber(18));
		assertEquals("number expected to be nineteen", "nineteen", UserInterface.getNumber(19));
		assertEquals("number expected to be twenty", "twenty", UserInterface.getNumber(20));
	}
}