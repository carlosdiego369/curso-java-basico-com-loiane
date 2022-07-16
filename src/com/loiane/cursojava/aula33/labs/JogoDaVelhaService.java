package com.loiane.cursojava.aula33.labs;

import java.util.Scanner;

public class JogoDaVelhaService {

	public static void main(String[] args) {
		JogoDaVelha jg = new JogoDaVelha();
		JogoDaVelhaController jgC = new JogoDaVelhaController(new Scanner(System.in));

		jgC.apresentarJogadores();
		jg.setGanhou(false);
		while (!jg.isGanhou()) {
			jgC.rollPlay();
			jg.setLinha(jgC.valor("Linha"));
			jg.setColuna(jgC.valor("Coluna"));
			jgC.validarJogada(jg.getLinha(), jg.getColuna());
			jgC.imprimirTabuleiro();
			jgC.checkGame();
		}

	}

}
