package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[]args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		String palavrinha = "";
		
		do {
			System.out.println("Você quer sair?");
			System.out.println("Diga as palavrinhas mágicas!");
			palavrinha = entrada.next();
		} while (!palavrinha.equalsIgnoreCase("Porfavor"));
		
		entrada.close();
	}
	
}
