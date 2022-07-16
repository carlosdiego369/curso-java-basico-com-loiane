package com.loiane.cursojava.aula36v2.labs.curso;

import java.util.Random;
import java.util.Scanner;

public class AlunoController {

	public String input(String text) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print(text);
		return input.nextLine();
	}

	public double inputDouble(String text) {
		@SuppressWarnings("resource")
		Scanner inputDouble = new Scanner(System.in);
		System.out.print(text);
		return inputDouble.nextDouble();

	}

	public int geradorMatricula() {
		Random random = new Random();
		return random.nextInt(99999);
	}

	public Aluno[] definirDadosAlunos(Curso c) {

		Aluno[] alunos = new Aluno[2];

		for (int i = 0; i < alunos.length; i++) {

			Aluno a = new Aluno();

			a.setNmAluno(input("Digite o nome do " + (i + 1) + "º aluno: "));
			a.setMatricula(geradorMatricula());
			System.out.print("Matricula do Aluno: " + a.getMatricula() + "\n");

			double[] notas = new double[4];

			for (int j = 0; j < notas.length; j++) {

				notas[j] = inputDouble("Digite a " + (j + 1) + "ª nota do aluno: ");
			}
			a.setNotas(notas);
			alunos[i] = a;
			c.setAlunos(alunos);

			System.out.println();
		}

		return alunos;
	}
}
