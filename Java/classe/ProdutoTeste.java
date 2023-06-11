package classe;

public class ProdutoTeste {
	
	public static void main(String[]args) {
		
		Produto p1 = new Produto("Notebook", 4200.87);

		
		var p2 = new Produto();
		p2.nomeProduto = "Celular";
		p2.preco = 1800.23;
		
		System.out.println(p1.nomeProduto);
		System.out.println(p2.nomeProduto);		
		
		System.out.println(Produto.desconto);
		double precoFinal = p1.preco * (1 - Produto.desconto);
		double precoFinal2 = p2.preco * (1 - Produto.desconto);
		
		System.out.println("Preço final 1: " + precoFinal);
		System.out.println("Preço final 2: " + precoFinal2);
		
	}

}
