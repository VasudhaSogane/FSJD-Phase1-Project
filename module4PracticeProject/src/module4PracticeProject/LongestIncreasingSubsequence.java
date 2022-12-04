package module4PracticeProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LongestIncreasingSubsequence {
	public static void main(String[] args) {
		//array of random numbers
		int nums[] = {15,6,12,8,1,9,5,14};
		int arrayLength = nums.length;
		System.out.println("Given array is:");
		System.out.println(Arrays.toString(nums));
		
		
		//array dp to hold the max length for corresponding elements
		//array subSequence to hold the index of the previous number in LIS
		int dp[] = new int[arrayLength];
		int subsequence[] = new int[arrayLength];
		
		//initializing arrays to default values 
		Arrays.fill(dp, 1);
		Arrays.fill(subsequence, -1);
		
		//to hold the max length of LIS
		int max = -1;
		//to hold the index of last element of LIS
		int lastIndex = 0;
		
		//starting from index 1, each element is compared to all the previous elements 
		//to check if it is part of LIS
		for(int i=1;i<arrayLength;i++) {
			for(int j=0;j<i;j++) {
				if(nums[j]<nums[i]) {
					if(dp[i]<=dp[j]+1) {
						dp[i]=dp[j]+1;
						subsequence[i]=j;
					}
				}
			} 
			if(dp[i]>max) {
				max=dp[i];
				lastIndex=i;
			}
		}
		System.out.println("Longest Increasing Sequence is of length:"+max);
		
		//ArrayList LIS holds the elements of LIS in reverse order
		ArrayList<Integer> LIS = new ArrayList<>();
		
		//fetching a subset from array subSequence 
		//numbers from the array at these indexes are added to get final LIS
		LIS.add(nums[lastIndex]);
		while(subsequence[lastIndex]>=0) {
			LIS.add(nums[subsequence[lastIndex]]);
			lastIndex = subsequence[lastIndex];
		}
		//reversing the ArrayList to get LIS 
		Collections.reverse(LIS);
		System.out.println("Longest Increasing Sequence is:\n"+LIS);
	}
}
