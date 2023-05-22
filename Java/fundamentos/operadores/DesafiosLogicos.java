package fundamentos.operadores;

public class DesafiosLogicos {

	public static void main(String[] args) {
		
		boolean trabalhoTerca = false;
		boolean trabalhoQuinta = false;
		
		boolean comprouTv50 = trabalhoTerca && trabalhoQuinta;
		System.out.println("Comrpou tv 50: " + comprouTv50);
		
		boolean comprouTv30 = trabalhoTerca  ^ trabalhoQuinta; 
		System.out.println("Comrpou tv 30\": " + comprouTv30);
		
		boolean comprouSorvete = trabalhoTerca || trabalhoQuinta;
		System.out.println("Comprou sorvete?: " + comprouSorvete);
		
		boolean maisSaudavel = !comprouSorvete;
		System.out.println("Mais saudável?: " + maisSaudavel);
		
	}
	
}
