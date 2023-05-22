package fundamentos;


public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações de funcionário
		
		//Tipos numéricos inteiros.
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id= 52340;
		long pontosAcumulados = 3_423_294_000L;
		
		//pontos flutuantes
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_942_324_721.02;
		
		//tipo booleano
		
		boolean estaDeFerias = false; //true
		//tipo caractere
		char status = 'A'; //ativo
		
		//Calculos
		System.out.println("O funcionário está na empresa há: " + anosDeEmpresa * 364);
		
		//Numeros de viagens
		System.out.println("Número de viagens: " + numerosDeVoos/2);
		
		//pontos por real
		System.out.println("Pontos por real: " + pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id + "Recebe: " + salario);
		
		if (estaDeFerias == false) {
			System.out.println("Não está de férias");
			System.out.println("Status: " + status);
		}else {
			System.out.println("Está de férias");
		}
		
		
	}
	
}
