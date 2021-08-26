package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*System.out.printf("%s%d%s" ,"What's popping? I'm ",100," Years old\n");
	System.out.printf("%d", 4%2);
	System.out.println("\nThis\nis\nOOP");
	System.out.println("\"This is oop\"");*/

		//adding 2 numbers
		Scanner input = new Scanner(System.in);
//		System.out.println("Enter first number: ");
//		int number1 = input.nextInt();
//        System.out.println("Enter second number: ");
//		double number2 = input.nextDouble();
//		double sum = number1 + number2;
//
//		System.out.println("The sum is "+ sum);

		//even numbers
		int even;
		System.out.println("Enter first number: ");
		int num1 = input.nextInt();
		System.out.print("Enter the 2nd number: ");
		int num2 = input.nextInt();
		if (num1 > num2)
		{
			System.out.println("The biggest number is: ");
			System.out.println(num1);
		}
		if (num2>num1)
		{
			System.out.println("The biggest number is: ");
			System.out.println(num2);
		}

    }
}
