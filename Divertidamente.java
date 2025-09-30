package Algoritmo01;

import java.util.Scanner;

public class Divertidamente {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double pontuacaoAlegria = 0;
		double pontuacaoTristeza = 0;

		System.out.print("Informe quantas amizades a Riley fez na nova cidade: ");

		int amizades = entrada.nextInt();

		if (amizades > 0) {
			double pontosAmizade = amizades * 10.0;
			pontuacaoAlegria += pontosAmizade;
			System.out.println("Alegria recebeu " + pontosAmizade + " pontos.");
		} else {
			pontuacaoTristeza += 30.0;
			System.out.println("Tristeza recebeu 30.0 pontos.");
		}

		System.out.print("Informe a nota da prova A1: ");
		double provaA1 = entrada.nextDouble();

		System.out.print("Informe a nota da prova A2: ");
		double provaA2 = entrada.nextDouble();

		System.out.print("Informe a nota da prova A3: ");
		double provaA3 = entrada.nextDouble();

		double medianotas = (provaA1 + provaA2 + provaA3) / 3.0;
		System.out.printf("A média das notas é: %.2f\n", medianotas);

		if (medianotas >= 7.0) {
			pontuacaoAlegria += 50.0;
			System.out.println("Riley foi aprovada! Alegria recebeu 50.0 pontos.");
		} else {
			pontuacaoTristeza += 50.0;
			System.out.println("Riley foi reprovada. Tristeza recebeu 50.0 pontos.");
		}

		final int TOTAL_ALGORITMOS = 10;

		System.out.print("Quantos dos " + TOTAL_ALGORITMOS + " algoritmos Riley conseguiu resolver? ");
		int algoritmosRealizados = entrada.nextInt();

		double pontosAlegriaAlg = algoritmosRealizados * 10.0;
		pontuacaoAlegria += pontosAlegriaAlg;

		int algoritmosNaoRealizados = TOTAL_ALGORITMOS - algoritmosRealizados;
		double pontosTristezaAlg = algoritmosNaoRealizados * 10.0;
		pontuacaoTristeza += pontosTristezaAlg;

		System.out.println("Alegria ganhou " + pontosAlegriaAlg + " pontos pelos algoritmos resolvidos.");
		System.out.println("Tristeza ganhou " + pontosTristezaAlg + " pontos pelos algoritmos não resolvidos.");

		System.out.println("Total Alegria: " + pontuacaoAlegria + " pontos.");
		System.out.println("Total Tristeza: " + pontuacaoTristeza + " pontos.");
		System.out.println("-------------------------------------");

		if (pontuacaoAlegria > pontuacaoTristeza) {
			System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley.");
		} else if (pontuacaoTristeza > pontuacaoAlegria) {
			System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley.");
		} else {

			System.out.println("As emoções estão em equilíbrio. A mudança foi uma experiência mista para a Riley.");
		}

		entrada.close();
	}
}