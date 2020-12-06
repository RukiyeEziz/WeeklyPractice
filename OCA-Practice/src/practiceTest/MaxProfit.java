package practiceTest;

import java.util.Arrays;

public class MaxProfit {

	public static void main(String[] args) {
		int[] arr = {9, 11, 8, 5, 7, 10, 1};
		System.out.println("Max profit: " + getMaxProfit(arr));
		

	}
	public static int getMaxProfit(int[] arr) {
		//java.util.Arrays.sort(arr);
		Arrays.sort(arr);
		return arr[arr.length-1] - arr[0];
	}
}
