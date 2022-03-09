package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Consonants {

	public static void countConsonants(Scanner s) {
		System.out.println("Enter a sentence: ");
		String userSentence = s.nextLine();

		List<Character> consonants = new ArrayList<Character>();
		for (char c : userSentence.toCharArray()) {
			if (Character.isLetter(c)) {
				switch (c) {
				case 'a':
					break;
				case 'e':
					break;
				case 'i':
					break;
				case 'o':
					break;
				case 'u':
					break;
				default:
					consonants.add(c);
					userSentence = userSentence.replace(c, '*');
				}
			}
		}

		System.out.println("There are " + consonants.size() + " consonants in your sentence.");
		System.out.println("Your sentence with the consonants replaced is: \n" + userSentence);
	}

}
