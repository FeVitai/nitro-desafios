package desafios.solucoes;

import java.util.Scanner;

public class MultiploDeSete {

	/*
	 * Múltiplo de 7 Mostrar detalhes Chegou a hora de testar seus dotes de
	 * programação, escreva um algoritmo que identifique múltiplos de 7.
	 * 
	 * Entrada Como entrada terá um inteiro N onde N < 1000
	 * 
	 * Saída Informe se é múltiplo de 7
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n < 1000) {
			if (n % 7 == 0) {
				System.out.println("É MULTIPLO DE 7");
			} else {
				System.out.println("ESSE NÃO É");
			}
		}

		sc.close();
	}
}
