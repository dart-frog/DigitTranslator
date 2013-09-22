import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TranslatorTest {
	@Test
	public void canTurnIntoLetters(){
		assertEquals("number expected to be one", "One ", UserInterface.getNumber(1));
		assertEquals("number expected to be two", "Two ", UserInterface.getNumber(2));
		assertEquals("number expected to be three", "Three ", UserInterface.getNumber(3));
		assertEquals("number expected to be four", "Four ", UserInterface.getNumber(4));
		assertEquals("number expected to be five", "Five ", UserInterface.getNumber(5));
		assertEquals("number expected to be six", "Six ", UserInterface.getNumber(6));
		assertEquals("nummber expected to be seven", "Seven ", UserInterface.getNumber(7));
		assertEquals("number expected to be eight", "Eight ", UserInterface.getNumber(8));
		assertEquals("number expected to be nine", "Nine ", UserInterface.getNumber(9));
		assertEquals("number expected to be ten", "Ten ", UserInterface.getNumber(10));
		assertEquals("number expected to be eleven", "Eleven ", UserInterface.getNumber(11));
		assertEquals("number expected to be twelve", "Twelve ", UserInterface.getNumber(12));
		assertEquals("number expected to be thirteen", "Thirteen ", UserInterface.getNumber(13));
		assertEquals("number expected to be fourteen", "Fourteen ", UserInterface.getNumber(14));
		assertEquals("number expected to be fifteen", "Fifteen ", UserInterface.getNumber(15));
		assertEquals("number expected to be sixteen", "Sixteen ", UserInterface.getNumber(16));
		assertEquals("number expected to be seventeen", "Seventeen ", UserInterface.getNumber(17));
		assertEquals("number expected to be eighteen", "Eighteen ", UserInterface.getNumber(18));
		assertEquals("number expected to be nineteen", "Nineteen ", UserInterface.getNumber(19));
		assertEquals("number expected to be twenty", "Twenty  ", UserInterface.getNumber(20));
	}
	@Test
	public void canGoOverTwenty(){
		assertEquals("number expected to be twenty one", "Twenty One ", UserInterface.getNumber(21));
		assertEquals("number expected to be thirty", "Thirty  ", UserInterface.getNumber(30));
		assertEquals("number expected to be thirty two", "Thirty Two ", UserInterface.getNumber(32));
		assertEquals("number expected to be fourty three", "Forty Three ", UserInterface.getNumber(43));
		assertEquals("number expected to be fifty four", "Fifty Four ", UserInterface.getNumber(54));
		assertEquals("number expected to be sixty five", "Sixty Five ", UserInterface.getNumber(65));
	}
	@Test
	public void canGoOver99(){
		assertEquals("number expected to be one hundred", "One Hundred ", UserInterface.getNumber(100));
		assertEquals("number expected to be seven hundred", "Seven Hundred ", UserInterface.getNumber(700));
		assertEquals("number expected to be eight hundred five", "Eight Hundred Five ", UserInterface.getNumber(805));
		assertEquals("number expected to be five hundred sixty two ", "Eight Hundred Sixty Two ", UserInterface.getNumber(862));
	}@Test
	public void andBeyond(){
		assertEquals("number expected to be one thousand thirty one", "One Thousand Thirty One ", UserInterface.getNumber(1031));
		assertEquals("number expected to be ten thousand five hundred and fifty two", "Ten Thousand Five Hundred Fifty Two ", UserInterface.getNumber(10552));
		assertEquals("number expected to be 121,324", "One Hundred Twenty One Thousand Three Hundred Twenty Four ", UserInterface.getNumber(121324));
		assertEquals("number expected to be 1,000,000", "One Million ", UserInterface.getNumber(1000000));
		assertEquals("number expected to be 54,543,901", "Fifty Four Million Five Hundred Forty Three Thousand Nine Hundred One ", UserInterface.getNumber(54543901));
		assertEquals("number expected to be 1,000,000,000", "One Billion ", UserInterface.getNumber(1000000000));
		assertEquals("number expected to be 2,085,921,145", "Two Billion Eighty Five Million Nine Hundred Twenty One Thousand One Hundred Forty Five ", UserInterface.getNumber(2085921145));
	}
	@Test
	public void yourTest(){
		assertEquals("you thought this should be Eighteen","Eighteen ", UserInterface.getNumber(18));
		assertEquals("you thought this should be Nine Hundred thirty two", "Nine Hundred Thirty Two ", UserInterface.getNumber(932));
		assertEquals("you thought this should be One Hundred Thousand Fourteen", "One Hundred Thousand Fourteen ", UserInterface.getNumber(100014));
		assertEquals("you thought this should be Fifty One Million Eighty One Thousand Two Hundred Seventy Two", "Fifty One Million Eighty One Thousand Two Hundred Seventy Two ", UserInterface.getNumber(51081272));
	}
}
