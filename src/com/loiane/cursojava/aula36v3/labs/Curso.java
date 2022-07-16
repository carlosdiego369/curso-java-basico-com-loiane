package com.loiane.cursojava.aula36v3.labs;

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
	
	public String infoCurso() {
		String info = "Nome do curso: " + nmCurso + "\n";
		if(professor != null) {
			info += professor.infoProfessor();
		}
		
		if(alunos != null) {
			for(Aluno aluno: alunos) {
				if(aluno != null) {
				info += aluno.infoAluno();
				info += "\n";
				}
			}
			info += "\nMedia da turma " + obterMediaClasse();
		}
		return info;
	}
	
	public double obterMediaClasse() {
		double soma = 0;
		for(Aluno aluno: alunos) {
			if(aluno != null) {
				soma += aluno.mediaClasse();
			}
		}
		return soma / alunos.length;
	}
}
