import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNumber, secondNumber, sumNumbers;		//declare integers a, b, c
		System.out.println("Enter two numbers:");
		Scanner in = new Scanner(System.in);
		firstNumber = in.nextInt();		//input value for 'firstNumber'
		secondNumber = in.nextInt();		//input value for 'secondNumber'
		sumNumbers = firstNumber + secondNumber;		//sum for value 'sumNumbers'
		System.out.println("Sum equals = " +sumNumbers);
	}

}
