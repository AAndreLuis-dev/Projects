package arrays;

import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas notas você deseja colocar?");
		int quantidadeNota = entrada.nextInt();
		
		double[] notas = new double[quantidadeNota];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite, agora, qual sua %d ° nota. ", i);
			notas[i] = entrada.nextDouble(); 
			
		}
		
		double resultado = 0;
		
		for(double nota: notas) {
			resultado += nota;
		}
		
		System.out.println("Sua média é: " + resultado/notas.length);
		
		entrada.close();
		
	}

}
