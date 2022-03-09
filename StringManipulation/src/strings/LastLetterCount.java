package strings;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class LastLetterCount {

	public static void countAndSwitch(Scanner s) {
		System.out.println("Enter a sentence:");
		String sentence = s.nextLine();
		String[] userSentence = sentence.split(" ");
		Queue<String> swords = new ArrayDeque<String>();
		Queue<String> ywords = new ArrayDeque<String>();

		for (String word : userSentence) {
			if ('s' == word.charAt(word.length() - 1)) {
				swords.add(word);
			} else if ('y' == word.charAt(word.length() - 1)) {
				ywords.add(word);
			}
			
		int numS = swords.size();
		int numY = ywords.size();
		}
		if (swords.isEmpty()) {
			System.out.println("Cannot switch words: no word ending in 's'");
		} else if (ywords.isEmpty()) {
			System.out.println("Cannot switch words: no word ending in 'y'");
		} else {
			String sw = swords.poll();
			String yw = ywords.poll();

			sentence = sentence.replaceFirst(sw, "*****");
			sentence = sentence.replaceFirst(yw, "#####");
			sentence = sentence.replace("*****", yw);
			sentence = sentence.replace("#####", sw);

			System.out.println(sentence);
		}

	}
}
