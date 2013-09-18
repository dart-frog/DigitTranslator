import java.util.Scanner;


public class UserInterface {
	static Scanner console = new Scanner(System.in);
	public static void main (String Args[]){
		
	}
	public static void askBot(){
		
	}
	public static String getNumber(int num){
		if(num < 20){
			return  Dictionary.getDict(num);
		}
		else if (num%10 == 0){
			return Dictionary.getDict(num);
		}
		else if (num < 100){
			int tail = num % 10;
			num = num - tail; 
			return Dictionary.getDict(num) + " " + Dictionary.getDict(tail);
		}
		else{
			return null;
		}
		
		
	}
}
