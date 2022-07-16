package com.loiane.cursojava.aula43v2.labs.exer02;

public abstract class Contribuinte {
	
	private String nome;
	private double rendaBruta;
	
	
	String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	double getRendaBruta() {
		return rendaBruta;
	}
	void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	
	public abstract double calcularImposto();
	
	
	@Override
	public String toString() {
		return "Contribuinte [nome=" + nome + ", rendaBruta=" + rendaBruta + "]";
	}
	
	

}
