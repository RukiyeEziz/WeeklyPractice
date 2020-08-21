package Aug_06;

import java.util.Comparator;

import Aug_06.HelloCollections.Pokeman;

public class ComparePokeName implements Comparator<Pokeman>{

	@Override
	public int compare(Pokeman arg0, Pokeman arg1) {
		// TODO Auto-generated method stub
		//return 0;
		
		System.out.println("The compare method is running");
		return arg1.name.toLowerCase().compareTo(arg0.name.toLowerCase());
	}
	

}
