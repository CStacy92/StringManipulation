package strings;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class TraverseString {
	
	public static void uniqueChars(Scanner s) {
		System.out.println("Enter a sentence: ");
		char[] userSentence = s.nextLine().toLowerCase().toCharArray();
		
		LinkedHashSet<Character> unique = new LinkedHashSet<Character>();
		
		for(char c : userSentence) {
			unique.add(Character.valueOf(c));
		}
		
		System.out.println("Unique Characters:");
		for(Character l : unique) {
			System.out.print(l);
		}
	}

}
