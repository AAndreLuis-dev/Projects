package fundamentos;

//import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {

//		Scanner entrada = new Scanner(System.in);

		// byte
		Byte b = 100;
		Byte b2 = 90;
		Short s = 1000;
		// System.out.print("Digite um número:");

		// Integer i = Integer.parseInt(entrada.nextLine());

		Integer i = 10000; // int
		Long l = 1000000L;

		System.out.println(l.byteValue());
		System.out.println(b.compareTo(b2));
		System.out.println(i + 1);
		System.out.println(s.floatValue());
		// entrada.close();
		
		Float f = 123.3F;
		Double d = 21301.123;
		
		System.out.printf("\nValor float: %f"
				+ "\nValor Double: %f", f, d );
		System.out.println("");
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		
		Character c = '#';
		System.out.println(c.hashCode());

	}

}
