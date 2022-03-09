package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vowels {
	
	public static void vowelCounter(Scanner s) {

	System.out.println("Enter a sentence: ");
	String userSentence = s.nextLine();

	List<Character> vowels = new ArrayList<Character>();
	for (char c : userSentence.toCharArray()) {
		if (Character.isLetter(c)) {
			switch (c) {
			case 'a':
				vowels.add(c);
			case 'e':
				vowels.add(c);
			case 'i':
				vowels.add(c);
			case 'o':
				vowels.add(c);
			case 'u':
				vowels.add(c);
			}
		}
	}

	System.out.println("There are " + vowels.size() + " vowels in your sentence.");
}
}
