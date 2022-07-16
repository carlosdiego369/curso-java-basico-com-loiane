package com.loiane.cursojava.aula33.labs;

import java.util.Scanner;


public class JogoDaVelhaController {
	
		JogoDaVelha jg = new JogoDaVelha();

		Scanner input;

		public JogoDaVelhaController(Scanner scanner) {
			input = scanner;
		}

		public String input(String text) {
			return input.next();

		}

		public void apresentarJogadores() {
			String text = "";
			text += "Player 1 = X\n";
			text += "Player 2 = O";

			System.out.println(text);
		}

		public void msgError() {
			System.out.println("Entrada inválida, digite novamente!");
		}

		public boolean validarJogada(int linha, int coluna) {
			if (jg.getJgVelha()[linha][coluna] == 'X' || jg.getJgVelha()[linha][coluna] == 'O') {
				msgError();
				return true;
			} else {
				jg.getJgVelha()[linha][coluna] = jg.getSinal();
				jg.setJogada(jg.getJogada() + 1);
				return false;
			}
		}

		public void imprimirTabuleiro() {
			for (int i = 0; i < jg.getJgVelha().length; i++) {
				for (int j = 0; j < jg.getJgVelha()[i].length; j++) {
					System.out.print(jg.getJgVelha()[i][j] + "|");
				}
				System.out.println();
			}
		}

		public boolean verificarGanhador(char sinal) {
			if ((jg.getJgVelha()[0][0] == sinal && jg.getJgVelha()[0][1] == sinal && jg.getJgVelha()[0][2] == sinal) || // linha1
					(jg.getJgVelha()[1][0] == sinal && jg.getJgVelha()[1][1] == sinal && jg.getJgVelha()[1][2] == sinal) || // linha2
					(jg.getJgVelha()[2][0] == sinal && jg.getJgVelha()[2][1] == sinal && jg.getJgVelha()[2][2] == sinal) || // linha3
					(jg.getJgVelha()[0][0] == sinal && jg.getJgVelha()[1][0] == sinal && jg.getJgVelha()[2][0] == sinal) || // coluna1
					(jg.getJgVelha()[0][1] == sinal && jg.getJgVelha()[1][1] == sinal && jg.getJgVelha()[2][1] == sinal) || // coluna2
					(jg.getJgVelha()[0][2] == sinal && jg.getJgVelha()[1][2] == sinal && jg.getJgVelha()[2][2] == sinal) || // coluna3
					(jg.getJgVelha()[0][0] == sinal && jg.getJgVelha()[1][1] == sinal && jg.getJgVelha()[2][2] == sinal) || // diagonal1
					(jg.getJgVelha()[0][2] == sinal && jg.getJgVelha()[2][1] == sinal && jg.getJgVelha()[2][0] == sinal)) { // diagonal2
				jg.setGanhou(true);
				return true;
			}else if(jg.getJogada() == 9){
				jg.setGanhou(true);
				return true;
			}
			return false;
		}

		public boolean rollPlay() {
			while(!jg.isGanhou()) {
			if (jg.getJogada() % 2 == 1) {
				System.out.println("Vez do player 1. Escolha linha e coluna (1 ~ 3).");
				jg.setSinal('X');
				return true;
			} else if(jg.getJogada() % 2 == 0) {
				System.out.println("Vez do player 2. Escolha linha e coluna (1 ~ 3).");
				jg.setSinal('O'); 
				return true;
			}
		}
			return false;
		}

		public int valor(String tipoValor) {
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

		public boolean checkGame() {

			if (verificarGanhador('X')) {
				jg.setGanhou(true);
				System.out.println("Parabéns, jogador 1 ganhou!");
			} else if (verificarGanhador('O')) {
				jg.setGanhou(true);
				System.out.println("Parabéns, jogador 2 ganhou!");
			} else if (jg.getJogada() == 9) {
				jg.setGanhou(true);
				System.out.println("Ninguém ganhou essa partida.");
			}
			return false;
		}

}
