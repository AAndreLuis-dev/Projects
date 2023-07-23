package classe;

//import java.util.Scanner;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data data = new Data();
//		Scanner entrada = new Scanner(System.in);
		
//		System.out.println("Digite o dia: ");
//		data.dia = entrada.nextInt();
//		System.out.println("Digite o mes: ");
//		data.mes = entrada.nextInt();
//		System.out.println("Digite o ano: ");
//		data.ano = entrada.nextInt();
		
		System.out.println(data.obterDataFormatada());
		
//		entrada.close();
		
		Data data2 = new Data(14, 2, 1823);
		
//		data2.dia = 14;
//		data2.mes = 2;
//		data2.ano = 1823;
		System.out.println(data2.obterDataFormatada());
		
	}

}
