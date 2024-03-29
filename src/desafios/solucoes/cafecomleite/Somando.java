package desafios.solucoes.cafecomleite;

import java.util.Iterator;
import java.util.Scanner;

public class Somando {

	public static void main(String[] args) {
		
//		Entrada
//		A entrada é composta de um único caso de teste. A primeira linha contém um inteiro positivo N. As N linhas seguintes contêm cada uma um inteiro X, representando os N números a serem somados.
//
//
//		Saída
//		Seu programa deve produzir uma única linha na saída, contendo a soma de todos os N inteiros.
//
//
//		Restrições
//		0 ≤ N ≤ 50
//		|X| ≤ 5000
//
//		Exemplo
//		Entrada
//		2
//		2
//		3
//
//		Saída
//		5
//
//		Entrada
//		3
//		1
//		5
//		3
//
//		Saída
//		9
		
		Scanner sc = new Scanner(System.in);
		int n, x, soma = 0;
		
		n = sc.nextInt(); 
		
		for(int i=0; i<n; i++) {
			x = sc.nextInt();
			soma = soma += x;
		}
		
		System.out.println(soma);
		
		sc.close();
	}
}
