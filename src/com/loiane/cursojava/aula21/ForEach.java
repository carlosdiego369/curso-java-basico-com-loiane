package com.loiane.cursojava.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {

		
		int [] notas = new int [10];
		
		Random random = new Random();
		
		double [][] notasAlunos = new double [3][4];
		
		for(int i = 0; i < notas.length; i++) {
		notas[i] = random.nextInt(10);
		};
		
		for(int nota : notas) {
			System.out.print(nota + " ");
		}
		
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
		
		for(double[] notasAluno : notasAlunos) {
			for(double nota : notasAluno) {
				System.out.print(nota + " ");
			}
			System.out.println();
		}
		
		
	}

}
