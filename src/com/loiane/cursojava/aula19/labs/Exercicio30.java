package com.loiane.cursojava.aula19.labs;

import java.util.Random;

public class Exercicio30 {

	public static void main(String[] args) {

		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		int posB = 0, posC = 0;
		
		Random random = new Random();
		// Scanner input = new Scanner(System.in);

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = random.nextInt(10);

			if (vetorA[i] % 2 == 0) {
				vetorB[posB] = vetorA[i];
				posB++;
			} else {
				vetorC[posC] = vetorA[i];
				posC++;
			}
		}
		System.out.print("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.print("Vetor B: ");
		for (int i = 0; i < posB; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();

		System.out.print("Vetor C: ");
		for (int i = 0; i < posC; i++) {
			System.out.print(vetorC[i] + " ");
		}
		System.out.println();

	}
}
