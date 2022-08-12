package persona;

import java.util.HashMap;
import java.util.Map;

public class PersonRegistry {
	
	private static PersonRegistry instance;
	private Map<String, Persona> people;

	private PersonRegistry() {
		this.people = new HashMap<>();
	}
	
	public static PersonRegistry instance() {
		if(instance == null) {
			instance = new PersonRegistry();
		}
		return instance;
	}
	
	public void register(String name, Persona persona) {
		people.put(name, persona);
	}
	
	public Persona lookup(String line) {
		return people.get(line);
	}
	
	public Map<String, Persona> getPeople(){
		return people;
	}
}
