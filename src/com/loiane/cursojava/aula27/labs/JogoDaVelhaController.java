package com.loiane.cursojava.aula27.labs;

import java.util.Scanner;

public class JogoDaVelhaController {

	JogoDaVelha jg = new JogoDaVelha();

	Scanner input;

	JogoDaVelhaController(Scanner scanner) {
		input = scanner;
	}

	char[][] imprimirTabuleiro(char[][] imprimir) {
		for (int i = 0; i < jg.jogo.length; i++) {
			for (int j = 0; j < jg.jogo[i].length; j++) {
				System.out.print(jg.jogo[i][j] + "|");
			}
			System.out.println();
		}
		return imprimir;

	}

	void rollPlay() { // rollPlay = Jogadas
		while (true) {
			primeiroJogador();
			imprimirTabuleiro(jg.jogo);
			jg.empate++;

			if (definirVencedor('X')) {
				System.out.println("Player 1 é o vencedor");
				break;
			}

			segundoJogador();
			imprimirTabuleiro(jg.jogo);
			jg.empate++;
			if (definirVencedor('O')) {
				System.out.println("Player 2 é o vencedor");
				break;
			}
			if (jg.empate >= 9) {
				System.out.println("Empate!");
			}
		}
	}

	boolean definirVencedor(char player) {
		if (checkLine(player)) {
			return true;
		} else if (checkColuna(player)) {
			return true;
		} else if (checkDiagonal(player)) {
			return true;
		} else {
			return false;
		}
	}

	boolean checkLine(char player) {
		if (jg.jogo[0][0] == player && jg.jogo[0][1] == player && jg.jogo[0][2] == player) {
			return true;
		} else if (jg.jogo[1][0] == player && jg.jogo[1][1] == player && jg.jogo[1][2] == player) {
			return true;
		} else if (jg.jogo[2][0] == player && jg.jogo[2][1] == player && jg.jogo[2][2] == player) {
			return true;
		} else {
			return false;
		}
	}

	boolean checkColuna(char player) {
		if (jg.jogo[0][0] == player && jg.jogo[1][0] == player && jg.jogo[2][0] == player) {
			return true;
		} else if (jg.jogo[0][1] == player && jg.jogo[1][1] == player && jg.jogo[2][1] == player) {
			return true;
		} else if (jg.jogo[0][2] == player && jg.jogo[1][2] == player && jg.jogo[2][2] == player) {
			return true;
		} else {
			return false;
		}
	}

	boolean checkDiagonal(char player) {
		if (jg.jogo[0][0] == player && jg.jogo[1][1] == player && jg.jogo[2][2] == player) {
			return true;
		} else if (jg.jogo[0][2] == player && jg.jogo[1][1] == player && jg.jogo[2][0] == player) {
			return true;
		} else {
			return false;
		}
	}

	void primeiroJogador() {
		jg.checkGame = false;

		while (!jg.checkGame) {
			System.out.println("Primeiro Jogador = X");

			boolean checkInput = false;
			while (!checkInput) {
				System.out.println("Escolha a linha");
				jg.linha = input.nextInt();

				if (jg.linha >= 1 && jg.linha <= 3) {
					checkInput = true;
				} else {
					errorCheck();
					checkInput = false;
				}
			}
			jg.linha--;

			checkInput = false;
			while (!checkInput) {
				System.out.println("Escolha a coluna");
				jg.coluna = input.nextInt();
				if (jg.coluna >= 1 && jg.coluna <= 3) {
					checkInput = true;
				} else {
					errorCheck();
					checkInput = false;
				}
			}
			jg.coluna--;

			if (jg.jogo[jg.linha][jg.coluna] != 'X' && jg.jogo[jg.linha][jg.coluna] != 'O') {
				jg.checkGame = true;
			} else {
				msgError();
				jg.checkGame = false;
			}
		}

		jg.jogo[jg.linha][jg.coluna] = 'X';
	}

	void segundoJogador() {
		jg.checkGame = false;

		while (!jg.checkGame) {
			System.out.println("Segundo Jogador = O");

			System.out.println("Escolha a linha");
			jg.linha = input.nextInt();

			jg.linha--;

			System.out.println("Escolha a coluna");
			jg.coluna = input.nextInt();

			jg.coluna--;

			if (jg.jogo[jg.linha][jg.coluna] != 'X' && jg.jogo[jg.linha][jg.coluna] != 'O') {
				jg.checkGame = true;
			} else {
				msgError();
				jg.checkGame = false;
			}

		}

		jg.jogo[jg.linha][jg.coluna] = 'O';
	}

	void msgError() {
		System.out.println("Ops... já está marcado esse ponto! Repita");
	}

	void errorCheck() {
		System.out.println("Entrada Inválida, Digite novamente!");
	}

	int checkNumber(int check) {

		return check;

	}

}
