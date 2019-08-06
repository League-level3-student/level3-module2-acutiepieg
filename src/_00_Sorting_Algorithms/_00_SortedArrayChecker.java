package _00_Sorting_Algorithms;

import java.lang.reflect.Array;

public class _00_SortedArrayChecker {
	// 1. Write a static method called intArraySorted.
	// This method takes in an array of integers
	// and it returns a boolean.
	// The method returns true if the integer
	// array is in ascending order and false otherwise
	public static boolean intArraySorted(int[] array) {
		for (int i = 0; i < Array.getLength(array); i++) {
			if (i != Array.getLength(array) - 1) {
				if (array[i] > array[i + 1]) {
					return false;
				}
			}
		}
		return true;
	}

	// 2. Write a static method called doubleArraySorted.
	// This method takes in an array of doubles
	// and it returns a boolean.
	// The method returns true if the double
	// array is in ascending order and false otherwise
	public static boolean doubleArraySorted(double[] array) {
		for (int i = 0; i < Array.getLength(array); i++) {
			if (i != Array.getLength(array) - 1) {
				if (array[i] > array[i + 1]) {
					return false;
				}
			}
		}
		return true;
	}

	// 3. Write a static method called charArraySorted.
	// This method takes in an array of characters
	// and it returns a boolean.
	// The method returns true if the character
	// array is in alphabetical order and false otherwise
	// (You can compare characters just like integers)
	public static boolean charArraySorted(char[] array) {
		for (int i = 0; i < Array.getLength(array); i++) {
			if (i != Array.getLength(array) - 1) {
				if (array[i] > array[i + 1]) {
					return false;
				}
			}
		}
		return true;
	}

	// 4. Write a static method called stringArraySorted.
	// This method takes in an array of Strings
	// and it returns a boolean.
	// The method returns true if the String
	// array is in alphabetical order and false otherwise
	// (Use the compareTo(String) method)
public static boolean stringArraySorted(String[] array) {
	for (int i = 0; i < array.length; i++) {
		if (i != array.length - 1) {
			if(array[i].compareTo(array[i+1]) > 0) {
				return false;
			}
		}
	}
	return true;
}
}
