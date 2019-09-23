package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import _01_Searching_Algorithms._00_LinearSearch;
import _01_Searching_Algorithms._01_BinarySearch;
import _01_Searching_Algorithms._02_InterpolationSearch;
import _01_Searching_Algorithms._03_ExponentialSearch;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] words = { "cat", "dog", "bat"};
		int result = _00_LinearSearch.linearSearch(words, "cat");
		assertEquals(0, result);
		
		String[] words2 = { "1", "2", "3", "4", "5"};
		int result2 = _00_LinearSearch.linearSearch(words2, "4");
		assertEquals(3, result2);
		
		String[] words3 = {"hi", "hello", "hey", "aloha", "greetings", "salutations"};
		int result3 = _00_LinearSearch.linearSearch(words3, "salutations");
		assertEquals(5, result3);
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] numbers = {0, 1, 2, 3, 4, 5, 6};
		int r1 = _01_BinarySearch.binarySearch(numbers, 0, numbers.length - 1, 4);
		assertEquals(4, r1);
		
		int[] numbers2 = {2, 4, 7, 9, 14};
		int r2 = _01_BinarySearch.binarySearch(numbers2, 0, numbers2.length - 1, 8);
		assertEquals(-1, r2);
		
		int[] numbers3 = {3, 5, 10, 16, 25};
		int r3 = _01_BinarySearch.binarySearch(numbers3, 0, numbers3.length - 1, 25);
		assertEquals(4, r3);
		
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] numbers = {0, 1, 2, 3, 4, 5, 6};
		int r1 = _02_InterpolationSearch.interpolationSearch(numbers, 2);
		assertEquals(2, r1);
		
		int[] numbers2 = {2, 4, 6, 8, 10};
		int r2 = _02_InterpolationSearch.interpolationSearch(numbers2, 2);
		assertEquals(0, r2);
		
		int[] numbers3 = {100, 200, 300};
		int r3 = _02_InterpolationSearch.interpolationSearch(numbers3, 160);
		assertEquals(-1, r3);

	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] numbers = {0, 1, 2, 3, 4, 5, 6};
		int r1 = _03_ExponentialSearch.exponentialSearch(numbers, 5);
		assertEquals(5, r1);
		
		int[] numbers2 = {3, 6, 12, 17};
		int r2 = _03_ExponentialSearch.exponentialSearch(numbers2, 6);
		assertEquals(1, r2);
		
		int[] numbers3 = {2, 5, 8, 11, 14};
		int r3 = _03_ExponentialSearch.exponentialSearch(numbers3, 3);
		assertEquals(-1, r3);
		
	}
}
