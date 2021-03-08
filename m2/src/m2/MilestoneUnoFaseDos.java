package m2;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MilestoneUnoFaseDos {

	public static void main(String[] args) {
		
		List<Character> nombre = new ArrayList<Character>(Arrays.asList('A','N','N','A'));		
		
		//System.out.println(nombre);
		for (char i:nombre){
			if(i == 'A' || i == 'E' || i == 'I'|| i == 'O' || i == 'U') {
				System.out.println("VOCAL");
			} else if (i != 'A' || i != 'E' || i != 'I'|| i != 'O' || i != 'U') {
				System.out.println("CONSONANTE");
			} else {
				System.out.println("Los nombres de personas no contienen números!");
			}
		}	

	}
}
