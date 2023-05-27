package classe;

public class ProdutoTeste {
	
	public static void main(String[]args) {
		
		Produto p1 = new Produto();
		p1.nomeProduto = "Notebook";
		p1.preco = 4200.87;
		p1.descconto = 0.37;
		
		var p2 = new Produto();
		p2.nomeProduto = "Celular";
		p2.preco = 1800.23;
		p1.descconto = 0.32;
		
		System.out.println(p1.nomeProduto);
		System.out.println(p2.nomeProduto);		
	}

}
