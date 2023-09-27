package desafios.solucoes.cafecomleite;

import java.util.Scanner;

public class AMelhorCalculadora {

	/*
	 * Jorge e Tiago resolveram por em prática suas habilidades em programação para
	 * ajudar a tia Ana em sua cantina. Durante um dia de expediente tia Ana precisa
	 * fazer várias operações matemáticas, Jorge e Tiago desejam acelerar este
	 * processo criando uma calculadora simples. Infelizmente eles ainda não
	 * conseguiram, você pode dar uma forcinha?
	 * 
	 * Tarefa Escreva um programa que, dada a operação e os valores, retorne o
	 * resultado.
	 * 
	 * Entrada A entrada consiste de um carácter C que pode ser '+', '-', '/' ou
	 * '*', representando adição, subtração, divisão e multiplicação
	 * respectivamente, e os números A e B para serem calculados.
	 * 
	 * Caso a operação seja '/' utilize precisão de 1 dígito, e você pode assumir
	 * que B sempre será diferente de 0.
	 * 
	 * Saída Seu programa deve imprimir uma única linha, contendo o resultado da
	 * operação.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char operation = sc.next().charAt(0);
		float a = sc.nextFloat();
		float b = sc.nextFloat();

		if (operation == '+') {
			System.out.printf("%.0f", a + b);
		} else if (operation == '/') {
			System.out.printf("%.1f", a / b);
		} else if (operation == '-') {
			System.out.println(a - b);
		} else if (operation == '*') {
			System.out.printf("%.0f", a * b);
		}

		sc.close();
	}

}
