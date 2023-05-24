package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua média!");
		double media = entrada.nextDouble();
		
		if (media <= 10 && media >= 7) {
			System.out.println("Você foi aprovado!");
			System.out.println("Parabéns!");
			
		}
		else if (media >=4) {
			System.out.println("Recuperação!");
		}
		
		else {
			System.out.println("Reprovado!");
		}
		
		entrada.close();
		
	}
	
}
