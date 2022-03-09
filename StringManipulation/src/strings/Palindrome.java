package strings;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {

	public static void isPalindrome(Scanner s) {
		System.out.println("Enter a word: ");
		char[] word = s.nextLine().toCharArray();
		boolean isPalindrome = false;

		Stack<Character> charStack = new Stack<Character>();

		for (char c : word) {
			charStack.push(c);
		}

		for (int i = 0; i < word.length; i++) {
			if (charStack.pop() == word[i]) {
				isPalindrome = true;
			} else {
				isPalindrome = false;
			}
		}
		System.out.println(isPalindrome);

	}
}
