package com.loiane.cursojava.aula43v2.labs.exer01;

public class ContaBancaria {

	private String nomeCliente;
	private String numConta;
	private double saldo;

	String getNomeCliente() {
		return nomeCliente;
	}

	void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	String getNumConta() {
		return numConta;
	}

	void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	double getSaldo() {
		return saldo;
	}

	void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaBancaria [nomeCliente: " + nomeCliente + ", numConta: " + numConta + ", saldo: R$" + saldo + "]";
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public boolean sacar(double valor) {
		if ((saldo - valor) >= 0) {
			saldo -= valor;
			return true;
		}
		return false;
	}

}
