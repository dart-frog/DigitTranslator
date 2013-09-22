import java.util.Scanner;


public class UserInterface {
	static Scanner console = new Scanner(System.in);
	public static void main (String Args[]){
		askBot();
	}
	
	public static void askBot(){
		Scanner console = new Scanner(System.in);
		System.out.print("what number would you like translated");
		
		String answer = console.next();
		if (answer.equalsIgnoreCase("exit")){
			
		}
		else{
			int yourNum = Integer.parseInt(answer); 
			System.out.println(getNumber(yourNum));
			askBot();
		}
		
		
		
	}
	public static String getNumber(int num){
		if (num == 0){
			return "";
		}
		else if(num < 20){
			return  Dictionary.getDict(num) + " ";
		}
		else if (num < 100){
			int tail = num % 10;
			num = num - tail; 
			return Dictionary.getDict(num) + " " + Dictionary.getDict(tail) + " ";
		}
		else if (num < 1000){
			int tail = num % 100;
			int front = num / 100;
			return getNumber(front) + "Hundred " + getNumber(tail); 
		}
		else  {
			int length = (int)(Math.log10(num));
			int frontCount = length % 3 + 1;
			int front = num / (int)Math.pow(10, length - frontCount + 1);
			int tail = (int)(num % Math.pow(10,length));
			num = (int)Math.pow(10, length);
			if (num < 1000000){
				tail = tail % 1000;
			}
			if (num < 1000000000){
				tail = tail % 1000000;
			}
			return getNumber(front) + Dictionary.getDict(num) + " " + getNumber(tail);
		}
		
		
	}
}
