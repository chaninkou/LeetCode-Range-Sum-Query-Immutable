package rangeSum;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {-2,0,3,-5,2,-1};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		FindRangeSumQueryFunction solution = new FindRangeSumQueryFunction(nums);
		
		System.out.println("sumRange(0, 2) => " + solution.sumRange(0, 2));
		
		System.out.println("sumRange(2, 5) => " + solution.sumRange(2, 5));
	}
}
