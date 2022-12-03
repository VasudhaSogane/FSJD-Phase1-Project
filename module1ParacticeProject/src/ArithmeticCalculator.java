

import java.util.Scanner;

class operations{
	public double addition(double a,double b) {
		return a+b;
	}
	public double subtraction(double a,double b) {
		return a-b;
	}
	public double multiplication(double a,double b) {
		return a*b;
	}
	public double division(double a,double b) {
		return a/b;
	}
}

public class ArithmeticCalculator {
	public static void main(String[] args) {
		operations OP = new operations();
		double a,b;
		Scanner sc = new Scanner(System.in);
		int choice; 

		do {
			System.out.println("Select the arithmetic operation");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			choice = sc.nextInt();

			switch(choice) {
			case 1:
				System.out.println("Please enter the integers");
				a=sc.nextDouble();
				b=sc.nextDouble();
				System.out.print("Addition of "+a+" and "+b+" is:");
				System.out.println(OP.addition(a, b));
				break;

			case 2:
				System.out.println("Please enter the integers");
				a=sc.nextDouble();
				b=sc.nextDouble();
				System.out.print("Subtraction of "+a+" by "+b+" is:");
				System.out.println(OP.subtraction(a, b));
				break;

			case 3:
				System.out.println("Please enter the integers");
				a=sc.nextDouble();
				b=sc.nextDouble();
				System.out.print("Multiplication of "+a+" and "+b+" is:");
				System.out.println(OP.multiplication(a, b));
				break;

			case 4:
				System.out.println("Please enter the integers");
				a=sc.nextDouble();
				b=sc.nextDouble();
				System.out.print("Division of "+a+" by "+b+" is:");
				System.out.println(OP.division(a, b));
				break;
			default:
				break;
			}


		}while(choice<5);

	}

}
