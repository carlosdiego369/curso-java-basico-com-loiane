package com.loiane.cursojava.aula33.labs;

public class JogoDaVelha {
	
	private char [][] jgVelha;
	private int jogada;
	private String text;
	private boolean ganhou;
	private char sinal;
	private int linha, coluna;
	
	
	public JogoDaVelha() {
		jgVelha = new char[3][3];
		jogada = 1;
		text = "";
		ganhou = false;
		linha = 0; 
		coluna = 0;
	}

	public char[][] getJgVelha() {
		return jgVelha;
	}

	public void setJgVelha(char[][] jgVelha) {
		this.jgVelha = jgVelha;
	}

	public int getJogada() {
		return jogada;
	}

	public void setJogada(int jogada) {
		this.jogada = jogada;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isGanhou() {
		return ganhou;
	}

	public void setGanhou(boolean ganhou) {
		this.ganhou = ganhou;
	}

	public char getSinal() {
		return sinal;
	}

	public void setSinal(char sinal) {
		this.sinal = sinal;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
}
