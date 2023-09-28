package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
		SortedSet<String> candidatosAprovados = new TreeSet<>();
		candidatosAprovados.add("Jose");
		candidatosAprovados.add("Carlos");
		candidatosAprovados.add("Maria");
		candidatosAprovados.add("Joao");
		candidatosAprovados.add("Ana");
		
		
		
		for(String aprovados: candidatosAprovados) {
			System.out.println(aprovados);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(3);
		nums.add(450);
		nums.add(360);
		nums.add(0);
		
		for(Integer numeros: nums) {
			System.out.println(numeros);
		}
		
	}

}
