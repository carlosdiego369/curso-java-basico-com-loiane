package com.loiane.cursojava.aula27v2.labs;

import java.util.Scanner;

public class JogoDaVelhaService {

	public static void main(String[] args) {
		JogoDaVelha jg = new JogoDaVelha();
		JogoDaVelhaController jgC = new JogoDaVelhaController(new Scanner(System.in));
		
		jgC.apresentarJogadores();
		jg.ganhou = false;
		while(!jg.ganhou) {
			jgC.rollPlay();
			jg.linha = jgC.valor("Linha");
			jg.coluna = jgC.valor("Coluna");
			jgC.validarJogada(jg.linha, jg.coluna);
			jgC.imprimirTabuleiro();
			jgC.checkGame();
		}
		
	}

}
