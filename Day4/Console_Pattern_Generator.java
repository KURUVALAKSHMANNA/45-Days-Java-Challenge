package Day4;

import java.util.Scanner;

public class Console_Pattern_Generator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("\n\n----- Pattern Generator Menu -----\n");
			System.out.println("1. Number Triangle");
            System.out.println("2. Star Triangle");
            System.out.println("3. Multiplication Table");
            System.out.println("4. Even Number Pattern");
            System.out.println("5. Odd Number Pattern");
            System.out.println("6. Floyd’s Triangle");
            System.out.println("7. Reverse Number Triangle");
            System.out.println("8. Reverse Star Pattern");
            System.out.println("9. Right Pyramid Pattern");
            System.out.println("10. Inverted Pyramid Pattern");
            System.out.println("11. Diamond Pattern");
            System.out.println("12. Exists");
            
            System.out.println("\nEnter choice : ");
            choice = scanner.nextInt(); 
            
            System.out.println("Enter number of rows : ");
            int n = scanner.nextInt();
            System.out.println();
            
            switch(choice) {
            
            case 1 :   // Number Triangle
            	for(int i = 1; i <= n; i++) {
            		for(int j = 1; j <= i; j++) {
            			System.out.print(j + " ");
            		} 
            		System.out.println();
            	} break;
            	
            case 2:  // Star Triangle
            	for(int i = 1; i <= n; i++) {
            		for(int j = 1; j <= n; j++) {
            			System.out.print("* ");
            		}
            		System.out.println();
            	} break;
            	
            case 3 :  // Multiplication Table
            	for(int i = 1; i <= 10; i++) {
            		System.out.println(n + " X " + i + " = " + (n*i));
            	} break;
            	
            case 4 : // Even Numbers
            	for(int i = 2; i <= n * 2; i+=2) {
            		System.out.print(i + " ");
            	} break;
            	
            case 5 :  // Odd Numbers
            	for(int i = 1; i <= n*2; i += 2) {
            		System.out.print(i + " ");
            	} break;
            	
            case 6 :  // Floyd's Triangle
            	int num = 1;
            	for(int i = 1; i <= n; i++) {
            		for(int j= 1; j <= i; j++) {
            			System.out.print(num++ + " ");
            		} 
            		System.out.println();
            	} break;
            	
            case 7 :  // Reverse Number Triangle 
            	for(int i = n; i >= 1; i--) {
            		for(int j = 1; j <= i; j++) {
            			System.out.print(j + " ");
            		}
            		System.out.println();
            	} break;
            	
            case 8 : // Reverse  Star Pattern
            	for(int i = n; i >= 1; i--) {
            		for(int j = 1; j <= i; j++) {
            			System.out.print("* ");
            		} 
            		System.out.println();
            	} break;
            	
            case 9 : // Right Pyramid Pattern 
            	for(int i = 1; i <= n; i++) {
            		for(int j = 1; j <= n-i; j++) {
            			System.out.print(" ");
            		} 
            		for(int j = 1; j <= i; j++) {
            			System.out.print("* ");
            		}
            		System.out.println();
            	} break;
            	
            case 10 : // Inverted Pyramid Pattern
            	for(int i = n; i >= 1; i--) {
            		for(int j = 1; j <= n-i; j++) {
            			System.out.print(" ");
            		} 
            		for(int j = 1; j <= i; j++) {
            			System.out.print("* ");
            		}
            		System.out.println();
            	} break;
            	
            case 11 :  // Diamond Pattern 
            	// Upper Part
            	for(int i = 1; i <= n; i++) {
            		for(int j = 1; j <= n-i; j++) {
            			System.out.print(" ");
            		} 
            		for(int j = 1; j <= i; j++) {
            			System.out.print("* ");
            		}
            		System.out.println();
            	} // Lower Part
            	for(int i = n-1; i >= 1; i--) {
            		for(int j = 1; j <= n-i; j++) {
            			System.out.print(" ");
            		}
            		for(int j = 1; j <= i; j++) {
            			System.out.print("* ");
            		}
            		System.out.println();
            	} break;
            case 12 :  	// Exist
            	System.out.println("Thanking you!");
            	break;
            	
            	default :
            		System.out.println("Invalid choose!");
            }
			
		} while(choice != 12);

		scanner.close();
	}

}
