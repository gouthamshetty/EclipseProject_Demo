package com.calculator;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number:");
		int num1 = scanner.nextInt();
		System.out.print("Enter the Second number:");
		int num2 = scanner.nextInt();
		CalculatorApp calculator = new CalculatorApp();
		System.out.println("Sum:"+calculator.sum(num1, num2));
		System.out.println("Substraction:"+calculator.substraction(num1, num2));
		System.out.println("Multiplication:"+calculator.multiply(num1, num2));
		System.out.println("Division:"+calculator.divide(num1, num2));
		scanner.close();		
		
		
	}
	

}
