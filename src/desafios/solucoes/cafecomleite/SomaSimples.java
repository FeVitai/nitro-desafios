package desafios.solucoes.cafecomleite;

import java.util.Scanner;

public class SomaSimples {

	/*
	 * Soma simples Mostrar detalhes Escreva um programa que lê dois números
	 * inteiros e imprime a soma dos números.
	 * 
	 * Entrada A primeira e única linha de entrada contém dois números do tipo
	 * inteiro N e M .
	 * 
	 * Saída Seu programa deve gerar como saída uma única linha contendo o resultado
	 * da soma dos números fornecidos.
	 */

//	Exemplos
//	Entrada
//	5 2
//	  
//	Saída
//	7
//	  
//	Entrada
//	100 3
//	  
//	Saída
//	103
//	  
//	Entrada
//	2020 2
	  
//Saída
//2022
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		System.out.println(n1 + n2);
		
		sc.close();
		
	}
}
