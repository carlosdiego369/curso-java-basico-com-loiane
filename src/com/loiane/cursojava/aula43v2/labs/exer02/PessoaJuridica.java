package com.loiane.cursojava.aula43v2.labs.exer02;

public class PessoaJuridica extends Contribuinte{

	private String cnpj;

	String getCnpj() {
		return cnpj;
	}

	void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calcularImposto() {
		return this.getRendaBruta() * 0.1;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + "]\nImposto a ser pago: " + calcularImposto() ;
	}
	
	
}
