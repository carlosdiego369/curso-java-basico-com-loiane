package com.loiane.cursojava.aula27v2.labs;

public class JogoDaVelha {
	
	char [][] jgVelha;
	int jogada;
	String text;
	boolean ganhou;
	char sinal;
	int linha, coluna;
	
	public JogoDaVelha() {
		jgVelha = new char[3][3];
		jogada = 1;
		text = "";
		ganhou = false;
		linha = 0; 
		coluna = 0;
	}

}
