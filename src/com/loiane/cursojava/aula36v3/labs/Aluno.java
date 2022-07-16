package com.loiane.cursojava.aula36v3.labs;

public class Aluno {
	
	private String nmAluno;
	private String matricula;
	private double [] notas;
	
	public String getNmAluno() {
		return nmAluno;
	}
	public void setNmAluno(String nmAluno) {
		this.nmAluno = nmAluno;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public String infoAluno() {
		String info = "Nome Aluno " + nmAluno + "\n";
		info += "Nota: ";
		double soma = 0;
		for(double nota: notas) {
			soma += nota;
			info += nota + " ";
		}
		
		double media = soma / 4;
		info += "\n" + "Media: " + media + "\n";
		if(media >= 7) {
			info += "Aprovado!";
		}else {
			info += "Reprovado!";
		}
		
		return info;
	}
	
	public double mediaClasse() {
		double soma = 0;
		for(double nota: notas) {
			soma += nota;
		}
		return soma / getNotas().length;
	}
}
