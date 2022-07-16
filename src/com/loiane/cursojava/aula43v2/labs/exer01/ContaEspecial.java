package com.loiane.cursojava.aula43v2.labs.exer01;

public class ContaEspecial extends ContaBancaria {
	
	private double limite;

	double getLimite() {
		return limite;
	}

	void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		String s = "ContaEspecial [limite=" + limite + "]";
		s += super.toString();
		return s;
	}
	
	public boolean sacar(double valor) {
		
		double saldoComLimite = this.getSaldo() + limite;
		if((saldoComLimite - valor) >= 0) {
			this.setSaldo(this.getSaldo() - valor);
		}
		return false;
	}

}
