package com.loiane.cursojava.aula33.labs;

import java.util.Random;
import java.util.Scanner;

public class CursoController {

	Curso curso = new Curso();

	Scanner input;
	Random random;

	public CursoController(Scanner scanner, Random random) {
		this.input = scanner;
		this.random = random;
	}

	public String input(String text) {
		System.out.println(text);
		return input.nextLine();
	}

	public int geradorMatricula() {
		return random.nextInt(99999);
	}

	public String cadastrarGrauEscolaridade(String escolaridade) {
		System.out.println("Informe o grau de escolaridade");
		curso.setGrauEscolaridade(input.next());
		return curso.getGrauEscolaridade();
	}

	public String cadastrarAluno(String nome) {
		System.out.println("Informe o nome do aluno: ");
		curso.setNmAluno(input.next());
		return curso.getNmAluno();
	}

	public String[] cadastrarDisciplinas() {
		for (int i = 0; i < curso.getNmDisciplinas().length; i++) {
			System.out.println("Informe o nome da " + (i + 1) + "ª disciplina");
			setNomeDisciplinaPos(i, input.next());
		}
		return curso.getNmDisciplinas();
	}

	public double[][] cadastrarNotas(double[][] notas) {
		for (int i = 0; i < curso.getNmDisciplinas().length; i++) {
			for (int j = 0; j < curso.getNotasAluno()[i].length; j++) {
				System.out.println("Informe a " + (i + 1) + "ª nota da disciplina de " + curso.getNmDisciplinas()[i]);
				setNotaPosIJ(i, j, input.nextDouble());
			}
		}
		return curso.getNotasAluno();
	}

	void showForm() {
		curso.text += "Nome do Aluno: " + curso.getNmAluno() + "\n";
		//curso.text += "Matricula: " + curso.matricula + "\n";
		curso.text += "Nome do Curso: " + curso.getGrauEscolaridade() + "\n";

		for (int i = 0; i < curso.getNmDisciplinas().length; i++) {
			curso.text += curso.getNmDisciplinas()[i] + ": ";
			for (int j = 0; j < curso.getNotasAluno()[i].length; j++) {
				curso.text += curso.getNotasAluno()[i][j] + "  ";
			}
			curso.text += "\n";

		}

		for (int i = 0; i < curso.getNmDisciplinas().length; i++) {
			if (verificarAprovado(i)) {
				curso.text += "Disciplina " + curso.getNmDisciplinas()[i] + " - Foi Aprovado \n";
			} else {
				curso.text += "Disciplina " + curso.getNmDisciplinas()[i] + " - Foi Reprovado \n";
			}
		}
		System.out.println(curso.text);
	}

	boolean verificarAprovado(int indice) {
		int soma = 0, media;
		
		for (int i = 0; i < curso.getNotasAluno()[indice].length; i++) {
			soma += curso.getNotasAluno()[indice][i];
		}
		media = soma / 4;
		if (media >= 7) {
			soma = 0;
			return true;
		}
		soma = 0;
		return false;
	}
	
	public void setNomeDisciplinaPos(int pos, String nmDisciplinas) {
		curso.nmDisciplinas[pos] = nmDisciplinas;
	}
	
	public void setNotaPosIJ(int posI, int posJ, double nota) {
		curso.notasAluno[posI][posJ] = nota;
	}
}
