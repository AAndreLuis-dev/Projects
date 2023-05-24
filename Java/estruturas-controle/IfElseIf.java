package controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma nota!");
		double nota = entrada.nextDouble();
		
		entrada.close();
		
		if (nota > 10 || nota < 0) {
			System.out.println("Nota Inválida!");
		} else if (nota >= 8) {
			System.out.println("Você tirou nota A!");
			
		}else if (nota <= 7.9 && nota >= 6 ) {
			
			System.out.println("Você tirou nota B!");
			
		}else if (nota <= 5.9 && nota >= 3) {
			
			System.out.println("VOcê tirou nota C!");
			
		}else {
			System.out.println("Você tirou nota F!");
		}
		
	}
	
}
