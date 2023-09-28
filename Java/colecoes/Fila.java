package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		
//		add e offer adicionam itens na lista. 
//		Offer faz uma tentativa e retorna false se cheio
		fila.add("Bia");
		fila.offer("Clara");
		fila.add("Joao");
		fila.offer("Maria");
		fila.add("jhon");
		fila.offer("Rafa");
		
//		Peek e element obtem o próximo elemento da fila sem remover
//		O peek retorna null e element um erro.
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
//		fila.clear();
//		fila.close();
//		fila.isEmpty();
//		fila.pull(); apaga e mostra.
//		fila.remove(); apaga, mostra e cria um erro.
//		fila.contains(...)
		
		
	}

}
