package com.loiane.cursojava.aula39;

public class Professor extends Pessoa {
	
	private double salario;
	private String nmCurso;
	
	public void verificarAcesso() {
		super.nomeVisibilidade = "sadjasodjasdoa";
		this.nomeVisibilidade = "asjdasaofe";
		
		setNomeVisibilidade("asdasdasdasd");
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNmCurso() {
		return nmCurso;
	}
	public void setNmCurso(String nmCurso) {
		this.nmCurso = nmCurso;
	}
	
	public double calcularSalarioLiquido() {
		return 0;
	}
	
	
}
