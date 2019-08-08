package _00_Sorting_Algorithms;

import java.util.Arrays;

public class BubbleSorter extends Sorter {
	public BubbleSorter() {
		type = "Bubble";
	}

	// 1. Use the bubble sorting algorithm to sort the array.
	// You can use display.updateDisplay() to show the current
	// progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		boolean sorted = false;
		int counter = 0;
		while (sorted == false) {
			counter = 0;
			for (int i = 0; i < array.length; i++) {
				if (i != array.length - 1) {
					if (array[i] > array[i + 1]) {
						int num = array[i];
						int num2 = array[i + 1];
						array[i] = num2;
						array[i + 1] = num;
						counter = counter + 1;
						display.updateDisplay();
					}
				}
			}
			if (counter == 0) {
				sorted = true;
				break;
			}
		}
	}
}
