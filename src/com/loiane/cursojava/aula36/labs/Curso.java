package com.loiane.cursojava.aula36.labs;

import java.util.ArrayList;
import java.util.Scanner;

public class Curso {

	private String nome;
	private String horario;
	private Professor professor;
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	Professor p = new Professor();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void addAlunos(Aluno aluno) {
		this.alunos.add(aluno);
	}

	public void showText(String text) {
		System.out.print(text);
	}
	
	
	public String input(String text) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println(text);
		return input.nextLine();
	}

	public double inputNotas(String text) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println(text);
		return input.nextDouble();
	}
	
	public String infoCurso() {
		String info = "Nome do Curso = " + getNome() + "\n";
		if(p != null) {
			info += p.infoProfessor();
		}
		
		if(alunos != null) {
			for(Aluno aluno : alunos) {
				if(aluno != null) {
				info += aluno.infoAluno();
				info += "\n";
				}
			}
			info += "\nMédia dos Alunos: " + mediaDosAlunos();
		}
		return info;
	}
	
	public double mediaDosAlunos() {
		double soma = 0;
		for(Aluno aluno : alunos) {
			if(aluno != null) {
				soma += aluno.mediaTodosAlunos();
			}
		}
		return soma/alunos.size();
		
	}

}
