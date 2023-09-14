package classe;

public class Pessoa {
	
	 String nomePessoa;
	double pesoPessoa;
	
	
	Pessoa(){
		this("", 0);
	}
	
	Pessoa(String nome, double peso ){
		nomePessoa = nome;
		pesoPessoa = peso;
		
	}
	
	String pesoFinal(double pesoComida) {
		double pesoF = pesoComida + pesoPessoa;
		return String.format("%.3f", pesoF);
	}


}
