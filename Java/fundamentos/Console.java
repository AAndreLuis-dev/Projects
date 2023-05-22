package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print("Dia !!");
		
		System.out.println("Bom dia!");
		
		System.out.printf("Megasena: %d %d %d %d", 1 , 2 , 3, 4);
		System.out.printf("\nSalario: %.2f " , 1412323.52132);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\nDigite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu Sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		/*(System.out.println("Seu nome é: " + nome);
		System.out.println("Seu sobrenome é: " + sobrenome);
		*/
		
		System.out.printf("Seu nome é: %s %s", nome, sobrenome);
		
		System.out.print("\nDigite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("\n%s %s tem %d anos %n", nome, sobrenome, idade);
		
		entrada.close();
		
		
		
	}

}
