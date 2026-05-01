package Day3;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessing {
	public static void main(String[] args) {
		
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("🎮 Welcome to number Guessing Game!");
		System.out.println("Guess a number between 1 to 100\n");
		int tryCount = 0;
		
		while(true) {
			System.out.println("Enter guessing number : ");
			int userGuessing = scanner.nextInt();
			tryCount++;
			
			if(randomNumber == userGuessing) {
				System.out.println("\n\n-------Your Results is-------\n");
				System.out.println("🎉Congrats! Your Guessing is Correct! You win!");
				System.out.println("Attemps : " + tryCount);
				
				int score = 10 - tryCount;
				if(score < 0) {
					System.out.println("Your score is : " + score + "/10");
				} else if(score == 9) {
					System.out.println("Your score is : " + score + "/10");
				} else {
					System.out.println("Your score is : " + score + "/10");
				}
				break;
			} else if(randomNumber > userGuessing) {
				System.out.println("Your Guessing number is Low guess again...");
			} else if(randomNumber < userGuessing) {
				System.out.println("Your Guessing number is High guess again...");
			} else {
				System.out.println("Please Try again!");
			}
		}

		scanner.close();
	}
}