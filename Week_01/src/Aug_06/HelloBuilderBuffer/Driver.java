package Aug_06.HelloBuilderBuffer;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello Strings";
		System.out.println("s1 = " + s1);
		StringBuilder sb1 = new StringBuilder(s1);
		System.out.println("sb1 = " + sb1);
		
		sb1.append(" added builder, it is a ..");
		System.out.println("sb1 append = " + sb1);
		System.out.println("s1 still = " + s1);
		
		sb1.reverse();
		System.out.println("sb1 reversed = " + sb1);
		System.out.println("s1 still = " + s1);
		
		s1 = new String(sb1.reverse());
		System.out.println("s1 is reversed from sb1 = " + s1);
		StringBuilder sb2 = new StringBuilder(s1);
		System.out.println("sb2 is still s1 that reversed from sb1  == " + sb2);
		sb2.delete(4, 8);
		System.out.println("sb2 deleted 4 to 8 and now === " + sb2);
		
		System.out.println("-----------");
		
		User u1 = new User();
		u1.name = "Rukiye";
		u1.userName = "Ruki";
		u1.userId = 1;
		
		StringBuilder usb1 = new StringBuilder();
		usb1.append("Hello " + u1.name + ", please give me your user name");
		System.out.println(usb1);
		
		
		User u = new User();
		u.name= "Tim";
		u.userId= 111;
		u.userName = "TrainerTim";
		
		StringBuilder output = new StringBuilder();
		
		output.append("Hello, "+u.name+", please give me your user name?");
		
		System.out.println(output);
		
		output.delete(output.length()-30, output.length());
		output.append("your username is "+u.userName+" and userid is "+u.userId);
		
		System.out.println(output);

		
		
		

	}

}
class User {
	public String userName;
	public String name;
	public int userId;
	
}
