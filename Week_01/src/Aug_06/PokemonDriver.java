package Aug_06;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import Aug_06.HelloCollections.Pokeman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class PokemonDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pokeman> myPokeman = new ArrayList<>();
		
		myPokeman.add(new Pokeman(1, "Bulbasaur", "Grass"));
		myPokeman.add(new Pokeman(4, "Charmander", "Fire"));
		myPokeman.add(new Pokeman(7, "Squirtle", "Water"));
		myPokeman.add(new Pokeman(25, "Pikachu", "Electric"));
		myPokeman.add(new Pokeman(151, "Mew", "Psychic"));
		myPokeman.add(new Pokeman(25, "1Pikachu", "Electric"));
		myPokeman.add(new Pokeman(25, "pikachu", "Electric"));
		myPokeman.add(new Pokeman(95, "Onix", "Rock"));
		myPokeman.add(new Pokeman(4, "Charmander", "Fire"));
		myPokeman.add(new Pokeman(4, "Charmander", "Fire"));
		
		for(Pokeman p : myPokeman) {
			System.out.println(p);
		}
		
		System.out.println("my pokeman size is " + myPokeman.size());
		System.out.println("im getting 5th element == " + myPokeman.get(5));
		System.out.println("-----------------");
		
		HashSet<Pokeman> setPokeman = new HashSet<Pokeman>();
		setPokeman.add(new Pokeman(1, "Bulbasaur", "Grass"));
		setPokeman.add(new Pokeman(4, "Charmander", "Fire"));
		setPokeman.add(new Pokeman(7, "Squirtle", "Water"));
		setPokeman.add(new Pokeman(25, "Pikachu", "Electric"));
		setPokeman.add(new Pokeman(151, "Mew", "Psychic"));
		setPokeman.add(new Pokeman(25, "1Pikachu", "Electric"));
		setPokeman.add(new Pokeman(25, "pikachu", "Electric"));
		setPokeman.add(new Pokeman(95, "Onix", "Rock"));
		setPokeman.add(new Pokeman(4, "Charmander", "Fire"));
		setPokeman.add(new Pokeman(4, "Charmander", "Fire"));
		
		for(Pokeman p : setPokeman) {
			System.out.println(p);
			
			// using comparable compareto(name)
			p.compareTo(myPokeman.get(0));
		}
		
		System.out.println("my  set pokeman size is " + setPokeman.size());
		System.out.println("im getting 5th element ===== ");
		System.out.println("-----------------");
		
		// Collections sorted name ascending a-z
		Collections.sort(myPokeman);
		for(Pokeman p : myPokeman) {
			System.out.println(p);
		}
		System.out.println("-----------------");
		
		// reversing name order
		Collections.sort(myPokeman, new ComparePokeName());
		//Collections.reverse(myPokemon);
		
		for(Pokeman p: myPokeman) {
			System.out.println(p);
		}
		System.out.println("-----------------");
		
		// sorting elements of List(i) with Lambda expression:
		ArrayList<Integer> al = new ArrayList<Integer>(); 
        al.add(205); 
        al.add(102); 
        al.add(98); 
        al.add(275); 
        al.add(203); 
        System.out.println("Lambda Epr - Elements of the ArrayList " +  
                              "before sorting : " + al); 
  
        // using lambda expression in place of comparator object 
        Collections.sort(al, (o1, o2) -> (o1 > o2) ? -1 : 
                                       (o1 < o2) ? 1 : 0); 
  
        System.out.println("Lambda Epr - Elements of the ArrayList after" +  
                                           " sorting : " + al); 
        
        System.out.println("-----------------");
        
		// sorting TreeSet using lambda expression:
        TreeSet<Integer> h =  new TreeSet<Integer>((o1, o2) -> (o1 > o2) ?  
                                   -1 : (o1 < o2) ? 1 : 0); 
		 h.add(850); 
		 h.add(235); 
		 h.add(1080); 
		 h.add(15); 
		 h.add(5); 
		 System.out.println("Lambda Epr - Elements of the TreeSet after" +  
		                                 " sorting are: " + h); 
		 System.out.println("-----------------");
		 
		 Collections.sort(myPokeman, (p1, p2)  -> {return p1.number-p2.number;});
		 //Collections.sort(myPokeman, (Pokeman p1, Pokeman p2)  -> {return p1.number-p2.number;});
		 //Collections.sort(myPokeman, (Pokeman p1, Pokeman p2)  -> {return p1.name.toLowerCase().compareTo(p2.) };);
		 
		 for(Pokeman p : myPokeman) {
				System.out.println(p);
			}
		 System.out.println("-----------------");
		 
		 
		 //NOTE: Maps are not part of the collections API, Map is a data structure
		 Map<String, Pokeman> mapPokemanTrainers = new TreeMap<>();
		 
		 //mapPokemanTrainers.put("Alex", new Pokeman(1, "Bulbasaur", "Grass"));
		 mapPokemanTrainers.put("Alex", myPokeman.get(0));
		 mapPokemanTrainers.put("Brittany", new Pokeman(132, "Ditto", "Normal"));
		 mapPokemanTrainers.put("Nancy", new Pokeman(7, "Squiretle", "Water"));
		 mapPokemanTrainers.put("Elizabeth", new Pokeman(82, "Magneton", "Electric"));
		 mapPokemanTrainers.put("Sheri", new Pokeman(151, "Mew", "Psychic"));
		 mapPokemanTrainers.put("Nicole", new Pokeman(133, "Evee", "Normal"));
		 
		 Iterator iterator = mapPokemanTrainers.entrySet().iterator();
		 // hasNext returs true if there is a further values to iterate over
		 while(iterator.hasNext()) {
			 
			 // for Map.Entry<T>
			 //IMPORT:   import java.util.Map.Entry;
			 Map.Entry<String, Pokeman> pair = (Entry<String, Pokeman>) iterator.next();
			 System.out.println(pair.getKey() + " => " + pair.getValue());
		 }
		 System.out.println("trainors --- " + mapPokemanTrainers);
		 System.out.println("trainers keySet() --- " + mapPokemanTrainers.keySet());
		 System.out.println("trainors values() ---" + mapPokemanTrainers.values());
		 
		 
		 System.out.println("-----------------");
		 
		 
		 
	}

}
