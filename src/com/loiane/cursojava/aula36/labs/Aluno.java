package com.loiane.cursojava.aula36.labs;

public class Aluno {
	private String nome;
	private int matricula;
	private double[] notas;

	Aluno() {
		notas = new double[4];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
		String info = "Nome do Aluno: " + nome + "; \n";
		info += "Matriculo: " + matricula + "; \n";
		info += "Notas: ";

		double soma = 0;
		for (double nota : notas) {
			soma += nota;
			info += nota + " ";
		}

		double media = soma / notas.length;
		info += "\n" + "Média = " + media + " - ";
		if (media >= 7) {
			info += "Aprovado!";
		} else {
			info += "Reprovado!";
		}
		return info;
	}
	
	public double mediaTodosAlunos() {
		double soma = 0;
		for(double nota : notas) {
			soma += nota;
		}
		return soma/4;
	}
	
}
