package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exercicio06v2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		char[][] jogoDaVelha = new char[3][3];

		boolean ganhou = false;

		int jogada = 1;

		char sinal;

		int linha = 0, coluna = 0;

		System.out.println("Player 1 = X ");
		System.out.println("Player 2 = O ");

		while (!false) {

			if (jogada % 2 == 1) {
				System.out.println("Agora é a vez do Player 1: Escolha a linha e coluna (1 ~ 3)");
				sinal = 'X';
			} else {
				System.out.println("Agora é a vez do Player 2: Escolha a linha e coluna (1 ~ 3)");
				sinal = 'O';
			}

			boolean validaLinha = false;
			while (!validaLinha) {
				System.out.println("Escolha uma linha para marcar: (1 ~ 3)");
				linha = input.nextInt();

				if (linha >= 1 && linha <= 3) {
					validaLinha = true;
				} else {
					System.out.println("Entrada Inválida, digite novamente!");
				}
			}

			boolean validaColuna = false;
			while (!validaColuna) {
				System.out.println("Escolha uma coluna para marcar: (1 ~ 3)");
				coluna = input.nextInt();

				if (coluna >= 1 && coluna <= 3) {
					validaColuna = true;
				} else {
					System.out.println("Entrada Inválida, digite novamente!");
				}
			}

			linha--;
			coluna--;
			if (jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[linha][coluna] == 'O') {
				System.out.println("Escolha outro pois já foi marcado!");
			} else {
				jogoDaVelha[linha][coluna] = sinal;
				jogada++;
			}

			for (int i = 0; i < jogoDaVelha.length; i++) {
				System.out.print("|");
				for (int j = 0; j < jogoDaVelha[i].length; j++) {
					System.out.print(jogoDaVelha[i][j] + "|");
				}
				System.out.println();
			}

			if ((jogoDaVelha[0][0] == 'X' && jogoDaVelha[0][1] == 'X' && jogoDaVelha[0][2] == 'X') || // linha1
					(jogoDaVelha[1][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[1][2] == 'X') || // linha2
					(jogoDaVelha[2][0] == 'X' && jogoDaVelha[2][1] == 'X' && jogoDaVelha[2][2] == 'X') || // linha3
					(jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][0] == 'X' && jogoDaVelha[2][0] == 'X') || // coluna1
					(jogoDaVelha[0][1] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][1] == 'X') || // coluna2
					(jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][2] == 'X' && jogoDaVelha[2][2] == 'X') || // coluna3
					(jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][2] == 'X') || // diagonal
					(jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][2] == 'X') || // diagonal1
					(jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][0] == 'X')) {// diagonal2

				ganhou = true;
				System.out.println("Player 1 is Winner");

			} else if ((jogoDaVelha[0][0] == 'O' && jogoDaVelha[0][1] == 'O' && jogoDaVelha[0][2] == 'O') || // linha1
					(jogoDaVelha[1][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[1][2] == 'O') || // linha2
					(jogoDaVelha[2][0] == 'O' && jogoDaVelha[2][1] == 'O' && jogoDaVelha[2][2] == 'O') || // linha3
					(jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][0] == 'O' && jogoDaVelha[2][0] == 'O') || // coluna1
					(jogoDaVelha[0][1] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][1] == 'O') || // coluna2
					(jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][2] == 'O' && jogoDaVelha[2][2] == 'O') || // coluna3
					(jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][2] == 'O') || // diagonal
					(jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][2] == 'O') || // diagonal1
					(jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][0] == 'O')) {// diagonal2

				ganhou = true;
				System.out.println("Player 2 is Winner");

			} else if (jogada > 9) {
				ganhou = true;
				System.out.println("Empate");
			}
		}

	}
}
