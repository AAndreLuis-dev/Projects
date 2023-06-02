package classe;

public class ProdutoTeste {
	
	public static void main(String[]args) {
		
		Produto p1 = new Produto();
		p1.nomeProduto = "Notebook";
		p1.preco = 4200.87;
		p1.desconto = 0.37;
		
		var p2 = new Produto();
		p2.nomeProduto = "Celular";
		p2.preco = 1800.23;
		p2.desconto = 0.32;
		
		System.out.println(p1.nomeProduto);
		System.out.println(p2.nomeProduto);		
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		
		System.out.println("Preço final 1: " + precoFinal1);
		System.out.println("Preço final 2: " + precoFinal2);
		
	}

}
