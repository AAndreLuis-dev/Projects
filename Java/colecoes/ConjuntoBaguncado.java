package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		conjunto.add(1.3);
		conjunto.add("olá");
		conjunto.add(true);
		conjunto.add(1);
		
		System.out.println(conjunto.size());
		
		conjunto.add("Teste");
		conjunto.add(1);
		System.out.println(conjunto.size());

		System.out.println(conjunto.remove("olá"));
		System.out.println(conjunto.remove(1));
		
		System.out.println(conjunto.size());
		
		System.out.println(conjunto.contains(1));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		System.out.println(nums);
		System.out.println(conjunto);
		
		System.out.println(conjunto.addAll(nums));
		System.out.println(nums);
		
		
	}

}
