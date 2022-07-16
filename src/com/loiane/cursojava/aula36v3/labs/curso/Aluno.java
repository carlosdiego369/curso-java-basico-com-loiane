package com.loiane.cursojava.aula36v3.labs.curso;

public class Aluno {

	private String nmAluno;
	private int matricula;
	private double[] notas;

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
		String info = "\n********** INFORMAÇÕES DO ALUNO **********\n\n";
		info += "Nome do aluno: " + nmAluno + "; \n";
		info += "Matricula do aluno: " + matricula + ";\n";
		info += "Notas: ";
		for (int i = 0; i < getNotas().length; i++) {
			info += getNotas()[i] + " ";
		}

		if (mediaAluno() >= 7) {
			info += "\nAprovado! \n";
		} else {
			info += "\nReprovado! \n";
		}
		return info;
	}

	public double mediaAluno() {
		double soma = 0;
		for (int i = 0; i < getNotas().length; i++) {
			soma += getNotas()[i];
		}
		return soma / getNotas().length;
	}
	
	public double mediaClasse(Curso c) {
		double soma = 0;
		for(int i = 0; i < c.getAlunos().length; i++) {
			for(int j = 0; j < c.getAlunos()[i].getNotas().length; j++) {
				soma += getNotas()[j];
			}
		}
		//Somatoria / (qnt notas * qtd alunos)
		return soma / (c.getAlunos()[0].getNotas().length * c.getAlunos().length);
	}

}
