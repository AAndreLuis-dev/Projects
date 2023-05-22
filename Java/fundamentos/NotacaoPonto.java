package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		double a = 2.3;
		String s = "Bom dia X";
		
		System.out.println(a);
		
		s = s.toUpperCase();
		System.out.println(s);
		
		System.out.println(s.replace("X", ", Senhora"));
		System.out.println(s.concat("!!!!"));
		
		System.out.println("bom dia, guys".toUpperCase().concat(s));
		
	}
	
}
