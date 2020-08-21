package Aug_05;

public class HelloStrings {

	public static void main(String[] args) {
		
		String s1 = "Hello Java";
		String s2 = "Hello Java";
		String s3 = "hello java";
		String s4 = new String("Hello Java");
		
		System.out.println(s1==s2); // true
		System.out.println(s1==s3); // false
		System.out.println(s1==s4); // false
		System.out.println(s1.equals(s4)); // true
		System.out.println("-------------------------");
		
		System.out.println(s1.toLowerCase().equals(s3)); // true
		System.out.println(s1.equals(s3)); // false
		
		// convert s1 to lower case
		s1 = s1.toLowerCase();
		System.out.println(s1.equals(s3)); // true
		System.out.println("-------------------------");
		
		System.out.println(s2.charAt(4)); // o
		//System.out.println(s2.charAt(-1)); // StringIndexOutOfBoundsException
		System.out.println("-------------------------");
		
		for(int i = 0; i < s2.length(); i++) {
			System.out.println(s2.charAt(i));
		}
		System.out.println("-------------------------");
		
		System.out.println(s1.concat(" ").concat(s2));
		System.out.println("-------------------------");
		
		String sub = s1.substring(0, 4);
		System.out.println(sub);
		System.out.println("-------------------------");
		
		String[] arr1 = s1.split(" ");
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("-------------------------");
		
		char[] arr2 = s1.toCharArray();
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("-------------------------");
		

		
		System.out.println("-------------------------");
		
		System.out.println("-------------------------");
		
		
		
		

	}

}
