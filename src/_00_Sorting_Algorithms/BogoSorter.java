package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}

	// Bogo sort is a joke sorting algorithm. It is considered the most
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.

	// It works by following these steps:
	// STEP 1. Is the array in order?
	// if yes, finished; if no, go to step 2.
	boolean sorted = true;

	public void check(int[] array, SortingVisualizer display) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] > array[i+1]) {
				bogoSort(array, display);
				break;
			}
		}
		System.out.println("array is sorted");

	}

	// STEP 2. Take two random elements in the array and swap them.
	public void bogoSort(int[] array, SortingVisualizer display) {
		Random r = new Random();
		int r1 = r.nextInt(array.length);
		int r2 = r.nextInt(array.length);
		int value = array[r1];
		array[r1] = array[r2];
		array[r2] = value;
		display.updateDisplay();
		check(array, display);
	}
	// STEP 3. Go back to step 1.

	// 1. Complete the sort method using the Bogo sort algorithm.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		check(array, display);
		display.updateDisplay();
	}
}
