package desafios.solucoes.cafecomleite;

import java.util.Scanner;

public class TorneioDbz {

//	O torneio de artes marciais começou e como sempre as equipes estão sendo formadas. Para evitar confusões como aquelas das últimas temporadas, o novo regulamento do torneio permite apenas que cada equipe composta por 5 membros tenha um KI máximo (soma de todos os KIs dos membros) de 5000. Caso o valor ultrapasse este máximo, a equipe não poderá entrar no torneio.
//
//	Entrada
//	A entrada possui cinco números inteiros N1, N2, N3, N4 e N5 (1 ≤ N1, N2, N3, N4, N5 ≤ 5000), que representa o KI de cada membro da equipe.
//	Saída
//	A saída consiste em imprimir a frase "Acesso proibido", caso a equipe tenha mais de 5000 de KI, ou imprimir a frase "Acesso liberado", em caso contrário.
//	
//	Entrada	Saída
//	300
//	500
//	1000
//	350
//	100
//	  
//	Acesso liberado
//	2000
//	500
//	1800
//	700
//	800
//	Acesso proibido
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3, n4, n5, r;
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		n5 = sc.nextInt();
		
		r = n1 + n2 + n3 + n4 + n5;
		
		if (r <= 5000) {
			System.out.println("Acesso liberado");
		} else {
			System.out.println("Acesso proibido");
		}
		
		sc.close();
	}
}
