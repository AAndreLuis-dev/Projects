package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		System.out.println("---------Calculadora!---------");
		System.out.println("Por favor, digite o primeiro número!");
		
		Scanner entrada = new Scanner(System.in);
		
		double num1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo número!");
		double num2 = entrada.nextDouble();
		
		System.out.println("Que operação gostaria de fazer? (+ - / %)");
		String operacao = entrada.next();
		
		double soma = num1 + num2;
		double subtracao = num1 - num2;
		double divisao = num1 / num2;
		double porcent = num1%num2; 
		
		double resultadoParcial =  "+".equals(operacao) ? soma : 0;
		double resultadoParcial2 = "-".equals(operacao) ? subtracao : resultadoParcial;
		double resultadoParcial3 = "/".equals(operacao) ? divisao : resultadoParcial;
		double resultadoParcial4 = "%".equals(operacao) ? porcent : resultadoParcial;
		
		System.out.printf("O resultado é: %.2f ", resultadoParcial4);
		System.out.printf("O resultado é: %.2f ", resultadoParcial2);
		System.out.printf("O resultado é: %.2f ", resultadoParcial3);
		
		
		
		
		entrada.close();
	}
	
}
