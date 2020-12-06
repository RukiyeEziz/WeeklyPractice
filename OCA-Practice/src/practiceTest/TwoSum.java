package practiceTest;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] numbers = new int[] {2, 1, 7, 5, 8};
		int targetSum = 7;
		int[] result = getTwoSum(numbers, targetSum);
		System.out.println(result[0] + " " + result[1]);
		
	}
	
	public static int[] getTwoSum(int[] numbers, int target) {
		
		//key = value of the array, and value is index of array
		Map<Integer, Integer> visitedNumbers = new HashMap<>();
		for(int n : numbers) {
			System.out.print(n+ " ");
		}
		System.out.print("\ntarget sum = " + target);
		for(int i = 0; i < numbers.length; i++) {
			int difference = target - numbers[i];	
			
			System.out.print("\ndifference: "+ difference+ " ");
			if(visitedNumbers.containsKey(difference)) {
				System.out.println("\nentryset " + visitedNumbers.entrySet());
				System.out.println("\ni = "+i+" get difference = "+visitedNumbers.get(difference));
				return new int[] { i, visitedNumbers.get(difference)};
			}
			System.out.println("\nput "+ numbers[i] + " i "+ i);
			visitedNumbers.put(numbers[i], i);			
		}
		return new int[] {-1,-1};
	}

}
