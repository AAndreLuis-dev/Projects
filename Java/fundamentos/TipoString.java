package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Hello, world!".charAt(4));
		
		//String é imutavel
		String s = "Boa tarde";
		System.out.println(s);
		System.out.println(s.concat("!!!!"));
		System.out.println(s + "!!!!!");
		System.out.println(s.startsWith("BOA"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "joao";
		var sobrenome = "rodrigues";
		var idade = 20;
		var salario = 12340.40;
		
		System.out.println("Nome: " + nome + "\nSobrenome" + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n");
		System.out.printf("O senhor: %s %s tem %d anos e recebe %.2f", nome, sobrenome , idade, salario );
		
		String frase = String.format("\nO senhor: %s %s tem %d anos e recebe %.2f", nome, sobrenome , idade, salario );
		System.out.println(frase);
		
	}

}
