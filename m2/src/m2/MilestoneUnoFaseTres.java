package m2;

import java.util.HashMap;
import java.util.Map;

public class MilestoneUnoFaseTres {

	public static void main(String[] args) {
		
		Map<Character, Integer> nombre = new HashMap<Character, Integer>();
		
		nombre.put('A', 2);
		nombre.put('N', 2);
		nombre.put('N', 2);
		nombre.put('A', 2);
		
		for (char i : nombre.keySet()) {
		      System.out.println("Letra: " + i + ". Veces que aparece: " + nombre.get(i));
		    }
		
	}
}
