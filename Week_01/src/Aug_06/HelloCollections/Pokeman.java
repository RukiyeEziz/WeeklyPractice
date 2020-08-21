package Aug_06.HelloCollections;

public class Pokeman implements Comparable<Pokeman>{
	public int number;
	public String name;
	public String type;


	public Pokeman(int number, String name, String type) {
		super();
		this.number = number;
		this.name = name;
		this.type = type;
	}



	@Override
	public String toString() {
		return "Pokeman [number=" + number + ", name=" + name + ", type=" + type + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + number;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokeman other = (Pokeman) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}



	@Override
	public int compareTo(Pokeman p) {
		// TODO Auto-generated method stub
		int i = this.name.compareTo(p.name);
		
		System.out.println("The Comparable compareTo " + i);
		
		return i;
		
	}
	
	

}
