package classe;

public class Produto {

	String nomeProduto;
	double preco;
	static double desconto = 0.25;
	
	Produto(){
		
	}
	
	Produto(String nomeInicial, double precoInicial){
		nomeProduto = nomeInicial;
		preco = precoInicial;
	}
	
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente){
		return preco * (desconto - precoComDesconto() + descontoDoGerente);
	}
	
}
