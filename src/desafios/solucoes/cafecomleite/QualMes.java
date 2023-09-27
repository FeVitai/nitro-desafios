package desafios.solucoes.cafecomleite;

import java.util.Scanner;

/*Leia um valor inteiro entre 1 e 12 e imprima o mês correspondente em português.

Entrada
A entrada contém um único valor inteiro.

Saída
Imprima por extenso o nome do mês correspondente ao número existente na entrada, com a primeira letra em maiúscula.*/

//Exemplo
//Entrada
//4
//
//Saída
//Abril
//
//Entrada
//12
//
//Saída
//Dezembro

public class QualMes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int mes = sc.nextInt();

		switch (mes) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembro");
			break;
		default:
			break;
		}
		sc.close();
	}
}
