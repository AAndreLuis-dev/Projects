package fundamentos;

public class ConversaoTiposPrimitivos {
	
	public static void main(String[] args) {
		
		double a = 1;  // conversao implicita
		System.out.println(a);
		
		
		int b = (int) 1.2; //Conversao explicita (CAST)
		System.out.println(b);
		
		int c = 4122;
		byte d = (byte)c;
		
		System.out.println(d);
		
	}

}
