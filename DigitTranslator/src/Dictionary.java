
public class Dictionary {
	public static String getDict(int num){
		String[] digits = {"One","Two","Three", "Four", "Five", "Six", "Seven", "Eight", "Nine","Ten","Eleven","Twelve", "Thirteen","Fourteen","Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen",};
		String[] doubleDigits = {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy","Eighty", "Ninety"};
		String[] multiDigits = {"Thousand","Million","Billion"}; 
		if (num < 1){
			return "";
		}
		
		if (num<20){
			return digits[num-1];
		}
		else if (num<100) {
			return doubleDigits[num/10 - 2];
		}
		else{
			int size = (int)(Math.log10(num));
			size = size - (size % 3);
			return multiDigits[size / 3 -1];
		}
	}
}
