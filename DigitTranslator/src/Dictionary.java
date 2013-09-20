
public class Dictionary {
	public static String getDict(int num){
		String[] digits = {"one","two","three", "four", "five", "six", "seven", "eight", "nine","ten","eleven","twelve", "thirteen","fourteen","fifteen", "sixteen", "seventeen", "eighteen", "nineteen",};
		String[] doubleDigits = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy","eighty", "ninety"};
		String[] multiDigits = {"thousand","million","billion"}; 
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
