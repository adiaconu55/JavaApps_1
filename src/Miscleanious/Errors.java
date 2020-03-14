package Miscleanious;

import java.util.Scanner;

public class Errors {
	public static void main(String[] args) {
		while (true) {
			String[] words = {" This ", " is ", " a ", " Java ", " scramble ", " game. "};
			System.out.print("The scrambled phrase is: ");
			System.out.println(words[4] + words[0] + words[2] + words[3] + words[1] + words[5]);
			Scanner in = new Scanner(System.in);
			System.out.println("Which is the first word from the phrase: ");
			String firstWord = in.next();
		System.out.println("You typed: " +firstWord);
		boolean isCorrect = firstWord.equals("This");
		if (!isCorrect) {
			System.out.print("YOU WON!");
			break;
		}
		in.close();
	}
	}
}
