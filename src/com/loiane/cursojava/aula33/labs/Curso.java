package com.loiane.cursojava.aula33.labs;

public class Curso {

	private String nmAluno, grauEscolaridade;
	private int matricula;

	 String[] nmDisciplinas;
	 double[][] notasAluno;
	public String text;

	public Curso() {
		this.nmDisciplinas = new String[3];
		this.notasAluno = new double[3][4];
	}

	public Curso(String nmAluno, String grauEscolaridade, int matricula, String[] nmDisciplinas, double[][] notasAluno) {
		this.nmAluno = nmAluno;
		this.grauEscolaridade = grauEscolaridade;
		this.matricula = matricula;
		this.nmDisciplinas = nmDisciplinas;
		this.notasAluno = notasAluno;
	}

	public String getNmAluno() {
		return nmAluno;
	}

	public void setNmAluno(String nmAluno) {
		this.nmAluno = nmAluno;
	}

	public String getGrauEscolaridade() {
		return grauEscolaridade;
	}

	public void setGrauEscolaridade(String grauEscolaridade) {
		this.grauEscolaridade = grauEscolaridade;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String[] getNmDisciplinas() {
		return nmDisciplinas;
	}

	public void setNmDisciplinas(String[] string) {
		this.nmDisciplinas = string;
	}

	public double[][] getNotasAluno() {
		return notasAluno;
	}

	public void setNotasAluno(double[][] notasAluno) {
		this.notasAluno = notasAluno;
	}
}
