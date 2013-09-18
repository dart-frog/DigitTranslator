
public class Dictionary {
	public static String getDict(int num){
		String[] digits = {"one","two","three", "four", "five", "six", "seven", "eight", "nine","ten","eleven","twelve", "thirteen","fourteen","fifteen", "sixteen", "seventeen", "eighteen", "nineteen",};
		String[] doubleDigits = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy","eighty", "ninety"};
		String[] multiDigits = {"hundred"}; 
		if (num<20){
			return digits[num-1];
		}
		else if (num<100) {
			return doubleDigits[num/10 - 2];
		}
		else{
			return multiDigits[num/100 - 1];
		}
	}
}
