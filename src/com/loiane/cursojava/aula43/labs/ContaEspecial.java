package com.loiane.cursojava.aula43.labs;

public class ContaEspecial extends ContaBancaria {
	
	private double limite;
	
	@Override
	public double sacar(double valorSaque) {
		if (valorSaque > (getSaldo() + limite)) {
			System.err.println("Não há saldo para sacar esse valor.");
			System.exit(0);
		} else {
			valorSaque = (getSaldo() + limite) - valorSaque;
		}
		return getSaldo();
	}
}
