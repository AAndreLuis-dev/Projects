package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[]args) {
		
		String palavra = "a";
		
		while(!palavra.equalsIgnoreCase("cancelar")) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite alguma coisa: ");
			String digitou = entrada.next();
			System.out.printf("Você digitou: %s \n", digitou);
			palavra = digitou ;
			entrada.close();
		}
		
	}

}
