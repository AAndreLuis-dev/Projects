package classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b =  a;
		
		a++;
		b--; // atribuição por valor(tipo primitivo)
		
		System.out.println(a +"" + b);
		
		Data d1 = new Data(1, 06, 1923);
		Data d2 = d1;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		d2.dia = 19;
		d2.mes = 10;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		d1.ano = 2032;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDiaPadrao(d1);
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		int c = 10;
		voltarInteiroPadrao(c);
		System.out.println(c);
		
	}
	
	static void voltarDiaPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void voltarInteiroPadrao(int c) {
		c++;
	}

}
