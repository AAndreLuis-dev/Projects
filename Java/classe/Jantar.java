package classe;

import java.util.Scanner;

public class Jantar {
	
	public static void  main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		Pessoa pessoaInfo =  new Pessoa();
		Comida comidaInfo =  new Comida();
		
		System.out.println("Olá, bem-vindo ao restaurante!");
		System.out.print("Qual o seu nome? ");
		pessoaInfo.nomePessoa = entrada.nextLine();
		System.out.print("Qual o seu peso? ");
		pessoaInfo.pesoPessoa = entrada.nextDouble();
		
		System.out.println("O que você irá comer?");
		comidaInfo.nomeComida = entrada.next();
		System.out.println("Qual o peso da comida?");
		comidaInfo.pesoComida = entrada.nextDouble();
		
		System.out.printf("\nO Seu nome: %s ", pessoaInfo.nomePessoa);
		System.out.printf("\nSeu peso era: %.3f", pessoaInfo.pesoPessoa);
		System.out.print("\nSeu peso agora é: " + pessoaInfo.pesoFinal(comidaInfo.pesoComida));
		
		entrada.close();
		
	}

}
