package arrays;

import java.util.Arrays;

public class Exercicios {
	
	public static void main(String []Args) {
		
		double[] notasAlunoA = new double[4];
		notasAlunoA[0] = 9;
		notasAlunoA[1] = 7;
		notasAlunoA[2] = 3.8;
		notasAlunoA[2] = 7.8;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double total = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		
		System.out.println(total);
		System.out.println(total/notasAlunoA.length);
		
		
	}

}
