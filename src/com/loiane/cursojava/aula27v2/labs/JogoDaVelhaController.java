package com.loiane.cursojava.aula27v2.labs;

import java.util.Scanner;

public class JogoDaVelhaController {

	JogoDaVelha jg = new JogoDaVelha();

	Scanner input;

	public JogoDaVelhaController(Scanner scanner) {
		input = scanner;
	}

	String input(String text) {
		return input.next();

	}

	void apresentarJogadores() {
		jg.text += "Player 1 = X\n";
		jg.text += "Player 2 = O";

		System.out.println(jg.text);
	}

	void msgError() {
		System.out.println("Entrada inválida, digite novamente!");
	}

	boolean validarJogada(int linha, int coluna) {
		if (jg.jgVelha[linha][coluna] == 'X' || jg.jgVelha[linha][coluna] == 'O') {
			msgError();
			return true;
		} else {
			jg.jgVelha[linha][coluna] = jg.sinal;
			jg.jogada++;
			return false;
		}
	}

	void imprimirTabuleiro() {
		for (int i = 0; i < jg.jgVelha.length; i++) {
			for (int j = 0; j < jg.jgVelha[i].length; j++) {
				System.out.print(jg.jgVelha[i][j] + "|");
			}
			System.out.println();
		}
	}

	boolean verificarGanhador(char sinal) {
		if ((jg.jgVelha[0][0] == sinal && jg.jgVelha[0][1] == sinal && jg.jgVelha[0][2] == sinal) || // linha1
				(jg.jgVelha[1][0] == sinal && jg.jgVelha[1][1] == sinal && jg.jgVelha[1][2] == sinal) || // linha2
				(jg.jgVelha[2][0] == sinal && jg.jgVelha[2][1] == sinal && jg.jgVelha[2][2] == sinal) || // linha3
				(jg.jgVelha[0][0] == sinal && jg.jgVelha[1][0] == sinal && jg.jgVelha[2][0] == sinal) || // coluna1
				(jg.jgVelha[0][1] == sinal && jg.jgVelha[1][1] == sinal && jg.jgVelha[2][1] == sinal) || // coluna2
				(jg.jgVelha[0][2] == sinal && jg.jgVelha[1][2] == sinal && jg.jgVelha[2][2] == sinal) || // coluna3
				(jg.jgVelha[0][0] == sinal && jg.jgVelha[1][1] == sinal && jg.jgVelha[2][2] == sinal) || // diagonal1
				(jg.jgVelha[0][2] == sinal && jg.jgVelha[2][1] == sinal && jg.jgVelha[2][0] == sinal)) { // diagonal2
			jg.ganhou = true;
			return true;
		}else if(jg.jogada == 9){
			jg.ganhou = true;
			return true;
		}
		return false;
	}

	boolean rollPlay() {
		while(!jg.ganhou) {
		if (jg.jogada % 2 == 1) {
			System.out.println("Vez do player 1. Escolha linha e coluna (1 ~ 3)." + jg.jogada);
			jg.sinal = 'X';
			return true;
		} else if(jg.jogada % 2 == 0) {
			System.out.println("Vez do player 2. Escolha linha e coluna (1 ~ 3)." + jg.jogada);
			jg.sinal = 'O';
			return true;
		}
	}
		return false;
	}

	int valor(String tipoValor) {
		int valor = 0;
		boolean valorValido = false;
		while (!valorValido) {
			System.out.println("Entre com a " + tipoValor + " (1, 2 ou 3)");
			valor = input.nextInt();
			if (valor >= 1 && valor <= 3) {
				valorValido = true;
			} else {
				msgError();
			}
		}
		valor--;
		return valor;
	}

	boolean checkGame() {

		if (verificarGanhador('X')) {
			jg.ganhou = true;
			System.out.println("Parabéns, jogador 1 ganhou!");
		} else if (verificarGanhador('O')) {
			jg.ganhou = true;
			System.out.println("Parabéns, jogador 2 ganhou!");
		} else if (jg.jogada == 9) {
			jg.ganhou = true;
			System.out.println("Ninguém ganhou essa partida.");
		}
		return false;
	}

}
