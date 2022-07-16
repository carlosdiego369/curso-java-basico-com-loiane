package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double[] alunos = new double[2];
		double[] notas1 = new double[alunos.length];
		double[] notas2 = new double[alunos.length];
		double[] result = new double[alunos.length];
		double media;

		for (int i = 0; i < alunos.length; i++) {
			System.out.println("Nota do " + (i + 1) + " ª aluno: Digite o valor da " + (i + 1) + " ª nota");
			notas1[i] = input.nextDouble();
			System.out.println("Nota do " + (i + 1) + " ª aluno: Digite o valor da " + (i + 1) + " ª nota");
			notas2[i] = input.nextDouble();
			
			result[i] = notas1[i] + notas2[i];
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.println("Soma das notas do " + (i + 1) + "ª Aluno: " + result[i]);
			media = result[i] / 2;
			System.out.println("Media do " + (i + 1) + " ª Aluno: " + media);
			
			if(media < 7) {
				System.out.println("Aluno reprovado!\n");
			}else {
				System.out.println("Aluno aprovado!\n");
			}
		}

	}

}
