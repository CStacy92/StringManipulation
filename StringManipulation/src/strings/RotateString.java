package strings;

import java.util.LinkedList;
import java.util.Scanner;

public class RotateString {

	public static void rotate(Scanner s) {
		LinkedList <Character> collect = new LinkedList<Character>();
		System.out.println("Enter a word to rotate:");
		String word = s.nextLine();
		
		System.out.println("How many rotations? Enter a numeral:");
		int num = s.nextInt();
		
		char [] chars = word.toCharArray();
		
		for(char c : chars) {
			collect.add(Character.valueOf(c));
		}
		
		while (num > 0) {
			char tmp = collect.pollLast();
			collect.addFirst(tmp);
			num--;
		}
		for(char x : collect) {
			System.out.print(x);
		}
	}
}
