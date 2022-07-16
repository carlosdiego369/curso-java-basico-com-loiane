package com.loiane.cursojava.aula42;

public class Professor {

	private double salario;
	private String nmCurso;

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
	
	public String obterEtiquetaEndereco() {
		String s = "Endereço do Professor: ";
		return s ; //+= super.getEndereco();
	}

//	@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println("Imprimindo o endereço do professor");
		System.out.println(this.obterEtiquetaEndereco());
	}

}
