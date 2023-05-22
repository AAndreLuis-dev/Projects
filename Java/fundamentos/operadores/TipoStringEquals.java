package fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println(s.equals("2"));
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite aqui:");
		String s2 = entrada.nextLine();
		System.out.println("2" == s2.trim());
		System.out.println(s2.trim().equals("2"));
		
		entrada.close();
		
	}
	
}
