package m2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MilestoneUnoFaseCuatro {

	public static void main(String[] args) {
		
		List<Character> nombre = new ArrayList<Character>(Arrays.asList('A','N','N','A',' '));
		List<Character> apellidos = new ArrayList<Character>(Arrays.asList('P','A','L','A','C','I','O'));
		
		List<Character> nombreCompleto = Stream.concat(nombre.stream(), apellidos.stream()).collect(Collectors.toList());
		
		System.out.println(nombreCompleto);

	}
}
