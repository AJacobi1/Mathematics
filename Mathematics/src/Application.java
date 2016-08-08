import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c;		//declare integers a, b, c
		System.out.println("Enter two numbers:");
		Scanner in = new Scanner(System.in);
		a = in.nextInt();		//input value for 'a'
		b = in.nextInt();		//input value for 'b'
		c = a + b;		//sum for value 'c'
		System.out.println("Sum equals = " + c);
	}

}
