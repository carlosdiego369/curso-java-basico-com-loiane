package com.loiane.cursojava.aula33.labs;

public class ContaCorrente {

	private int numConta, numDigito, operacao;
	private String nmCliente, nmUsuario;
	private boolean contaEspecia;
	private double saldo, limiteEspecial;

	public ContaCorrente(int numConta, int numDigito, int operacao, String nmCliente, String nmUsuario,
			boolean contaEspecia, double saldo, double limiteEspecial) {
		super();
		this.numConta = numConta;
		this.numDigito = numDigito;
		this.operacao = operacao;
		this.nmCliente = nmCliente;
		this.nmUsuario = nmUsuario;
		this.contaEspecia = contaEspecia;
		this.saldo = saldo;
		this.limiteEspecial = limiteEspecial;
	}

	// Construtor Vazio
	public ContaCorrente() {
	}

	// Get And Set
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public int getNumDigito() {
		return numDigito;
	}

	public void setNumDigito(int numDigito) {
		this.numDigito = numDigito;
	}

	public int getOperacao() {
		return operacao;
	}

	public void setOperacao(int operacao) {
		this.operacao = operacao;
	}

	public String getNmCliente() {
		return nmCliente;
	}

	public void setNmCliente(String nmCliente) {
		this.nmCliente = nmCliente;
	}

	public String getNmUsuario() {
		return nmUsuario;
	}

	public void setNmUsuario(String nmUsuario) {
		this.nmUsuario = nmUsuario;
	}

	public boolean isContaEspecia() {
		return contaEspecia;
	}

	public void setContaEspecia(boolean contaEspecia) {
		this.contaEspecia = contaEspecia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}

}
