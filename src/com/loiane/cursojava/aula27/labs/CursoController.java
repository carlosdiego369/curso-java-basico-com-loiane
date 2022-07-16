package com.loiane.cursojava.aula27.labs;

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

	String input(String text) {
		System.out.println(text);
		return input.nextLine();

	}

	int geradorMatricula() {
		return random.nextInt(99999);
	}

	String cadastrarGrauEscolaridade(String escolaridade) {
		System.out.println("Informe o grau de escolaridade");
		curso.grauEscolaridade = input.nextLine();
		return escolaridade;
	}

	String cadastrarAluno(String nome) {
		System.out.println("Informe o nome do aluno: ");
		curso.nmAluno = input.nextLine();
		return nome;
	}

	String[] cadastrarDisciplinas(String[] disciplinas) {
		for (int i = 0; i < curso.nmDisciplinas.length; i++) {
			System.out.println("informe a " + (i + 1) + "ª  disciplina");
			curso.nmDisciplinas[i] = input.next();
		}

		return disciplinas;

	}

	double[] cadastrarNotas(double[] notas, String[] disciplinas) {

		boolean validaNota = false;
		while (!validaNota) {
			for (int i = 0; i < curso.notasAluno.length; i++) {
				System.out.println("Digite a nota da materia de " + curso.nmDisciplinas[i]);
				curso.notasAluno[i] = input.nextDouble();

				if (curso.notasAluno[i] < 0 || curso.notasAluno[i] > 10) {
					System.out.println("Um dos valor inserido está inválido, digite notamente");
					i--;
					validaNota = false;
				} else {
					validaNota = true;
				}
			}
		}
		return notas;
	}

	String validarAprovacao(Curso curso) {
		String texto = "";
		for (int i = 0; i < curso.notasAluno.length; i++) {
			if (curso.notasAluno[i] > 7) {
				texto += curso.nmDisciplinas[i] + ": " + curso.notasAluno[i] + " = Aprovado\n";
			} else {
				texto += curso.nmDisciplinas[i] + ": " + curso.notasAluno[i] + " = Reprovado\n";
			}
		}
		return texto;
	}

}
