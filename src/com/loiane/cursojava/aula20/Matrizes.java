package com.loiane.cursojava.aula20;

public class Matrizes {

	public static void main(String[] args) {

		double[][] notasAlunos = new double[3][4];

		notasAlunos[0][0] = 6;
		notasAlunos[0][1] = 4;
		notasAlunos[0][2] = 2;
		notasAlunos[0][3] = 0;

		notasAlunos[1][0] = 1;
		notasAlunos[1][1] = 7;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 7;

		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 8;
		notasAlunos[2][2] = 8;
		notasAlunos[2][3] = 8;
		
		notasAlunos[1][2] = 9;

		double soma = 0;
		for (int i = 0; i < notasAlunos.length; i++) {
			soma = 0;
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.println("Aluno: " + (i + 1) + " nota " + (j + 1) + " = " + notasAlunos[i][j]);
				soma += notasAlunos[i][j];
			}

			System.out.println("Media do aluno: " + i + " é = " + (soma / 4));
			System.out.println();
		}

	}
}
