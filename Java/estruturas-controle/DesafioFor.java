package controle;

public class DesafioFor {
	
	public static void main(String[] args) {
		
		String contador = "#";
		for(int i = 1; i <= 5; i++) {
			System.out.println(contador);
			contador += "#";
		}
		
		//desafio: Fazer o for sem contador númerico.
		
		String valor = "#";
		for(;!valor.equalsIgnoreCase("######");) {
			System.out.println(valor);
			valor += "#";
		}
		
	}

}
