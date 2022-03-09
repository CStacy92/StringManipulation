package strings;

import java.util.Scanner;

public class Words {

	public static void numWords(Scanner s) {
		System.out.println("Enter a sentence: ");
		
		String[] numWords = s.nextLine().split(" ");
		
		System.out.println("This sentence contains " + numWords.length + " words.");
		
	}
}
