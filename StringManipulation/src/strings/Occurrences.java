package strings;

import java.util.HashMap;
import java.util.HashSet;

public class Occurrences {
	 
	 public static void countOccurrence() {
		 HashSet <Integer> hs = new HashSet<Integer>();
		 HashMap <Integer,Integer> hm = new HashMap<Integer,Integer>();
		 Integer[] nums = {10,10,5,12,3,5};
		 
		 for(Integer i : nums) {
			 hs.add(i);
		 }
		 
		 for(Integer i : nums) {
			 Integer count = 0;
			 for(Integer j : nums) {
				 if(i == j) {
					 count++;
				 }
			 }
			 hm.put(i,count);
		 }
		 
		 System.out.println("Number of Occurrences:");
		 System.out.println(hm);
		 
	 }
}
