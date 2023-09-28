package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario user = new Usuario("Camila");
		lista.add(user);
		
		lista.add(new Usuario("james"));
		lista.add(new Usuario("carlos"));
		lista.add(new Usuario("bragante"));
		lista.add(new Usuario("ilo"));
		
		for(Usuario nomes: lista) {
			System.out.println(nomes.nome);
		}
		
		
	}

}
