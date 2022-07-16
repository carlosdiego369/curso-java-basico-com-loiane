package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o " + (i + 1) + "º Elemento do vetor");
			vetorA[i] = input.nextInt();

			if (vetorA[i] % 2 == 0) {
				vetorB[i] = 1;
			} else if (vetorA[i] % 2 == 1) {
				vetorB[i] = 0;
			}
		}

		System.out.print("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + ": ");
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();

	}

}
