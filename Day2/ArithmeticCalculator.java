package Day2;

import java.util.Scanner;

public class ArithmeticCalculator {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int first_number = scanner.nextInt();
		System.out.println("Enter second number : ");
		int second_number = scanner.nextInt();
		
		double result;
		
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Exists");
		
		int choice = scanner.nextInt();
		
		switch(choice) {
		case 1 :
			result = first_number + second_number;
			System.out.println("Addition : " + result);
			break;
			
		case 2 :
			result = first_number - second_number;
			System.out.println("Difference : " + result);
			break;
			
		case 3 : 
			result = first_number * second_number;
			System.out.println("Product : "  + result);
			break;
			
		case 4 :
			if(second_number != 0) {
				result = first_number / second_number;
				System.out.println(result);
			}
			else {
				System.out.println("Error: cannot divide by zero.");
			}
			break;
			
		default :
			System.out.println("Invalid choice!");
		}
		
		scanner.close();
	}
}
