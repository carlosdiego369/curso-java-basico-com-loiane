package com.loiane.cursojava.aula27v2.labs;

import java.util.Scanner;

public class AlunoController {

	Aluno aluno = new Aluno();

	Scanner input;

	public AlunoController(Scanner scanner) {

		input = scanner;
	}

	String cadastrarNome(String nome) {
		System.out.println("Informe o nome do aluno: ");
		return aluno.nome = input.nextLine();
	}

	String cadastrarCurso(String curso) {
		System.out.println("Informe o nome do curso: ");
		return aluno.nomeCurso = input.nextLine();
	}

	String cadastrarMatricula(String matricula) {
		System.out.println("Informe a matricula: ");
		return aluno.matricula = input.nextLine();
	}

	String[] cadastrarDisciplinas(String[] disciplinas) {
		for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
			System.out.println("Informe o nome da " + (i + 1) + "ª disciplina");
			aluno.nomeDisciplinas[i] = input.next();
		}
		return disciplinas;

	}

	double[][] cadastrarNotas(double[][] notas) {
		for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
			for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
				System.out.println("Informe a " + (i + 1) + "ª nota da disciplina de " + aluno.nomeDisciplinas[i]);
				aluno.notasDisciplinas[i][j] = input.nextDouble();
			}
		}
		return notas;
	}

	void showForm() {
		aluno.text += "Nome do Aluno: " + aluno.nome + "\n";
		aluno.text += "Matricula: " + aluno.matricula + "\n";
		aluno.text += "Nome do Curso: " + aluno.nomeCurso + "\n";

		for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
			aluno.text += aluno.nomeDisciplinas[i] + ": ";
			for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
				aluno.text += aluno.notasDisciplinas[i][j] + "  ";
			}
			aluno.text += "\n";
			
		}

		for(int i = 0; i < aluno.nomeDisciplinas.length;i++) {
			if(verificarAprovado(i)) {
				aluno.text += "Disciplina " + aluno.nomeDisciplinas[i] + " - Foi Aprovado \n";
			}else {
				aluno.text += "Disciplina " + aluno.nomeDisciplinas[i] + " - Foi Reprovado \n";
			}
		}
		System.out.println(aluno.text);
	}

	boolean verificarAprovado(int indice) {
		for (int i = 0; i < aluno.notasDisciplinas[indice].length; i++) {
			aluno.soma += aluno.notasDisciplinas[indice][i];
		}
		aluno.media = aluno.soma / 4;
		if (aluno.media >= 7) {
			aluno.soma = 0;
			return true;
		}
		aluno.soma = 0;
		return false;
	}

}
