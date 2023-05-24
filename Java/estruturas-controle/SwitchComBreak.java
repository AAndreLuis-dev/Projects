package controle;

import java.util.Scanner;

public class SwitchComBreak {
	
	public static void main(String[] args) {
		
		String conceito = "";
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a nota: ");
		int nota = entrada.nextInt();
		
		switch(nota) {
		case 10: case 9:
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2: case 1:
			conceito = "E";
			break;
		default:
			System.out.println("Não informado.");
		}
		
		System.out.printf("\nSua nota é: %d . "
				+ "\nSeu conceito é: %s .", nota , conceito);
		
		
		entrada.close();
	}

}
