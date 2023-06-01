package classe;

import java.util.Scanner;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data data = new Data();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o dia: ");
		data.dia = entrada.nextInt();
		System.out.println("Digite o mes: ");
		data.mes = entrada.nextInt();
		System.out.println("Digite o ano: ");
		data.ano = entrada.nextInt();
		
		System.out.printf("\nO dia é: %d , o mês é: %d , o ano é: %d .", data.dia, data.mes, data.ano);
		
		entrada.close();
		
		Data data2 = new Data();
		
		data2.dia = 14;
		data2.mes = 2;
		data2.ano = 1823;
		System.out.printf("\nO dia é: %d , o mês é: %d , o ano é: %d .", data2.dia, data2.mes, data2.ano);
		
	}

}
