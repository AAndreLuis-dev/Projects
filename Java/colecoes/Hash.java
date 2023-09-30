package colecoes;

import java.util.HashSet;

public class Hash {
	
	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Carlos"));
		usuarios.add(new Usuario("Maria"));
		usuarios.add(new Usuario("Joao"));
		usuarios.add(new Usuario("Mateus"));
		usuarios.add(new Usuario("izadora"));
		
		boolean resultado = usuarios.contains(new Usuario("Carlos"));
		System.out.println(resultado);
		
	}

}
