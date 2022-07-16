package com.loiane.cursojava.aula43.labs;
	
public class ContaPoupanca extends ContaBancaria{
	
	final static double TAXA_DE_RENDIMENTO_ANUAL = 4.55;
	
	private double diaRendimento;
	
	
	double getDiaRendimento(double saldo) {
		diaRendimento = TAXA_DE_RENDIMENTO_ANUAL;
		saldo = (getSaldo() * diaRendimento) / 12;
		return getSaldo() + saldo;
	}
}
