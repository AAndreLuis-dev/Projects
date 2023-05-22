package fundamentos;

import java.util.Scanner;

public class ConvertStringToNumber {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		String valor1 = entrada.nextLine();
		
		System.out.print("\nDigite um número: ");
		String valor2 = entrada.nextLine();
		
		System.out.print( valor1 + valor2);
		
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);

		double soma = num1 + num2;
		double media = (num1 + num2)/2;
		
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + media);
		
		entrada.close();
		
	}

}
