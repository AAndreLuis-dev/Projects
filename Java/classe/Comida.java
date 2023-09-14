package classe;

public class Comida {
	
	String nomeComida;
	double pesoComida;
	
	Comida(){
		this("", 0);
	}
	
	Comida(String nome, double peso ){
		this.nomeComida = nome;
		this.pesoComida = peso;
		
	}

}
