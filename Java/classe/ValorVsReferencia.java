package classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b =  a;
		
		a++;
		b--; // atribuição por valor(tipo primitivo)
		
		System.out.println(a +"" + b);
		
	}

}
