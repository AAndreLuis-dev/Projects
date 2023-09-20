package classe;

public class Equals {
	
	public static void main(String[] args) {
		
		Usuario us = new Usuario();
		us.nome = "Pedro";
		us.email = "pedrinho@gmail.com";

		Usuario us2 = new Usuario();
		us2.nome = "Pedro";
		us2.email = "pedrinho@gmail.com";
		
		System.out.println(us == us2);
		System.out.println(us.equals(us2));
		
	}

}
