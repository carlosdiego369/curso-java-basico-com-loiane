package com.loiane.cursojava.aula36v2.labs.curso;

public class Curso {
	
	private String nmCurso;
	private String horario;
	private Professor professor;
	private Aluno[] alunos;
	public String getNmCurso() {
		return nmCurso;
	}
	public void setNmCurso(String nmCurso) {
		this.nmCurso = nmCurso;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	
	
}
