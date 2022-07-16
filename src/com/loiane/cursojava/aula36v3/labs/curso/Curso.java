package com.loiane.cursojava.aula36v3.labs.curso;

public class Curso {
	
	private String nmCurso;
	private String horario;
	private Professor professor;
	private Aluno [] alunos;
	
	public Curso() {
	}
	
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

	public String infoCurso() {
		String info = "\n********** INFORMAÇÕES DO CURSO **********\n\n";
		info += "Nome do curso: " + nmCurso + "; \n";
		info += "Horário do curso: " + horario + "; \n";
		return info; 
	}
}
