import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class DictionaryTest {
	@Test
	public void canRetrieve(){
		assertEquals("number expected to be one", "One", Dictionary.getDict(1));
		assertEquals("number expected to be two", "Two", Dictionary.getDict(2));
		assertEquals("number expected to be three", "Three", Dictionary.getDict(3));
		assertEquals("number expected to be four", "Four", Dictionary.getDict(4));
		assertEquals("number expected to be five", "Five", Dictionary.getDict(5));
		assertEquals("number expected to be six", "Six", Dictionary.getDict(6));
		assertEquals("nummber expected to be seven", "Seven", Dictionary.getDict(7));
		assertEquals("number expected to be eight", "Eight", Dictionary.getDict(8));
		assertEquals("number expected to be nine", "Nine", Dictionary.getDict(9));
		assertEquals("number expected to be ten", "Ten", Dictionary.getDict(10));
		assertEquals("number expected to be eleven", "Eleven", Dictionary.getDict(11));
		assertEquals("number expected to be twelve", "Twelve", Dictionary.getDict(12));
		assertEquals("number expected to be thirteen", "Thirteen", Dictionary.getDict(13));
		assertEquals("number expected to be fourteen", "Fourteen", Dictionary.getDict(14));
		assertEquals("number expected to be fifteen", "Fifteen", Dictionary.getDict(15));
		assertEquals("number expected to be sixteen", "Sixteen", Dictionary.getDict(16));
		assertEquals("number expected to be seventeen", "Seventeen", Dictionary.getDict(17));
		assertEquals("number expected to be eighteen", "Eighteen", Dictionary.getDict(18));
		assertEquals("number expected to be nineteen", "Nineteen", Dictionary.getDict(19));
		assertEquals("number expected to be twenty", "Twenty", Dictionary.getDict(20));
	}
	@Test
	public void canRetriveDoubleDigits(){
		assertEquals("number expected to be thirty", "Thirty", Dictionary.getDict(30));
		assertEquals("number expected to be forty", "Forty", Dictionary.getDict(40));
		assertEquals("number expected to be fifty", "Fifty", Dictionary.getDict(50));
		assertEquals("number expected to be sixty", "Sixty", Dictionary.getDict(60));
		assertEquals("number expected to be seventy", "Seventy", Dictionary.getDict(70));
		assertEquals("number expected to be eighty", "Eighty", Dictionary.getDict(80));
		assertEquals("number expected to be ninety", "Ninety", Dictionary.getDict(90));
	}
	@Test
	public void canRetrieveMultiDigits(){
		assertEquals("number expected to thousand", "Thousand", Dictionary.getDict(1000));
		assertEquals("number expected to million", "Million", Dictionary.getDict(1000000));
		assertEquals("number expected to billion", "Billion", Dictionary.getDict(1000000000));
	}
}
