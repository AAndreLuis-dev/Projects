package fundamentos.operadores;

public class Unario {

	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a + 1  Pós fixada, tem menos pressa na hora de executar
		b++; //b + 1
		
		--a; //a - 1 Prefixada tem mais pressa na hora de executar
		--b; //b - 1
		
		System.out.println(++a == b--);
		System.out.println(a == b);
		
		
	}
	
}
