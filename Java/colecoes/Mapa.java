package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Roberto");
		usuarios.put(3, "Filo");
		usuarios.put(4, "Carol");
		usuarios.put(5, "Iraldo");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(3));
		System.out.println(usuarios.containsValue("Carol"));
		
		System.out.println(usuarios.get(2));
		
		for (Integer usuario : usuarios.keySet()) {
			System.out.println(usuario);
		}
		for (String usuario : usuarios.values()) {
			System.out.println(usuario);
		}
		
		for(Entry<Integer, String> usuario: usuarios.entrySet()) {
			System.out.println(usuario);
		}
		
	}

}
