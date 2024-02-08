package desafios.solucoes.cafecomleite;

import java.util.Scanner;

public class InverterSequencia {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		int[] vetor = new int[n];

		for (int i = 0; i < n; i++) {
			vetor[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < n / 2; i++) {
			swap(vetor, i, n - i -1);
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		System.out.println();
		
		scanner.close();
	}

	private static void swap(int[] vetor, int i, int j) {
		int aux = vetor [i];
		vetor [i] = vetor[j];
		vetor[j] = aux;
	}
}
