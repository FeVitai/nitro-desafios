package desafios.solucoes.cafecomleite;

import java.util.Locale;
import java.util.Scanner;

public class ChegaDeMultas {

	/*
	 * Chega de multas Mostrar detalhes Carlos viajou para outro país e alugou um
	 * carro, no dia da devolução foi notificado que havia 300 reais em multa por
	 * alta velocidade. Após longas conversas percebeu que o velocímetro estava
	 * configurado em milhas por horas, então enquanto achava que estava a 80Km/h na
	 * verdade estava em 80mph. Lembrando que 1 km/h corresponde a 0,62137 mph.
	 * 
	 * Tarefa Escreva um programa que converta o valor em milhas/h para Km/h.
	 * 
	 * Entrada A entrada cons1.6093440006147iste de um único número N.
	 * 
	 * Saída Seu programa deve imprimir uma única linha, contendo o valor convertido
	 * para Km/h (com duas casas decimais).
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double mile = 1.6093440006147;
		
		double n = sc.nextDouble();
		
		System.out.printf("%.2f", n * mile);
		
		sc.close();
	}
	
}
