package desafios.solucoes.cafecomleite;

import java.util.Scanner;

public class AcheASaida {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String escolha = sc.nextLine();
		
		if (escolha.equals("direita esquerda")) {
			System.out.println("Achou");
		} else if(escolha.equals("direita direita")) {
			System.out.println("Tente novamente");
		} else if(escolha.equals("esquerda esquerda")) {
			System.out.println("Morreu");
		} else if(escolha.equals("esquerda direita")) {
			System.out.println("Tente novamente");
		}
		
		sc.close();
	}
}
