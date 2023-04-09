package desafios.solucoes;

import java.util.Scanner;

public class Eco {
	
	/*
	 * Eco Mostrar detalhes Eco é a repetição de um som que se dá pela reflexão de
	 * uma onda sonora por uma superfície ou um objeto.
	 * 
	 * Na programação, eco é um programa que emite na saída tudo que recebe na
	 * entrada.
	 * 
	 * Tarefa Escreva um programa que coleta número N como entrada e imediatamente
	 * imprime o mesmo número na saída padrão.
	 * 
	 * Entrada A primeira e única linha de entrada contém um número do tipo inteiro
	 * N.
	 * 
	 * Saída Seu programa deve gerar como saída o mesmo número fornecido na entrada,
	 * sem alterações, seguido com a quebra de linha.
	 * 
	 * Entrada	Saída
		5	5
		1	1
		9	9
	 */

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(n);
		
		sc.close();
	}
	
}
