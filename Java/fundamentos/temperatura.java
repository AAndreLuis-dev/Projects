package fundamentos;

public class temperatura {

	public static void main(String[] args) {
		// (F° -32) * 5/9 = C°
		
		//Variaveis para o calculo.
		double tempF = 86;
		final double ajuste = 32;
		final double divisor = 5.0/9.0;
		double celsius = (tempF - ajuste)* divisor;
		
		System.out.println("Temperatura em F = " + tempF + ". E em celsius é: " + celsius);
	}
	
}
