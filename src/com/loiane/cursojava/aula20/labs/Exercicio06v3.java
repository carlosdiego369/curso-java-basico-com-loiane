package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exercicio06v3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Player 1: X");
		System.out.println("Player 2: O");

		int jogada = 1, linha = 0, coluna = 0;

		boolean ganhou = false;

		char[][] jogosDaVelha = new char[3][3];
		char sinal;

		System.out.println(":::::::::::::::::::::::::::::::::");
		System.out.println("::::::::::Jogo da Velha :::::::::");
		System.out.println(":::::::::::::::::::::::::::::::::");

		while (!ganhou) {

			if (jogada % 2 == 1) {
				System.out.println("Player 1: É a sua vez!");
				sinal = 'X';
			} else {
				System.out.println("Player 2: É a sua vez!");
				sinal = 'O';
			}
			
			boolean validaLinha = false;
			while (!validaLinha) {
				System.out.println("Escolha de (1~3) Linha para fazer a sua marcação");
				linha = input.nextInt();
				if (linha >= 1 && linha <= 3) {
					validaLinha = true;
				} else {
					System.out.println("Entrada inválida, digite novamente");
				}
			}
			
			boolean validaColuna = false;
			while (!validaColuna) {
				System.out.println("Escolha de (1~3) Coluna para fazer a sua marcação");
				coluna = input.nextInt();
				if (coluna >= 1 && coluna <= 3) {
					validaColuna = true;
				} else {
					System.out.println("Entrada inválida, digite novamente");
				}
			}

			linha--;
			coluna--;

			if (jogosDaVelha[linha][coluna] == 'X' && jogosDaVelha[linha][coluna] == 'O') {
				System.out.println("Ops.! Este já esta marcado, escolha outro que não esteja marcado!");
			} else {
				jogosDaVelha[linha][coluna] = sinal;
				jogada++;
			}

			for (char[] jogoDaVelha : jogosDaVelha) {
				for (char jogo : jogoDaVelha) {
					System.out.print(jogo + "|");
				}
				System.out.println();
			}
			System.out.println();
			
			if ((jogosDaVelha[0][0] == 'X' && jogosDaVelha[0][1] == 'X' && jogosDaVelha[0][2] == 'X') || // linha1
					(jogosDaVelha[1][0] == 'X' && jogosDaVelha[1][1] == 'X' && jogosDaVelha[1][2] == 'X') || // linha2
					(jogosDaVelha[2][0] == 'X' && jogosDaVelha[2][1] == 'X' && jogosDaVelha[2][2] == 'X') || // linha3
					(jogosDaVelha[0][0] == 'X' && jogosDaVelha[1][0] == 'X' && jogosDaVelha[2][0] == 'X') || // coluna1
					(jogosDaVelha[0][1] == 'X' && jogosDaVelha[1][1] == 'X' && jogosDaVelha[2][1] == 'X') || // coluna2
					(jogosDaVelha[0][2] == 'X' && jogosDaVelha[1][2] == 'X' && jogosDaVelha[2][2] == 'X') || // coluna3
					(jogosDaVelha[0][0] == 'X' && jogosDaVelha[1][1] == 'X' && jogosDaVelha[2][2] == 'X') || // diagonal1
					(jogosDaVelha[0][2] == 'X' && jogosDaVelha[2][1] == 'X' && jogosDaVelha[2][0] == 'X')) { // diagonal2
				System.out.println("Player 1 é o ganhador!");
				ganhou = true;
			}else if ((jogosDaVelha[0][0] == 'O' && jogosDaVelha[0][1] == 'O' && jogosDaVelha[0][2] == 'O') || // linha1
					(jogosDaVelha[1][0] == 'O' && jogosDaVelha[1][1] == 'O' && jogosDaVelha[1][2] == 'O') || // linha2
					(jogosDaVelha[2][0] == 'O' && jogosDaVelha[2][1] == 'O' && jogosDaVelha[2][2] == 'O') || // linha3
					(jogosDaVelha[0][0] == 'O' && jogosDaVelha[1][0] == 'O' && jogosDaVelha[2][0] == 'O') || // coluna1
					(jogosDaVelha[0][1] == 'O' && jogosDaVelha[1][1] == 'O' && jogosDaVelha[2][1] == 'O') || // coluna2
					(jogosDaVelha[0][2] == 'O' && jogosDaVelha[1][2] == 'O' && jogosDaVelha[2][2] == 'O') || // coluna3
					(jogosDaVelha[0][0] == 'O' && jogosDaVelha[1][1] == 'O' && jogosDaVelha[2][2] == 'O') || // diagonal1
					(jogosDaVelha[0][2] == 'O' && jogosDaVelha[2][1] == 'O' && jogosDaVelha[2][0] == 'O')) { // diagonal2
				System.out.println("Player 2 é o ganhador!");
				ganhou = true;
			}else if(jogada > 9) {
				System.out.println("TIE (Empate)");
			}

		}

	}

}
