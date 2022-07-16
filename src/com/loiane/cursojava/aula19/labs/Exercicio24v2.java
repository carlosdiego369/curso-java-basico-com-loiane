package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio24v2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[4];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o " + (i + 1) + "� Elemento do Vetor");
			vetorA[i] = input.nextInt();
		}

		boolean validador = true;
		for (int i = 0; i < (vetorA.length / 2); i++) {

			if (vetorA[i] == vetorA[vetorA.length - 1 - i]) {
				validador = false;
				break;
			}
		}

		System.out.print("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");

		}
		System.out.println();

		if (!validador) {
			System.out.println("� palindromo");
		} else {
			System.out.println("N�o � palindromo");
		}

	}

}
