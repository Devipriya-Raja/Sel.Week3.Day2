package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class RemoveDuplicates {
	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";

		String[] strarr = text.split(" "); // split string to string array

		List<String> list = new ArrayList<String>(); // creating new list item

		list = Arrays.asList(strarr); // pass in split string array into list

		System.out.println(list);

		int[] count = new int[list.size()]; // count for each word

		for (int i = 0; i <= list.size() - 1; i++) {
			count[i]++; // increment for each word
			for (int j = i + 1; j <= list.size() - 1; j++) {

				if (list.get(i).equalsIgnoreCase(list.get(j))) { // compares adjacent words
					count[i]++; // increments current word if matching next word
					list.set(j, "0"); // set next word to "0" to avoid duplicate counting

				}
			}
		}
		// prints list items
		for (int k = 0; k <= list.size() - 1; k++) {
			if (!(list.get(k).equalsIgnoreCase("0"))) {
				System.out.println("Word " + list.get(k) + " has frequency of " + count[k]);
			}
			// if count > 1 then replace with " "
			if (count[k] > 1) {
				list.set(k, " ");
			}

		}

		System.out.println("Given text after duplicates removed - " + list);

	}

}
