package classe;

public class Produto {

	String nomeProduto;
	double preco;
	double desconto;
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
}
