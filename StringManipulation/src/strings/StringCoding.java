package strings;

import java.util.Scanner;

public class StringCoding {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//Consonant counter
		Consonants.countConsonants(s);
		
		//Vowel counter
		Vowels.vowelCounter(s);
		
		//Palindrome checker
		Palindrome.isPalindrome(s);
		
		//Word counter
		Words.numWords(s);
		
		//Rotate String
		RotateString.rotate(s);

	}

}
