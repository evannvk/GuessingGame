package guessing_game;

import java.util.Scanner;

public class GuessingGame {

	private static final int WINNING_NUMBER = 7;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Guess a number between 1 & 10 (0 for help):");

		int userGuess = input.nextInt();

		for (int guessCount = 0; guessCount < 1; guessCount++) {
			while (userGuess == 0) {
				System.out.println("Enter a value between 1 & 10 and \nif you guess right you will win.");
				userGuess = input.nextInt();
			}

			if (userGuess != WINNING_NUMBER) {
				System.out.println("You lose!?");
				userGuess = input.nextInt();
			} else {
				System.out.println("You win!");
				System.exit(1);
				break;
			}
		}
		System.out.println("GAME OVER.");
	}

}