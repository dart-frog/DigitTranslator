import java.util.Scanner;


public class UserInterface {
	static Scanner console = new Scanner(System.in);
	public static void main (String Args[]){
		
	}
	public static void askBot(){
		
	}
	public static String getNumber(int num){
		if(num < 20){
			return  Dictionary.getDict(num) + " ";
		}
		else if (num%10 == 0 && num < 91){
			return Dictionary.getDict(num) + " ";
		}
		else if (num < 100){
			int tail = num % 10;
			num = num - tail; 
			return Dictionary.getDict(num) + " " + Dictionary.getDict(tail) + " ";
		}
		else if (num < 1000){
			int tail = num % 100;
			int front = num / 100;
			return getNumber(front) + "hundred " + getNumber(tail); 
		}
		else{
			int length = (int)(Math.log10(num));
			int frontCount = length % 3 + 1;
			int front = num / (int)Math.pow(10, length - frontCount + 1);
			int tail = (int)(num % Math.pow(10,length));
			num = (int)Math.pow(10, length);
			return getNumber(front) + Dictionary.getDict(num) + " " + getNumber(tail);
		}
		
		
	}
}
