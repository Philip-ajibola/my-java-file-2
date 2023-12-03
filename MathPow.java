import java.util.Scanner;

public class MathPow{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	System.out.print("Enter A number");
	double number = input.nextDouble();

	System.out.print("Enter A number");
	int number2 = input.nextInt();

	double result = Math.pow(number,number2);
	System.out.print(result);	
	}



}