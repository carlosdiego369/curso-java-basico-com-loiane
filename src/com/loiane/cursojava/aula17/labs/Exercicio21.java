package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner chave = new Scanner(System.in);

		int turma, alunos, res = 0;
		boolean validador = false;

		System.out.println("Digite a quantidade de Turmas: ");
		turma = chave.nextInt();

		for (int cont = 1; cont <= turma; cont++) {
			do {
				System.out.println("Digite o valor de alunos para " + cont + "�  Turma");
				alunos = chave.nextInt();
				if (alunos <= 40) {
					validador = true;
				} else
					System.out.println("N�mero de alunos inv�lido. Digite novamente!");
					
			} while (validador);

			res += alunos;
			if (cont == turma) {
				System.out.println("O resultado da m�dia das " + turma + " turmas �: " + res / turma);

				if (turma > 40) {
					System.out.println();
				}
			}
		}

	}

}
