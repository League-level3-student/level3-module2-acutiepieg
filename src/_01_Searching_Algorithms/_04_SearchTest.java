package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import _01_Searching_Algorithms._00_LinearSearch;

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
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
