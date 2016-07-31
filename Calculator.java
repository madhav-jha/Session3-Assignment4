package session3.assignment4;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter operation to be performed viz. +, -, * or /");
		String opCode = sc.nextLine();
		System.out.println("Enter two numbers:");
		double number1 = sc.nextDouble();
		double number2 = sc.nextDouble();
		Operation o = new Operation();
		double result = o.operate(opCode,number1,number2);
		
		if(result == 0.0)
			System.out.println("Not a valid operation");
		else
			System.out.println(number1+" "+opCode+" "+number2+" = "+result);

	}

}
