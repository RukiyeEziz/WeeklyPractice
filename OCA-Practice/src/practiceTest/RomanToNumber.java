package practiceTest;

import java.util.Scanner;
//Friday Coding Challenge:
//Challenge: Given a Roman numeral, find the corresponding decimal value. 
//Inputs will be between 1 and 3999.
//Example:
//Input: IX
//Output: 9
//Input: VII
//Output: 7

public class RomanToNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter roman number - I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		System.out.println("Input: " + input.toUpperCase());
		int output = convertRomanToNumber(input.toUpperCase());
		System.out.println("Output: " + output);
		
		
		scan.close();
		
	}

	private static int convertRomanToNumber(String input) {

		int result = 0;
		
		for(int i = 0; i < input.length(); i++) {
			int n1 = getValue(input.charAt(i));
			
			if( (i+1) < input.length()) {
				int n2 = getValue(input.charAt(i+1));
				
				if(n1 >= n2) {
					result += n1;
				}else {
					result += n2 - n1;
					i++;
				}
				
			}else {
				result += n1;
			}
		}
		
		return result;
	}

	private static int getValue(char c) {
		
		switch(c) {
			case 'I': return 1;
			case 'V': return 5;
			case 'X': return 10;
			case 'L': return 50;
			case 'C': return 100;
			case 'D': return 500;
			case 'M': return 1000;
			default: return -1;
		}
		
	}

}
