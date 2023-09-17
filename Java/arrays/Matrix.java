package arrays;

import java.util.Scanner;

public class Matrix {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Quando alunos tem na turma?: ");
		int qtdAlunos = entrada.nextInt();
		System.out.print("Quando notas por aluno?: ");
		int qtdNotas = entrada.nextInt();
		
		double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];
		
		double total = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {	
			for (int n = 0; n < notasDaTurma.length; n++) {
				System.out.printf("Escreva a nota número %d do aluno número %d : "
						, (n + 1) ,( a +1) );
				notasDaTurma[a][n] = entrada.nextDouble();
				total += notasDaTurma[a][n];
			}
			
		}
		double media = total/(qtdAlunos * qtdNotas);
		System.out.println("A média é igual a: " + media);
		entrada.close();
	}

}
