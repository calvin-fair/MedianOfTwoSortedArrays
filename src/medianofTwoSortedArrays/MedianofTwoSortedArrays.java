package medianofTwoSortedArrays;

public class MedianofTwoSortedArrays {
	
	/**
	 * This function is used to find the median of two combined sorted arrays.
	 * @param num1 - first sorted array.
	 * @param num2 - second sorted array.
	 * @return - The middle number or average of the two middle numbers after the array has been sorted.
	 */
	public double median(int[] num1, int[] num2) {
		int[] combined = new int[num1.length + num2.length];
		int leftItr = 0, rightItr = 0;
		int itr = 0;
		
		while(leftItr < num1.length && rightItr < num2.length) {
			if(num1[leftItr] < num2[rightItr]) {
				combined[itr] = num1[leftItr];
				leftItr++;
			} else {
				combined[itr] = num2[rightItr];
				rightItr++;
			}
			itr++;
		}
		
		while(leftItr < num1.length) {
			combined[itr] = num1[leftItr];
			leftItr++;
			itr++;
		}
		
		while(rightItr < num2.length) {
			combined[itr] = num2[rightItr];
			rightItr++;
			itr++;
		}
		
		int middle = combined.length / 2;
		double median = 0;
		
		if(combined.length % 2 == 0) {
			median = ((double) combined[middle - 1] + (double) combined[middle]) / 2;
		} else {
			median = (double) combined[middle];
		}
		return median;
	}

}
