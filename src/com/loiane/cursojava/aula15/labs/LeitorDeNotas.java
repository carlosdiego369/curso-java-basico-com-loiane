package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class LeitorDeNotas {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);

		System.out.println("Programa de leitura de notas");

		System.out.println("Entre com a primeira nota do aluno: ");
		double nota1 = programa.nextDouble();

		System.out.println("Entre com a segunda nota do aluno: ");
		double nota2 = programa.nextDouble();

		double media = nota1 + nota2 / 2;

		if (media >= 7) {
			System.out.println("Media alcançada! " + media);
		} else if (media <= 7) {
			System.out.println("Reprovado!");

		} else if (media == 10) {

			System.out.println("Aprovado com Distinção");
		}

	}

}
