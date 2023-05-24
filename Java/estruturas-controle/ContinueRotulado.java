package controle;

public class ContinueRotulado {

	public static void main(String[] args) {

		externo: for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				if (i == 2)
					continue externo;
				System.out.printf("\n%d %d", i, j);
			}
			System.out.println();

		}
		System.out.println("FIM");
	}

}
