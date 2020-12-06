package practiceTest;

public class missingParentheses {

	public static void main(String[] args) {
		
		
		//String input = "(()()())";
		String input = "(()()()";
		System.out.println(findParenthese(input));
		

	}

	private static int findParenthese(String input) {
		// maintain balance of string
		int bal = 0;
		int ans = 0;
		
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '(') {
				bal += 1;
			}else {
				bal += -1;
			}
			// guaranteed bal is >= -1
			if(bal == -1) {
				ans += 1;
				bal += 1;
			}
		}
		
		return bal+ans;
	}

}
