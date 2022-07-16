package com.loiane.cursojava.aula43.labs;

public class ContaBancaria {

	private String nomeCliente;
	private int numConta;
	private double saldo;
	
	@Override
	public String toString() {
		return "ContaBancaria [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + "]";
	}

	public ContaBancaria() {
	}

	String getNomeCliente() {
		return nomeCliente;
	}

	void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	int getNumConta() {
		return numConta;
	}

	void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	double getSaldo() {
		return saldo;
	}

	void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double sacar(double valorSaque) {
		if (valorSaque > getSaldo()) {
			System.err.println("Não há saldo para sacar esse valor.");
			System.exit(0);
		} else {
			valorSaque = getSaldo() - valorSaque;
		}
		return getSaldo();
	}
	
	public double depositar(double valorDeposito) {
		return getSaldo() + valorDeposito;
	}

}
