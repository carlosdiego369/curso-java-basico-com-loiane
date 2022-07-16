package com.loiane.cursojava.aula41;

public class Aluno extends Pessoa {

	private String curso;
	private double[] notas;
	
	

	

	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aluno(String nmAluno, String endereco, String telefone) {
		super(nmAluno, endereco, telefone);
		// TODO Auto-generated constructor stub
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double calcularMedia() {
		return 0;

	}

	public boolean verificarAprovado() {
		return true;

	}

	public String obterEtiquetaEndereco() {
		String s = "Endereço do Aluno: ";
		return s += super.getEndereco();
	}

	@Override
	public void imprimirEtiquetaEndereco() {

		System.out.println(this.obterEtiquetaEndereco());
		
	}
	
}
