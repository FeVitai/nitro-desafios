package desafios.solucoes.cafecomleite;

import java.util.Scanner;

public class Visto {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int P = sc.nextInt();
		
		if (P % 42 == 0) {
			System.out.println("Sim");
		} else {
			System.out.println("Nao");
		}
		
		sc.close();
	}
}
