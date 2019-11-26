package medianofTwoSortedArrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MedianofTwoSortedArraysTest {
	MedianofTwoSortedArrays test = new MedianofTwoSortedArrays();
	
	
	@Test
	void testOne() {
		int[] num1 = {1, 3};
		int[] num2 = {2};
		
		double expect = 2.0;
		
		assertEquals(expect, test.median(num1, num2));
	}
	
	@Test
	void testTwo() {
		int[] num1 = {1, 3};
		int[] num2 = {2, 4};
		
		double expect = 2.5;
		
		assertEquals(expect, test.median(num1, num2));
	}

}
