package controle;

import java.util.Scanner;

public class ExercicioEstruturaDeControle {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

//		// 1° Desafio: Criar um programa que receba um número
//		// e verifique se ele está entre 0 e 10 e é par;
//
//		System.out.print("Digite um número[0-10] par: ");
//		int numero = entrada.nextInt();
//
//		if (numero >= 0 && numero <= 10 && numero % 2 == 0) {
//			System.out.println("Esté número está entre 0-10 e é par!: " + numero);
//		} else if (numero >= 0 && numero <= 10 && numero % 2 == 1) {
//			System.out.println("Esté número está entre 0-10 e é impar!: " + numero);
//		} else {
//			System.out.println("Número inválido fora da range.");
//		}
//
//		// 2. Criar um programa informa se o ano atual é um ano bissexto;
//
//		System.out.println("Digite o ano: ");
//		int ano = entrada.nextInt();
//
//		if (ano % 4 == 0) {
//			System.out.println("O ano é bissexto!");
//		} else {
//			System.out.println("O ano não é bissexto.");
//		}
//
//		/*
//		 * 3. Criar um programa que receba duas notas parciais, calcular a média final.
//		 * Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", se
//		 * a nota for menor que 7.0 e maior do que 4.0 imprime no console
//		 * "Recuperação", caso contrário imprime no console "Reprovado".
//		 */
//
//		System.out.println("Digite a nota do aluno.");
//		double nota1 = entrada.nextDouble();
//		System.out.println("Digite a nota 2 do aluno.");
//		double nota2 = entrada.nextDouble();
//
//		double media = (nota1 + nota2) / 2;
//
//		if (media >= 7) {
//			System.out.println("Aprovado");
//		} else if (media <= 6.9 && media >= 4) {
//			System.out.println("Recuperação;");
//		} else {
//			System.out.println("Reprovado!");
//		}

		// 4. Criar um programa que receba um número e diga se ele é um número primo.
//
//		int contadorDivisor = 0;
//
//		System.out.println("Digite o número:");
//		int numeroprimo = entrada.nextInt();
//
//		for (int i = 2; i < numeroprimo; i++) {
//			if (numeroprimo % i == 0) {
//				contadorDivisor++;
//			}
//		}
//		if (contadorDivisor == 0) {
//			System.out.println("Seu número " + numeroprimo + " é primo.");
//		} else {
//			System.out.println("Seu número " + numeroprimo + " não é primo.");
//		}

		// 5. Refatorar o exercício 04, utilizando a estrutura switch.

//		int contadorDivisor2 = 0;
//		contadorDivisor2++;
//		System.out.println("Digite o número:");
//		int numeroprimo2 = entrada.nextInt();
//
//		for (int i = 2; i < numeroprimo2; i++) {
//			if (numeroprimo2 % i == 0) {
//				contadorDivisor2++;
//			}
//		}
//		
//		switch(contadorDivisor) {
//		case 0:
//			System.out.println("Seu número " + numeroprimo2 + " é primo.");
//			break;
//		default:
//			System.out.println("Seu número " + numeroprimo2 + " não é primo.");
//		}
		
		/*6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
		 *  Armazene um numero aleatório em uma variável. O Jogador tem 10
		 *   tentativas para adivinhar o número gerado. Ao final de cada 
		 *   tentativa, imprima a quantidade de tentativas restantes, e imprima
		 *    se o número inserido é maior ou menor do que o número armazenado.
		 */
		int vidas = 0;
		int numerojogo = 50;
		int numeroAdvinhado = 0;
		
		System.out.println("#########JOGO DE ADIVINHAÇÃO#########");
		
		while (vidas != 10 && numerojogo != numeroAdvinhado) {
			System.out.print("Digite o número advinhado!: ");
			numeroAdvinhado = entrada.nextInt();
			
			if(numeroAdvinhado == numerojogo) {
				System.out.println("PARABÉNS!! Você acertou! "
						+ "\nO número era: " + numerojogo);
				
			}else {
				vidas++;
				System.out.println("Você Errou!");
				System.out.printf("\nVocê gastou %d tentativas de 10!", vidas);
				if (numeroAdvinhado > numerojogo) {
					System.out.println("O número que você advinhou é maior do que"
							+ " o número secreto!");
				}else {
					System.out.println("\nO número que você advinhou é menor do que"
							+ " o número secreto!");
				}
			}
			
		}
		

		entrada.close();
	}

}
