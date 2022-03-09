package strings;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {

	public static void isPalindrome(Scanner s) {
		System.out.println("Enter a word: ");
		String userWord = s.nextLine();
		char[] word = userWord.toCharArray();
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
		if(isPalindrome) {
			System.out.println(userWord + " is a palindrome!!");
		}
		if(isPalindrome == false) {
			System.out.println(userWord + " is not a palindrome!!");
		}
		System.out.println(isPalindrome);

	}
}
