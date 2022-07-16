package com.loiane.cursojava.aula27v3.labs;

import java.util.Scanner;

public class JogoDaVelhaController {

	JogoDaVelha jg = new JogoDaVelha();

	Scanner input;

	public JogoDaVelhaController(Scanner scanner) {
		input = scanner;
	}

	void rollPlayer() {
		while (true) {
			firstPlayer();
			imprimirTabuleiro(jg.jogoDaVelha);
			jg.jogada++;

			if (verificaGanhador('X')) {
				System.out.println("First Player Winner");
				break;
			}

			secondPlayer();
			imprimirTabuleiro(jg.jogoDaVelha);
			jg.jogada++;

			if (verificaGanhador('O')) {
				System.out.println("Second Player Winner");
				break;
			}

			if (jg.jogada >= 9) {
				System.out.println("TIE");
				break;
			}

		}
	}

	boolean verificaGanhador(char player) {
		if (checkLine(player)) {
			return true;
		} else if (checkColumn(player)) {
			return true;
		} else if (checkColumn(player)) {
			return true;
		} else {
			return false;
		}
	}

	char[][] imprimirTabuleiro(char[][] imprimir) {
		for (int i = 0; i < jg.jogoDaVelha.length; i++) {
			for (int j = 0; j < jg.jogoDaVelha[i].length; j++) {
				System.out.print(jg.jogoDaVelha[i][j] + "|");
			}
			System.out.println();
		}
		return imprimir;
	}

	boolean checkLine(char player) {
		if (jg.jogoDaVelha[0][0] == player && jg.jogoDaVelha[0][1] == player && jg.jogoDaVelha[0][2] == player) {
			return true;
		} else if (jg.jogoDaVelha[1][0] == player && jg.jogoDaVelha[1][1] == player && jg.jogoDaVelha[1][2] == player) {
			return true;
		} else if (jg.jogoDaVelha[2][0] == player && jg.jogoDaVelha[2][1] == player && jg.jogoDaVelha[2][2] == player) {
			return true;
		} else {
			return false;
		}
	}

	boolean checkColumn(char player) {
		if (jg.jogoDaVelha[0][0] == player && jg.jogoDaVelha[1][0] == player && jg.jogoDaVelha[2][0] == player) {
			return true;
		} else if (jg.jogoDaVelha[0][1] == player && jg.jogoDaVelha[1][1] == player && jg.jogoDaVelha[2][1] == player) {
			return true;
		} else if (jg.jogoDaVelha[0][2] == player && jg.jogoDaVelha[1][2] == player && jg.jogoDaVelha[2][2] == player) {
			return true;
		} else {
			return false;
		}
	}

	boolean checkDiagonally(char player) {
		if (jg.jogoDaVelha[0][0] == player && jg.jogoDaVelha[1][1] == player && jg.jogoDaVelha[2][2] == player) {
			return true;
		} else if (jg.jogoDaVelha[0][2] == player && jg.jogoDaVelha[1][1] == player && jg.jogoDaVelha[2][0] == player) {
			return true;
		} else {
			return false;
		}
	}

	void firstPlayer() {
		jg.checkGame = false;

		while (!jg.checkGame) {
			System.out.println("First Player = X");

			boolean checkInput = false;
			while (!checkInput) {
				System.out.println("Escolha a linha");
				jg.linha = input.nextInt();

				if (jg.linha >= 1 && jg.linha <= 3) {
					checkInput = true;
				} else {
					errorEntrada();
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
					errorEntrada();
					checkInput = false;
				}
			}
			jg.coluna--;

			if (jg.jogoDaVelha[jg.linha][jg.coluna] != 'X' && jg.jogoDaVelha[jg.linha][jg.coluna] != 'O') {
				jg.checkGame = true;
			} else {
				errorEntrada();
				jg.checkGame = false;
			}
		}

		jg.jogoDaVelha[jg.linha][jg.coluna] = 'X';
	}

	void secondPlayer() {
		jg.checkGame = false;

		while (!jg.checkGame) {
			System.out.println("Second Player = X");

			boolean checkInput = false;
			while (!checkInput) {
				System.out.println("Escolha a linha");
				jg.linha = input.nextInt();

				if (jg.linha >= 1 && jg.linha <= 3) {
					checkInput = true;
				} else {
					errorEntrada();
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
					errorEntrada();
					checkInput = false;
				}
			}
			jg.coluna--;

			if (jg.jogoDaVelha[jg.linha][jg.coluna] != 'X' && jg.jogoDaVelha[jg.linha][jg.coluna] != 'O') {
				jg.checkGame = true;
			} else {
				errorEntrada();
				jg.checkGame = false;
			}
		}

		jg.jogoDaVelha[jg.linha][jg.coluna] = 'O';
	}

	void errorEntrada() {
		System.out.println("Entrada Inválida, Digite novamente!");
	}

	void optionInvalid() {
		System.out.println("Ops... Está entrada já foi escolhida, digite novamente.");
	}

}
