package Day1;

import java.util.Scanner;

public class StudentGradeCalculator {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Student name : ");
		String name = scanner.nextLine();
		System.out.println("Enter Java marks : ");
		int java = scanner.nextInt();
		System.out.println("Enter Pyhton marks : ");
		int python = scanner.nextInt();
		System.out.println("Enter SQL marrks : ");
		int sql = scanner.nextInt();
		System.out.println("Enter Web-Development :  ");
		int web_development = scanner.nextInt();
		System.out.println("Enter Machine Learning marks : ");
		int machine_learning = scanner.nextInt();
		
		int total = java + python + sql + web_development + machine_learning;
		
		double average = total / 5;
		
		String grade;
		String result;
		
		if(average >= 95 ) {
			grade = "S";
		} else if(average >= 75 && average < 95) {
			grade = "A";
		} else if(average >= 65 && average < 75) {
			grade = "B";
		} else if(average >= 50 && average < 65) {
			grade = "C";
		} else if(average >= 40 && average < 50) {
			grade = "D";
		} else {
			grade = "Fail";
		}
		
		if(java >= 40 && python >= 40 && sql >= 40 && web_development >= 40 && machine_learning >= 40) {
			result = "Pass";
		} else {
			result = "Fail";
		}
		
		System.out.println("\n\n---------Student Report----------\n");
		System.out.println("Name : " + name);
		System.out.println("Total : " + total + "/500");
		System.out.println("Average : " + average);
		System.out.println("Grade : " + grade);
		System.out.println("Result : " + result);
		
		scanner.close();
	}
}
