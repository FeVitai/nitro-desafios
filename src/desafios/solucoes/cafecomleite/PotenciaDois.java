package desafios.solucoes.cafecomleite;

import java.util.Scanner;

public class PotenciaDois {

//	 Potência de dois
//	 Mostrar detalhes
//	João quer saber qual é o n-ésimo valor para potência de dois. Ajude ele nesta tarefa.
//
//	Tarefa
//	Escreva um programa que dada a entrada exiba o n-ésimo valor para potência de dois. (utilize laço de repetição)
//
//	Entrada
//	Irá receber um inteiro N onde (2 ≤ N ≤ 30).
//
//	Saída
//	Seu programa deve imprimir uma única linha, contendo o valor dá n-ésima potência.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int result = 1;

		for (int i = 1; i <= n; i++) 
		{
			result *= 2;
		}

		System.out.println(result);

		sc.close();
	}
}
