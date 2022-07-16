package com.loiane.cursojava.aula36v2.labs.curso;

public class Aluno {
	
	private String nmAluno;
	private int matricula;
	private double [] notas = new double [4];
	
	public String getNmAluno() {
		return nmAluno;
	}
	public void setNmAluno(String nmAluno) {
		this.nmAluno = nmAluno;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public String infoAluno() {
		String info = "\n*********** INFORMAÇÕES DO ALUNO *********** \n" ;
		info += "Nome do Aluno: " + nmAluno + "; \n";
		info += "Matricula do Aluno: " + matricula + "; \n";
		info += "Notas: ";
		@SuppressWarnings("unused")
		double soma = 0;
		for(double nota : notas) {
			soma += nota;
			info += nota + " ";
		}
		
		info += "\nMédia do aluno: " + mediaAluno();
		if(mediaAluno() >= 7) {
			info += " Aprovado! \n";
		}else {
			info += " Reprovado! \n";
		}
		
		return info;
	}
	
	public double mediaAluno() {
		double soma = 0;
		for(double nota : notas) {
			soma += nota;
		}
		return soma / getNotas().length;
	}
	
	public double mediaClasse(Curso c) {
		double soma = 0;
		for(int i = 0; i < c.getAlunos().length; i++) {
			for(int j = 0; j < c.getAlunos()[i].getNotas().length; j++) {
				soma += c.getAlunos()[i].getNotas()[j];
		
		}
		}
		return soma / (c.getAlunos()[0].getNotas().length  * c.getAlunos().length);
	}	
	}
