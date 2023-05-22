package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 8.77;
		String resultadoParcial = media >= 5 ? "Recuperação" : "reprovado";
		String resultadoFinal = media >= 7 ? "Aprovado" : resultadoParcial;
		
		System.out.println(resultadoFinal);
		
		
	}
	
}
