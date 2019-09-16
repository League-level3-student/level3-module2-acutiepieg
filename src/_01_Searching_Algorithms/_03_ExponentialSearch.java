package _01_Searching_Algorithms;

public class _03_ExponentialSearch {

	// Exponential search is super efficient for large data sets by
	// optimizing the binary search. It, like the binary search, only
	// works with sorted data.

	// 1. Complete the steps in the exponentialSearch method.
	// We can assume that array is sorted.


	public static int exponentialSearch(int array[], int value) {
		// 2. Check if the array element at 0 is the value.
		// If it is, then return 0.
		if (array[0] == value) {
			return 0;
		}
		// 3. create an integer called counter and initialize it to 1;
		int counter = 1;
		// 4. make while loop that checks for two conditions:
		// counter is less than the length of the array,
		// and the array element at counter is less than or equal to value
		int minimum = 0;
		while (counter < array.length && array[counter] <= value) {
			// 5. inside the while loop, double the value of counter.
			counter = counter * 2;
			// 6. create an integer called minimum

			// 7. if counter is less than the length of the array,
			// set minimum equal to counter
			if (counter < array.length) {
				minimum = counter;
			}
			// 8. otherwise, set minimum equal to the length of the array minus 1.
			else {
				minimum = array.length - 1;
			}
			// 9. use the binary search method you wrote using the following parameters:
			// the array to be searched
			// half of the counter
			// minimum
			// the value to be found
			binarySearch(array, counter / 2, minimum, value);

		}
		// 10. return the result
		return binarySearch(array, counter / 2, minimum, value);
		
	}

	public static int binarySearch(int[] array, int start, int end, int value) {
		// 2. if end is greater than or equal to start, then
		// do steps 3 - 6.
		if (end >= start) {
			// 3. create an integer called mid and set it equal
			// to the half way point between start and end
			int mid = (start + end) / 2;
			// 4. if the array element at mid is equal to value
			// then return mid
			if (array[mid] == value) {
				return mid;
			}
			// 5. if the array element at mid is greater than value
			// then return the value returned from a call to the
			// binarySearch method. Pass in start and mid - 1
			// for the end variable.
			if (array[mid] > value) {
				return binarySearch(array, start, mid - 1, value);
			}
			// 6. return the value returned from a call to the binarySearch
			// method. Use mid + 1 as the start, and pass in end.
			return binarySearch(array, mid + 1, end, value);
		}
		// 7. return -1 because the value was not found
		return -1;
	}
}
