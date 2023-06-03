package classe;

public class Produto {

	String nomeProduto;
	double preco;
	double desconto;
	
	Produto(){
		
	}
	
	Produto(String nomeInicial, double precoInicial, double descontoInicial){
		nomeProduto = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente){
		return preco * (desconto - precoComDesconto() + descontoDoGerente);
	}
	
}
