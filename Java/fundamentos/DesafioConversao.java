package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu salário: ");
		String salario1 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite seu salário: ");
		String salario2 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite seu salário: ");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		System.out.printf("Salário 1: %s "
				+ "\nSalário 2: %s "
				+ "\nSalário 3: %s", salario1 , salario2 , salario3);
		
		Double valor1 = Double.parseDouble(salario1);
		Double valor2 = Double.parseDouble(salario2);
		Double valor3 = Double.parseDouble(salario2);
		
		Double soma = valor1+valor2+valor3;
		Double media = (valor1 + valor2 + valor3)/3;
		
		System.out.printf("\nMedia: %f "
				+ "Soma: %f" , media ,soma);
		
		
		
		
		entrada.close();
		
		
	}

}
