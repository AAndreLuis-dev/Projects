package fundamentos.operadores;

public class DesafioAritimetico {

	public static void main(String[] args) {
		
		var primeiraFracao = (3+2)*6;
		var primeiraFracaoDiv = 3*2;
		var formatPrimeiraF = (float) Math.pow(primeiraFracao, 2)/primeiraFracaoDiv;
		
		System.out.println(formatPrimeiraF);
		
		var segundaFracao =  (1-5)*(2-7)/2;
		var segundaFracaoFormat = (float) Math.pow(segundaFracao, 2);
		System.out.println(segundaFracaoFormat);
		
		var dividendoFinal = formatPrimeiraF - segundaFracaoFormat;
		int divisor = (int) Math.pow(10, 3);
		var dividendoFinalResult = (float) Math.pow(dividendoFinal, 3)/divisor;
		
		System.out.println(dividendoFinalResult);
	}
	
}
