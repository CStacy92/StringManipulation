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

		//Count words ending in 's' and 'y'
		//Switch first 's' word with first 'y' word
		LastLetterCount.countAndSwitch(s);
		

		//Count number of occurrences
		Occurrences.countOccurrence();

		//Vowel counter
		Vowels.vowelCounter(s);
		
		//Palindrome checker
		Palindrome.isPalindrome(s);
		
		//Word counter
		Words.numWords(s);
		
		//Rotate String
		RotateString.rotate(s);

		//Count words ending in 's' and 'y'
		//Switch first 's' word with first 'y' word
		LastLetterCount.countAndSwitch(s);
		
		//Return unique characters
		TraverseString.uniqueChars(s);

	}

}
