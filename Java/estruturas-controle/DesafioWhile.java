package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[]args) {
		
		double saida = 0;
		double total = 0;
		double numeroDeNotas = 0;
		double numeroDeErros = 0;
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Digite uma nota válida[0-10] dos alunos!");
			double nota = entrada.nextDouble();
			if (nota != -1) {
				if (nota >= 0 && nota <= 10) {
					total = total + nota;
					numeroDeNotas++;
					
				}else {
					numeroDeErros++;
					System.out.println("Digite uma nota válida por favor!");
				}
			}
			saida = nota;
		} while(saida != -1);
		double media = total/numeroDeNotas;
		System.out.printf("A nota total é de: %.2f . \n"
				+ "O número de notas digitadas é: %.0f \n"
				+ "A média é de: %.1f \n"
				+ "O número de notas inválidas é de: %.0f", total, numeroDeNotas,
				media, numeroDeErros);
		
		entrada.close();
		
	}

}
