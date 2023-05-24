package controle;

import java.util.Scanner;

public class ExercicioEstruturaDeControle {

	public static void main(String[] args) {
		
		// 1° Desafio: Criar um programa que receba um número 
		//e verifique se ele está entre 0 e 10 e é par;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número[0-10] par: ");
		int numero = entrada.nextInt();
		
		if(numero >= 0 && numero <= 10 && numero % 2 == 0) {
			System.out.println("Esté número está entre 0-10 e é par!: " + numero);
		} else if (numero >= 0 && numero <= 10 && numero % 2 == 1) {
			System.out.println("Esté número está entre 0-10 e é impar!: " + numero);
		}else {
			System.out.println("Número inválido fora da range.");
		}
		
		// 2. Criar um programa informa se o ano atual é um ano bissexto;
		
		System.out.println("Digite o ano: ");
		int ano = entrada.nextInt();
		
		if(ano % 4 == 0) {
			System.out.println("O ano é bissexto!");
		}else {
			System.out.println("O ano não é bissexto.");
		}
		
		/* 3. Criar um programa que receba duas notas parciais, calcular a média 
		 * final. Se a nota do aluno for maior ou igual a 7.0 imprime no console
		 * "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no
		 * console "Recuperação", caso contrário imprime no console "Reprovado".   
		 */
		
		System.out.println("Digite a nota do aluno.");
		double nota1 = entrada.nextDouble();
		System.out.println("Digite a nota 2 do aluno.");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		if(media >= 7) {
			System.out.println("Aprovado");
		} else if(media <= 6.9 && media >= 4) {
			System.out.println("Recuperação;");
		}else {
			System.out.println("Reprovado!");
		}
		
		// 4. Criar um programa que receba um número e diga se ele é um número primo.
		
		System.out.println("Digite o número:");
		int numeroprimo = entrada.nextInt();
		if(numeroprimo % numeroprimo == 0) {
			System.out.println("É número primo.");
		}else {
			System.out.println("Não é número primo.");
		}
		
		//5. Refatorar o exercício 04, utilizando a estrutura switch.
		
		System.out.println("Digite o número!");
		int numeroprimo2 = entrada.nextInt();
		int calculoprimo = numeroprimo2 % numeroprimo2;
		switch(calculoprimo) {
		case 0:
			System.out.println("Número primo.");
			break;
		case 1: 
			System.out.println("Não é primo!");
		}
		
		


		
		
		entrada.close();
	}

}
